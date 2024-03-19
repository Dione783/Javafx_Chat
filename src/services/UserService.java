package services;

import database.DB;
import database.DBException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import models.User;

public class UserService {
    private static PreparedStatement st;
    private static Connection conn;
    private static Map<Integer,User> usersLogged = new HashMap<Integer,User>();
    private static User user;
    
    public static void registerUser(String userName,String password){
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO users "+"(Username,Password)" + "VALUES (?,?)");
            if(userName.isEmpty() || password.isEmpty()){
                throw new DBException("Valor vazio invalido!");
            }else{
                st.setString(1,userName);
                st.setString(2,password);
                int rowsAffected = st.executeUpdate();
                System.out.println("Done! Rows Affected" + rowsAffected);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            DB.closeStatement(st);
        }
    }
    
    public static boolean verifyUser(String userName,String password){
        boolean searchResult = false;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement("SELECT * FROM users");
            ResultSet rs = st.executeQuery();
            String name = "";
            String pass = "";
            while (rs.next()) {
                name = rs.getString("Username");
                pass = rs.getString("Password");
                if(userName.equals(name) && password.equals(pass)){
                    searchResult=true;
                    user = new User(rs.getInt("UserId"),rs.getString("Username"),rs.getString("Password"));
                    usersLogged.put(rs.getInt("UserId"),new User(rs.getInt("UserId"),rs.getString("Username"),rs.getString("Password")));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            DB.closeStatement(st);
        }
        return searchResult;
    }
    
    public static Map<Integer,User> getUsers(){
        return usersLogged;
    }
    
    public static User getMyUser(){
        return user;
    }
}