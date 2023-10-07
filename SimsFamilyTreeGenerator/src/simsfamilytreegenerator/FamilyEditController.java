/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simsfamilytreegenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bear
 */
public class FamilyEditController implements Initializable {
    
    @FXML
    private ComboBox<Sim> familyRoot;
    
    @FXML
    private TextField familyName;
    
    @FXML
    private Label errorMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO initialize to initial values 
        familyName.setText(Family.getFamily().getFamilyName());
        familyRoot.setItems(FXCollections.observableList(Family.getFamily().getAllFamilyMembers()));
    }    
    
    @FXML
    private void clearError() {
        errorMessage.setText(" ");
    }
    
    @FXML
    private void saveAndClose(ActionEvent event) {
        if(familyName.getText().length() > 0) {
            if(Family.getFamily().getAllFamilyMembers().size() > 0){
                Family.getFamily().saveFamily(familyName.getText(), familyRoot.getValue());
            } else {
                Family.getFamily().saveFamily(familyName.getText(), null);
            }
            Stage stage = (Stage)familyRoot.getScene().getWindow();
            stage.close();  
        } else {
            errorMessage.setText("Error: FamilyName cannot be empty.");
        }
    }
    
    @FXML
    private void cancel(ActionEvent event) {
        Stage stage = (Stage)familyRoot.getScene().getWindow();
        stage.close();
    }
}
