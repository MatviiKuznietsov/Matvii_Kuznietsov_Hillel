package ua.hillel.pokerExeptions;

public class MethodsPokerExceptions {
    public void CheckJoker(String[] card) throws JokerException {
        try {
            for (int i = 0; i < 20; i++) {
                if (card[i] == "Joker") {
                    throw new JokerException(card[i]);
                }
            }
        } catch (JokerException jokerException) {
            jokerException.printStackTrace();
        }
    }

    public void CheckVoidCard(String[] card) throws VoidCardExceptions {
        try {
            for (int i = 0; i < 20; i++) {
                if (card[i] == "NULL") {
                    throw new VoidCardExceptions(card[i]);
                }
            }
        } catch (VoidCardExceptions voidCardExceptions) {
            voidCardExceptions.printStackTrace();
        }

    }

    public void CheckCountCard(int count) throws NotEnoughCardsException {
        try {
            if (count < 52) {
                throw new NotEnoughCardsException(count);
            }
        } catch (NotEnoughCardsException notEnoughCardsException) {
            System.out.println(ConsoleColors.RED_BOLD + "Error");
            notEnoughCardsException.printStackTrace();
        }
    }
}
