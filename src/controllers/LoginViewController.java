package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        //JavaFXApplication1.sc.setScene("Room");
    }
    
    public void btnActionRegister(){
        //JavaFXApplication1.sc.setScene("Register");
    }

    @Override
    public void initialize(URL url,ResourceBundle res) {
        
    }
}