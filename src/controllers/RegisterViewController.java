package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import services.UserService;

public class RegisterViewController implements Initializable {

    @FXML
    private Button btnRegister;
    @FXML
    private TextField name;
    @FXML
    private TextField password;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void registerUser(){
        UserService.registerUser(name.getText(),password.getText());
    }
    
}
