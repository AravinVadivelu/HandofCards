package cardgametuepm;

/**
 *
 * @author User
 */
    public class Card {
        public enum Suit {
            HEARTS, CLUBS, SPADES, DIAMONDS
        }
        public enum Value {
            ACE, TWO, THREE ,FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
        }
        private Value value;
        private Suit suit;

        public Value getValue(){
            this.value = value;
            this.suit = suit;
        }
        public void setValue(Value value){
            return this.value;
        }

        public Suit getSuit() {
            return suit;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}