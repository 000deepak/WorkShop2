/*
 * workshop 2
 * code for game of cards*/public class DequeOfCards {

    public static String[] suits = {"Hearys", "Club", "Diamond", "Spade"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] cards = new String[52];

    public static void main(String[] args) {
        getCards();
        showCards();


    }

    /*
     * method to get a unique deck of cards
     * */
    static public String[] getCards() {
        int i = 0;
        for (String s : suits) {
            for (String c : rank) {
                cards[i++] = s + c;

            }
        }
        return cards;
    }
    /*method to display cards
    *
    * */
    static public void showCards() {
        int i = 0;
        for (String s : cards) {
            System.out.println(cards[i++]) ;
        }

    }

}
