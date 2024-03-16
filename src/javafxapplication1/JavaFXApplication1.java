package javafxapplication1;

import controllers.ScenesLoader;
import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage stage) {
        ScenesLoader.loadAllSources();
    }
    
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            launch(args);
            
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO users "+"(Username,Password)"+"VALUES (?,?)");
            st.setString(1,"Fulano");
            st.setString(2,"123");
            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows Affected" + rowsAffected);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            DB.closeStatement(st);
        }
    }
}