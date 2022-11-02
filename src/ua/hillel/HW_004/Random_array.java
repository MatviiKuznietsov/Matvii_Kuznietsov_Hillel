package ua.hillel.HW_004;

import java.util.Arrays;
import java.util.Random;

public class Random_array {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomSizeArray = random1.nextInt(100);
        int[] array1 = new int[randomSizeArray];
        Random randomArrayElements = new Random();
        for (int i = 0; i < randomSizeArray; i++) {
            int randomNum = randomArrayElements.nextInt(100);
            array1[i] = randomNum;
            if (array1[i] % 2 == 0) {
                array1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}

