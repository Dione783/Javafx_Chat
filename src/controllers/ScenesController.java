package controllers;

import gui.enums.SceneEnum;
import gui.loader.StyleLoader;
import gui.loader.ViewLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ScenesController {
    private static Scene loginScene;
    private static Scene registerScene;
    private static Scene roomScene;
    private Stage stage;
    private static SceneEnum sceneE;
    private static StyleLoader styles;
    private static ViewLoader views;
    
    public ScenesController(Stage stage){
        this.stage=stage;
        stage.setTitle("Chat Application");
        System.out.println("Resource Path:"+getClass());
        views = new ViewLoader();
        styles = new StyleLoader();
        
        loginScene = new Scene (views.getLogin());
        registerScene = new Scene(views.getRegister());
        roomScene = new Scene(views.getRoom());
        
        loginScene.getStylesheets().add(styles.getLoginCss());
        registerScene.getStylesheets().add(styles.getRegisterCss());
        roomScene.getStylesheets().add(styles.getRoomCss());
        stage.setScene(loginScene);
        stage.show();
    }
    
        public void setScene(String scene){
        switch(scene){
            case "Login":
                stage.setScene(loginScene);
                //sceneE = SceneEnum.Login;
            break;
            case "Register":
                stage.setScene(registerScene);
                //sceneE = SceneEnum.Register;
            break;
            case "Room":
                stage.setScene(roomScene);
                //sceneE = SceneEnum.Room;
            break;
        }
    }
}
