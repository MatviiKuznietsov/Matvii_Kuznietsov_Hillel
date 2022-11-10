import java.util.Scanner;

public class CalcExponentialFunctions extends CalcBasic {

    @Override
    public void executeOperation() {
        switch (operation) {
            case "exp":
                setNumbers(1);
                getExponentiation();
                break;
            case "sqrt":
                setNumbers(1, 1);
                getRoot();
                break;
            case "log":
                setNumbers(1, 1);
                getLog();
                break;
        }
    }

    @Override
    public void repeatCalc() {
        String count = "Yes";
        for (; count.equals("Yes"); ) {
            System.out.println("Choose operation exp, sqrt, log");
            setOperation();
            executeOperation();
            ;
            System.out.println("Would you like repeat new operation Yes/No");
            count = new Scanner(System.in).nextLine();
            System.out.println(count);
            if (count.equals("No")) {
                System.out.println("Bye, Bye");
            } else if (count.equals("Yes")) {
                System.out.println("Continue");
            } else {
                System.out.println("Wrong input Bye, Bye");
            }
        }
    }

    //----------------------------
    public void getExponentiation() {
        number1 = Math.pow(number1, number2);
        System.out.println("Exponentiation = " + number1);
    }

    public void getRoot() {
        number1 = Math.sqrt(number2);
        System.out.println("Root of " + number2 + " = " + number1);
    }

    public void getLog() {
        number1 = Math.log(number2);
        System.out.println("Log of " + number2 + " = " + number1);
    }

}
