package ua.hillel.HW_003;

import java.util.Scanner;

public class ABS_Numbers {
    public static void main(String[] args) {
        System.out.println("Input number1");
        int n1 = new Scanner(System.in).nextInt();
        System.out.println("Input number2");
        int n2 = new Scanner(System.in).nextInt();
        if (Math.abs(n1) > Math.abs(n2)) {
            System.out.println("Absolute value of number1 more than number2");
        } else if (Math.abs(n1) < Math.abs(n2)) {
            System.out.println("Absolute value of number2 more than number1");
        } else {
            System.out.println("Absolute value number1 equals number2");
        }
    }
}
