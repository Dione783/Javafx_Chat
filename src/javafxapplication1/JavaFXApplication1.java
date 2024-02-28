package javafxapplication1;

import controllers.ScenesController;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {
    public static ScenesController sc;
    
    @Override
    public void start(Stage stage) {
        System.out.println("Path"+this.getClass());
        sc = new ScenesController(stage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}