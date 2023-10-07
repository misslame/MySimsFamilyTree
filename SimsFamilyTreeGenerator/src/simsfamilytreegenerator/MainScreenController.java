/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simsfamilytreegenerator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Bear
 */
public class MainScreenController implements Initializable {
    
    @FXML
    private TitledPane familyAccordion;
    
    @FXML
    private void openEditFamily(ActionEvent event) throws Exception {
        FXMLLoader root = new FXMLLoader( getClass().getResource("FamilyEdit.fxml"));
        Scene scene = new Scene(root.load());
        
        Stage window = new Stage();
        window.initModality(Modality.WINDOW_MODAL);
        window.setResizable(false);
        window.setScene(scene);
        window.show();
    }
    
    @FXML 
    private void openAddToFamily(ActionEvent event) throws Exception {
        FXMLLoader root = new FXMLLoader( getClass().getResource("AddToFamily.fxml"));
        Scene scene = new Scene(root.load());
        
        Stage window = new Stage();
        window.initModality(Modality.WINDOW_MODAL);
        window.setResizable(false);
        window.setScene(scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
