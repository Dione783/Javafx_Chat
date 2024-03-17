package javafxapplication1;

import controllers.ScenesLoader;
import java.sql.Connection;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage stage) {
        Connection conn = null;
        ScenesLoader.loadAllSources(stage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}