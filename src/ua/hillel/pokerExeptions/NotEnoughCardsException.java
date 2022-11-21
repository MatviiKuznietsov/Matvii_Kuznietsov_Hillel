package ua.hillel.pokerExeptions;

public class NotEnoughCardsException extends Exception {
    public NotEnoughCardsException(int numberCard) {
        super("The quantity of cards is  " + numberCard);
    }
}

