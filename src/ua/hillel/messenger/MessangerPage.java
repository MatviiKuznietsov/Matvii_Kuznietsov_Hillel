package ua.hillel.messenger;

public class MessangerPage {

    public void createMessage() {
        Logger.info(MessagesStatus.CREATE.getStatus());
    }

    public void sendingMessage() {
        Logger.info(MessagesStatus.SEND.getStatus());

    }

    public void correctMessage() {
        Logger.debug(MessagesStatus.CORRECT.getStatus());
    }

    public void notsendingMessage() {
        Logger.warn(MessagesStatus.NOT_SEND.getStatus());
    }

    public void deleteMessage() {
        Logger.error(MessagesStatus.DELETE.getStatus());
    }


}
