package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                connection = DriverManager.getConnection(url,props);
            } catch (SQLException ex) {
               throw new DBException(ex.getMessage());
            }
        }
        return connection;
    }
    
    
    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        }catch(IOException ex){
            throw new DBException(ex.getMessage());
        }
    }
    
    public static void closeStatement(Statement st){
        if(st != null){
            try {
            st.close();
            } catch (SQLException ex) {
                throw new DBException(ex.getMessage());
            }
        }
    }
    
    public static void closeResultSet(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new DBException(ex.getMessage());
            }
        }
    }
}