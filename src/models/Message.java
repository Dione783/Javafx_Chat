package models;

public class Message {
    private int MessageId;
    private int RoomId;
    private int SenderId;
    private String content;

    public Message(int MessageId, int RoomId, int SenderId, String content) {
        this.MessageId = MessageId;
        this.RoomId = RoomId;
        this.SenderId = SenderId;
        this.content = content;
    }
    
    
}