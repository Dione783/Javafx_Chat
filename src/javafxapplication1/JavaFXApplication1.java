package javafxapplication1;

import controllers.ScenesLoader;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage stage) {
        ScenesLoader.loadAllSources();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}