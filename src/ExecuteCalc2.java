import java.util.Scanner;

public class ExecuteCalc2 {
    public static void main(String[] args) {
        System.out.println("Choose type of calculator ");
        System.out.println("Basic / Exponential / Trigonometric");
        String typeCalc = new Scanner(System.in).nextLine();
        switch (typeCalc) {
            case "Basic":
                CalcBasic calcBasic = new CalcBasic();
                calcBasic.repeatCalc();
                break;
            case "Exponential":
                CalcExponentialFunctions calcExponentialFunctions = new CalcExponentialFunctions();
                calcExponentialFunctions.repeatCalc();
                break;
            case "Trigonometric":
                CalcTrigonometricFunctions calcTrigonometricFunctions = new CalcTrigonometricFunctions();
                calcTrigonometricFunctions.repeatCalc();
                break;
        }
    }
}
