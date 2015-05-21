/*
 *  Author: Angel Macias
 *  Class: CIS 18C Instructor: Dr. Lehr
 */
package texasholdem;
import java.util.*;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    private Card card;

    /*===================================================================
    This constructor initializes the deck by taking each suit, then each
    number in that respective suit, and filling the ArrayList(our deck)
    with cards
    ======================================================================*/
    public Deck () {               
        for(Suit s : Suit.values()) {
            for(Rank r : Rank.values()) {
                card = new Card(s,r);
                deck.add(card);
            }
        }       
    }
    //Uses Collections to sort our deck
    public void shuffle() {
        Collections.shuffle(deck);
    }
    //Gets a card from the deck
    public Card getCard() {
        Card drawnCard = deck.remove(0);
        return drawnCard;
    }
    
}
