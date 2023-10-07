/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simsfamilytreegenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bear
 */
public class AddToFamilyController implements Initializable {

    @FXML 
    private TextField nameField;
    
    @FXML
    private TextArea descriptionField;
    
    @FXML 
    private RadioButton femaleRadio;
    
    @FXML
    private RadioButton maleRadio;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void clickFemale() {
        maleRadio.setSelected(false);
    }
    
    @FXML
    private void clickMale() {
        femaleRadio.setSelected(false);
    }
    
    @FXML
    private void saveAndClose() {
        Sim newSim; 
        char sex = 'X';
        
        if(nameField.getText().length() > 0) {
            if(femaleRadio.isSelected()) {
                sex = 'F';
            }else if(maleRadio.isSelected()){
                sex = 'M';
            }
            newSim = new Sim(nameField.getText(), sex, " ", descriptionField.getText(), null, null, null, null);
            Family.getFamily().addFamilyMember(newSim);
            Stage stage = (Stage)nameField.getScene().getWindow();
            stage.close();
        }
    }
    
    @FXML
    private void cancel() {
        Stage stage = (Stage)nameField.getScene().getWindow();
        stage.close(); 
    }
}
