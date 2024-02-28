package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class RoomViewController implements Initializable {
    
    @FXML
    private ListView messageList;
    @FXML
    private TextArea message;
    @FXML
    private Button btn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void sendMessage(){
        
    }
    
}
