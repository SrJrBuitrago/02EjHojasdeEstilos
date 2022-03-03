/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java 
to edit this template
 */
package es.ideas.ejhojasdeestilos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author SrBlxde
 */
public class PrimaryController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Button bCss1;
    @FXML
    Button bCss2;
    @FXML
    Button bCss3;
    @FXML
    Button bReinicio;
    @FXML
    Button bSalir;
    @FXML
    private Text tPrincipal;
    @FXML
    private AnchorPane aPane;
    
    
    
    @FXML
    private void primerCSS(ActionEvent event){
        aPane.getStylesheets().clear();
        aPane.getStylesheets().add("es/ideas/css/css1.css");
    }
    @FXML
    private void segundoCSS(ActionEvent event){
        aPane.getStylesheets().clear();
        aPane.getStylesheets().add("es/ideas/css/css2.css");
    }
    @FXML
    private void tercerCSS(ActionEvent event){
        aPane.getStylesheets().clear();
        aPane.getStylesheets().add("es/ideas/css/css3.css");
    }
    @FXML
    private void salir(ActionEvent event){
      System.exit(0);
    }
    @FXML
    private void reiniciar(ActionEvent event){
        aPane.getStylesheets().clear();
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
