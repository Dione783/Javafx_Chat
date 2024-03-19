package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import services.UserService;

public class LoginViewController implements Initializable {
    @FXML
    private Button btn;
    @FXML
    private TextField nome;
    @FXML
    private TextField senha;
    @FXML
    private Label registrar;
    
    public void btnActionEnter(){
        //se a senha e nome existirem no banco de dados permitir entrada
        if(UserService.verifyUser(nome.getText(),senha.getText())){
            ScenesLoader.loadNextScene("Room");
        }
    }
    
    public void btnActionRegister(){
        ScenesLoader.loadNextScene("Register");
    }

    @Override
    public void initialize(URL url,ResourceBundle res) {
        
    }
}