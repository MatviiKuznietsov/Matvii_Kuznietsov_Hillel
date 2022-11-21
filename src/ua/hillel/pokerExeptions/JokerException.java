package ua.hillel.pokerExeptions;

public class JokerException extends RuntimeException {
    public JokerException(String card) {
        super(card + " Is Forbidden");
    }
}
