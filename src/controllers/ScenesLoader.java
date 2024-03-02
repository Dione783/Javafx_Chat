/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import gui.loader.StyleLoader;
import gui.loader.ViewLoader;
import javafx.stage.Stage;

public class ScenesLoader {
    //seguindo o principio de encapsulamento e single responsability principe eu não necessito ter esses metodos e variaveis expostos e preciso telos separados em classes com seus devidos nomes
    private static Scene loginScene;
    private static Scene registerScene;
    private static Scene roomScene;
    private static StyleLoader styles;
    private static Stage stage;
    private static ViewLoader views;
    
    public static void loadAllSources(){
        ScenesLoader.stage = new Stage();
        stage.setTitle("Chat Application");
        loadViews();
        loadStyles();
        loadScenes();
        stage.setScene(loginScene.getScene());
        stage.show();
    }
    
    private static void loadViews(){
        views = new ViewLoader();
    }
    
    private static void loadScenes(){
        loginScene = new Scene(views.getLogin(),styles.getLoginCss());
        registerScene = new Scene(views.getRegister(),styles.getRegisterCss());
        roomScene = new Scene(views.getRoom(),styles.getRoomCss());
    }
    
    private static void loadStyles(){
        styles = new StyleLoader();
    }
    
    public static void loadNextScene(){
        
    }
}
