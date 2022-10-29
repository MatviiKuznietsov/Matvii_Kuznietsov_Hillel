package ua.hillel.HW_004;

import java.util.Random;

public class AVG {
    public static void main(String[] args) {
        int[] array2 = new int[20];
        Random random1 = new Random();
        int summ = 0;
        for (int i = 0; i < 20; i++) {
            int randomNum1 = random1.nextInt(100);
            array2[i] = randomNum1;
            summ = summ + array2[i];
        }
        System.out.println("Average meaning = " + summ / 20);
    }
}
