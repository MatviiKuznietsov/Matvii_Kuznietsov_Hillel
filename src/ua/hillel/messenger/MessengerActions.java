package ua.hillel.messenger;

public class MessengerActions {
    public static void main(String[] args) {
        MessangerPage messangerPage = new MessangerPage();
        messangerPage.createMessage();
        messangerPage.sendingMessage();
        messangerPage.correctMessage();
        messangerPage.notsendingMessage();
        messangerPage.deleteMessage();


    }
}
