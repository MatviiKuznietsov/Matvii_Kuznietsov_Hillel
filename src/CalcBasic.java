import java.util.Scanner;

public class CalcBasic {
    Double number1;
    Double number2;
    String operation;


    public void setNumbers() {
        System.out.println("Input number1");
        this.number1 = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Input number2");
        this.number2 = Double.valueOf(new Scanner(System.in).nextLine());
    }

    public void setNumbers(int exp) {
        System.out.println("Input number1");
        this.number1 = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Input degree of exponentiation");
        this.number2 = Double.valueOf(new Scanner(System.in).nextLine());
    }

    public void setNumbers(int sqrt, int log) {
        System.out.println("Input number");
        this.number2 = Double.valueOf(new Scanner(System.in).nextLine());
    }

    public void setOperation() {
        System.out.println("Input Operation");
        this.operation = new Scanner(System.in).nextLine();
    }

    public void executeOperation() {
        switch (operation) {
            case "+":
                getSumm();
                break;
            case "-":
                getSub();
                break;
            case "*":
                getMultiplication();
                break;
            case "/":
                getDivision();
                break;
        }

    }

    public void getSumm() {
        System.out.println(number1 + number2);
    }

    public void getSub() {
        System.out.println(number1 - number2);
    }

    public void getMultiplication() {
        System.out.println(number1 + number2);
    }

    public void getDivision() {
        if (number2 == 0) {
            System.out.println("Operation impossible");
        } else {
            System.out.println(number1 + number2);
        }

    }

    public void repeatCalc() {
        String count = "Yes";
        for (; count.equals("Yes"); ) {
            setNumbers();
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

}

