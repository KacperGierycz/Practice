package enums;

public class Deck3 {
    private static Card3[] cards = new Card3[52];
    public Deck3() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card3(rank, suit);
            }
        }
    }

    public static void printDeck(){
       for( Card3 card : cards){
           System.out.println(card.getRank() + " " + card.getSuit());
       }
     }

    public static void main(String[] args) {
        Deck3 d = new Deck3();
        d.printDeck();
    }
}
