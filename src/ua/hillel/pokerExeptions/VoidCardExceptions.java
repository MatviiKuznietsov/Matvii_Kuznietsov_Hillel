package ua.hillel.pokerExeptions;

public class VoidCardExceptions extends Exception {
    public VoidCardExceptions(String nameCard){
        super("The card is " + nameCard + " void");
    }
}
