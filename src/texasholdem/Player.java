/*
 *  Author: Angel Macias
 *  Class: CIS 18C Instructor: Dr. Lehr
 */
package texasholdem;
import java.util.*;

/*=======================================================================
Straightforward that holds the name, number of chips(not yet implemented),
and the cardStrength, and the players hand.
=========================================================================*/
public class Player {
    String name;
    private List<Card> hand;
    int chipCount;
    int cardStrength;
    
    public Player() {
        name = "John";
        chipCount = 1000;
    }
    
    public Player(String name) {
        this.name=name;
        chipCount=1000;
    }
    
    public List<Card> getHand() {
        return hand;
    }
    
    public void setHand(List<Card> hand) {
        this.hand=hand;
    }
    
    public void setStrength(int count) {
        cardStrength=count;
    }
    
    public int getStrength() {
        return cardStrength;
    }
    
}
