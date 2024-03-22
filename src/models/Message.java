package models;

public class Message {
    private int MessageId;

    public int getMessageId() {
        return MessageId;
    }

    public int getRoomId() {
        return RoomId;
    }

    public int getSenderId() {
        return SenderId;
    }

    public String getContent() {
        return content;
    }
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