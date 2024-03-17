package services;

import database.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {
    private static PreparedStatement st;
    private static Connection conn;
    
    public static void registerUser(String userName,String password){
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO users "+"(Username,Password)" + "VALUES (?,?)");
            st.setString(1,userName);
            st.setString(2,password);
            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows Affected" + rowsAffected);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            DB.closeStatement(st);
        }
    }
}