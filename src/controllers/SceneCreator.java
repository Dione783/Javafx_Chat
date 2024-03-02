package controllers;

import javafx.scene.Parent;
import javafx.scene.Scene;

public abstract class SceneCreator {
    private Scene scene;
    private String stylesheet;
    public SceneCreator(Parent fxml,String stylesheet){
        this.scene = new Scene(fxml);
        this.scene.getStylesheets().add(stylesheet);
    }
    
    public Scene getScene(){
        return scene;
    }
    
    public String getStyle(){
        return stylesheet;
    }
}
