import java.util.Scanner;

public class CalcTrigonometricFunctions extends CalcBasic {
    @Override
    public void executeOperation() {
        switch (operation) {
            case "cos(x)":
                setNumbers(1, 1);
                geCosx();
                break;
            case "sin(x)":
                setNumbers(1, 1);
                getSinx();
                break;
            case "tan(x)":
                setNumbers(1, 1);
                getTanx();
                break;
        }
    }

    @Override
    public void repeatCalc() {
        String count = "Yes";
        for (; count.equals("Yes"); ) {
            System.out.println("Choose operation cos(x), sin(x), tan(x)");
            setOperation();
            executeOperation();
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

    //--------------------------------
    public void getSinx() {
        number1 = Math.sin(number2);
        System.out.println("Sin( " + number2 + " ) = " + number1);
    }

    public void geCosx() {
        number1 = Math.sin(number2);
        System.out.println("Cos( " + number2 + " ) = " + number1);
    }

    public void getTanx() {
        number1 = Math.sin(number2);
        System.out.println("Tan( " + number2 + " ) = " + number1);
    }

}
