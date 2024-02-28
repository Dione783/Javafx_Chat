package gui.loader;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class ViewLoader {
    private Parent fxmlLogin;
    private Parent fxmlRegister;
    private Parent fxmlRoom;
    
    public ViewLoader(){
        try {
            fxmlLogin = FXMLLoader.load(getClass().getResource("/gui/login/LoginView.fxml"));
            fxmlRegister = FXMLLoader.load(getClass().getResource("/gui/register/RegisterView.fxml"));
            fxmlRoom = FXMLLoader.load(getClass().getResource("/gui/chat/RoomView.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(ViewLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Parent getLogin(){
        return fxmlLogin;
    }
    
    public Parent getRegister(){
        return fxmlRegister;
    }
    
    public Parent getRoom(){
        return fxmlRoom;
    }
}