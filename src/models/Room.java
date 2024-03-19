package models;

import java.util.Map;

public class Room {
    private Map<Integer,User> participants;
    
    public void addParticipant(int idUser,User user){
        participants.put(idUser,user);
    }
    
    public void addParticipant(Map<Integer,User> allParticipants){
        participants.putAll(allParticipants);
    }
    
    public Map<Integer,User> getParticipants(){
        return participants;
    }
}