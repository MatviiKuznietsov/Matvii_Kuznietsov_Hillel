package ua.hillel.HW_003;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Input number");
        int i = new Scanner(System.in).nextInt();
        if (i % 2 != 0) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
        System.out.println("BYE");
    }
}
