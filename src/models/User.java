package models;

import java.util.List;

public class User{
    private String nome;
    private String password;
    private int id;
    private List<Room> rooms;
    
    public User(int id,String nome,String password){
        this.id=id;
        this.nome=nome;
        this.password=password;
    }
    
    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }
}