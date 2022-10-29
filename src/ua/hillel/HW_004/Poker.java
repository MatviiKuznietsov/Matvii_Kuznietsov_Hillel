package ua.hillel.HW_004;

import java.util.Arrays;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        Random mast = new Random();
        Random cart = new Random();
        Random cartIndex = new Random();
        String[][] cards = {
                {"D_Two", "D_Three", "D_Four", "D_Fifth", "D_Six", "D_Seven", "D_Eight", "D_Nine", "D_Ten", "D_Valet", "D_Dama", "D_Korol", "D_Tus"},
                {"H_Two", "H_Three", "H_Four", "H_Fifth", "H_Six", "H_Seven", "H_Eight", "H_Nine", "H_Ten", "H_Valet", "H_Dama", "H_Korol", "H_Tus"},
                {"C_Two", "C_Three", "C_Four", "C_Fifth", "C_Six", "C_Seven", "C_Eight", "C_Nine", "C_Ten", "C_Valet", "C_Dama", "C_Korol", "C_Tus"},
                {"S_Two", "S_Three", "S_Four", "S_Fifth", "S_Six", "S_Seven", "S_Eight", "S_Nine", "S_Ten", "S_Valet", "S_Dama", "S_Korol", "S_Tus"}};
        String[] playerCards = new String[20];
        int count = 0;
        int[] cardIndex = new int[20]; // fill card Index mass
        for (int x = 0; x < 20; x++) {
            int cart1 = cart.nextInt(13);
            cardIndex[x] = cart1;
        }
        for (int i2 = 0; i2 < 20 - 1; i2++) { //fill not consecutive array1
            if (cardIndex[i2 + 1] == cardIndex[i2] + 1) {
                cardIndex[i2 + 1] = cartIndex.nextInt(13);
            }
        }
        for (int i = 0; i < 4; i++) { //fill array
            for (int i2 = 0; i2 < 5; i2++) {
                int mast1 = mast.nextInt(4);
                playerCards[count] = cards[mast1][cardIndex[i2]];
                count++;
            }
        }
        Random random1 = new Random();
        for (int i2 = 0; i2 < 20; i2++) { //Fill array without repeat
            //System.out.println(i2);
            for (int i3 = i2 + 1; i3 < 20; i3++) {
                if (playerCards[i2] == playerCards[i3]) {
                    int randomNum1 = random1.nextInt(4);
                    int randomNum2 = random1.nextInt(13);
                    playerCards[i3] = cards[randomNum1][randomNum2];
                }
            }
        }
        for (int i = 1; i <= 4; i++) { //fill array
            switch (i) {
                case 1:
                    for (int i2 = 0; i2 <= 4; i2++) {
                        System.out.println("Player " + i + " get card " + playerCards[i2]);
                    }
                    break;
                case 2:
                    for (int i2 = 5; i2 <= 9; i2++) {
                        System.out.println("Player " + i + " get card " + playerCards[i2]);
                    }
                    break;
                case 3:
                    for (int i2 = 10; i2 <= 14; i2++) {
                        System.out.println("Player " + i + " get card " + playerCards[i2]);
                    }
                    break;
                case 4:
                    for (int i2 = 15; i2 < 19; i2++) {
                        System.out.println("Player " + i + " get card " + playerCards[i2]);
                    }
                    break;
            }
        }

    }
}
