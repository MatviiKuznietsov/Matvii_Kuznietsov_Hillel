package ua.hillel.HW_003;

import java.util.Scanner;

public class Trinagle_Isosceles {
    public static void main(String[] args) {
        System.out.println("Input 1st side of triangle");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Input 2nd side of triangle");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Input 3rd side of triangle");
        int z = new Scanner(System.in).nextInt();
        if (x == y || x == z || y == z) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is not isosceles");
        }
    }

}
