package ua.hillel.HW_003;

import java.util.Scanner;

public class PrintMonthInWord_var2 {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        int i = new Scanner(System.in).nextInt();
        if (i == 1) {
            System.out.println("JAN");
        } else if (i == 2) {
            System.out.println("FEB");
        } else if (i == 3) {
            System.out.println("MAR");
        } else if (i == 4) {
            System.out.println("APR");
        } else if (i == 5) {
            System.out.println("MAY");
        } else if (i == 6) {
            System.out.println("JUN");
        } else if (i == 7) {
            System.out.println("JUL");
        } else if (i == 8) {
            System.out.println("AUG");
        } else if (i == 9) {
            System.out.println("SEP");
        } else if (i == 10) {
            System.out.println("OCT");
        } else if (i == 11) {
            System.out.println("NOV");
        } else if (i == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }
    }
}



