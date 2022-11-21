package ua.hillel.pokerExeptions;

public class Working_machine {
    public static void main(String[] args) throws VoidCardExceptions, NotEnoughCardsException {
        Poker_machine poker_machine1 = new Poker_machine();
        MethodsPokerExceptions methodsPokerExceptions = new MethodsPokerExceptions();

        int countCard = poker_machine1.countCard();
        methodsPokerExceptions.CheckCountCard(countCard);

        int[] cardIndex = poker_machine1.fillCardIndex();
        cardIndex = poker_machine1.shuffleCardIndex(cardIndex);
        String[] playerCards = poker_machine1.fillCard(cardIndex);
        playerCards = poker_machine1.shuffleCards(playerCards);

        methodsPokerExceptions.CheckJoker(playerCards);
        methodsPokerExceptions.CheckVoidCard(playerCards);

        poker_machine1.cardDistribution(playerCards);
    }
}