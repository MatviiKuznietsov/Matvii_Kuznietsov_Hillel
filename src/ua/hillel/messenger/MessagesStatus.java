package ua.hillel.messenger;

public enum MessagesStatus {
    CREATE("Message is created"),
    SEND("Message send"),
    NOT_SEND("Message is`t send"),
    CORRECT("Message is correct"),
    DELETE("Message is deleted");

    private String status;

    MessagesStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
