/*
 *  Author: Angel Macias
 *  Class: CIS 18C Instructor: Dr. Lehr
 */
package texasholdem;

/*=======================================================================
This class implements Comparable for our Card objects. We override our
compareTo method to sort our Cards in ascending order by Rank.
=========================================================================*/
public class Card implements Comparable<Card> {
    private Suit suit;
    private Rank value;
    
    //Constructor
    public Card( Suit suit, Rank value) {
        this.suit=suit;
        this.value=value;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public Rank getValue() {
        return value;
    }

    /*====================================================================
    Our overriden compareTo method. In this method we use recursion to sort 
    our cards in ascending order.
    ======================================================================*/
    @Override
    public int compareTo(Card card) {
        int compareValue = suit.compareTo(suit);
        
        if(compareValue!=0) {
            return compareValue;
        }
        
        else 
            return value.compareTo(card.value);
    }
    
}
