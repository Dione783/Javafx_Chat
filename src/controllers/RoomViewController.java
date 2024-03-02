package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class RoomViewController implements Initializable {
    
    @FXML
    private ListView<String> messageList;
    ObservableList<String> items;
    @FXML
    private TextArea message;
    @FXML
    private Button btn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items = FXCollections.observableArrayList ();
    }
    
    public void sendMessage(){
        items.add(message.getText());
        messageList.setItems(items);
    }
    
}
