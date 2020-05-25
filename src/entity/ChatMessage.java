package entity;

public class ChatMessage {
    // Текст сообщения
    private String message;
    // Автор сообщения
    private ChatUser author;
    // Временная метка сообщения (в микросекундах)
    private long timemark;

    public ChatMessage(String message, ChatUser author, long timemark) {
        super();
        this.message = message;
        this.author = author;
        this.timemark = timemark;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public ChatUser getAuthor() {
        return author;
    }
    public void setAuthor(ChatUser author) {
        this.author = author;
    }
    public long getTimemark() {
        return timemark;
    }
    public void setTimemark(long timemark) {
        this.timemark = timemark;
    }
}
