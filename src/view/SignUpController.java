/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



/**
 *
 * @author 2dam
 */
public class SignUpController {
    @FXML
        private TextField txtUsername;
    @FXML
        private TextField txtEmail;
    @FXML
        private TextField txtNombre;
    
    @FXML
        private PasswordField txtContrasena;
    @FXML
    
        private Button btnRegistrar;
    @FXML
        private Button btnCancelar;
    @FXML
        private Label lblUsuario;
    @FXML
        private Label lblEmail;
    @FXML
        private Label lblNombre;
    @FXML
        private Label lblContrasena;
}
