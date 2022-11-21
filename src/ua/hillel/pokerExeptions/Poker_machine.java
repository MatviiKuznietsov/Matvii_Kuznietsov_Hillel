package ua.hillel.pokerExeptions;

import java.util.Arrays;
import java.util.Random;

public class Poker_machine {
    String[][] cards = {
            {"D_2", "D_3", "D_4", "D_5", "D_6", "D_7", "D_8", "D_9", "D_10", "D_Val", "D_Dama", "D_Kor", "D_Tus", "Joker"},
            {"H_2", "H_3", "H_4", "H_5", "H_6", "H_7", "H_8", "H_9", "H_10", "H_Val", "H_Dama", "H_Kor", "H_Tus", "Joker"},
            {"C_2", "C_3", "C_4r", "C_5", "C_6", "C_7n", "C_8", "C_9", "C_10", "C_Val", "C_Dama", "C_Kor", "C_Tus", "NULL"},
            {"S_2", "S_3", "S_4", "S_5", "S_6", "S_7", "S_8", "S_9", "S_10", "S_Val", "S_Dama", "S_Kor", "S_Tus", "NULL"}};

    public int countCard() {
        int min = 51;
        int max = 52;
        int diff = max - min;
        Random countCard = new Random();
        int count = countCard.nextInt(diff + 1) + min;
        System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "Quantity of cards " + count + "");
        return count;
    }

    public int[] fillCardIndex() {

        Random cart = new Random();
        int[] cardIndex = new int[20]; // fill card Index mass
        try {
            for (int x = 0; x < 21; x++) {
                int cart1 = cart.nextInt(14);
                cardIndex[x] = cart1;
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(ConsoleColors.BLUE + "Array is too long " + ConsoleColors.RED_BOLD + "Error" + ConsoleColors.PURPLE);
            arrayIndexOutOfBoundsException.printStackTrace();
        } finally {
            // System.out.println("fillCardIndex" + Arrays.toString(cardIndex));
            return cardIndex;
        }
    }

    public int[] shuffleCardIndex(int[] cardIndex) {
        Random cart = new Random();
        // int[] cardIndex = new int[20];
        for (int i2 = 0; i2 < 20 - 1; i2++) { //fill not consecutive array1
            Random cartIndex = new Random();
            if (cardIndex[i2 + 1] == cardIndex[i2] + 1) {
                cardIndex[i2 + 1] = cartIndex.nextInt(14);
            }
        }
        // System.out.println("shuffleCardIndex" + Arrays.toString(cardIndex));
        return cardIndex;
    }

    public String[] fillCard(int[] cardIndex) {
        Random mast = new Random();
        String[] playerCards = new String[20];
        int count = 0;
        for (int i = 0; i < 4; i++) { //fill array
            for (int i2 = 0; i2 < 5; i2++) {
                int mast1 = mast.nextInt(4);
                playerCards[count] = cards[mast1][cardIndex[i2]];
                count++;
            }
        }
        //   System.out.println("fillCard" + Arrays.toString(playerCards));
        return playerCards;
    }

    public String[] shuffleCards(String[] playerCards) {
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
        // System.out.println("shuffleCards" + Arrays.toString(playerCards));
        return playerCards;
    }

    public void cardDistribution(String[] playerCards) {
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