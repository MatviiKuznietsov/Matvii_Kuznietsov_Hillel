package ua.hillel.HW_006;

public class Working_machine {
    public static void main(String[] args) {
        Poker_machine poker_machine1 = new Poker_machine();
        int[] cardIndex = poker_machine1.fillCardIndex();
        cardIndex = poker_machine1.shuffleCardIndex(cardIndex);
        String[] playerCards = poker_machine1.fillCard(cardIndex);
        playerCards = poker_machine1.shuffleCards(playerCards);
        poker_machine1.cardDistribution(playerCards);

    }
}