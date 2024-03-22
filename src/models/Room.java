package models;

import java.util.Map;

public class Room {
    private Map<Integer,Message> messages;
    private int id;
    private String name;

    public Map<Integer, Message> getMessages() {
        return messages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public void setMessages(Message message) {
        this.messages.put(message.getMessageId(),message);
    }
    
    public void setAllMessages(Map<Integer,Message> messages){
        this.messages=messages;
    }
}