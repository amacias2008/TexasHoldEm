/*
 *  Author: Angel Macias
 *  Class: CIS 18C Instructor: Dr. Lehr
 */
package texasholdem;

public enum Suit {
    CLUBS(1),
    DIAMONDS(2),
    SPADES(3),
    HEARTS(4);
    
    private int value;
    
    private Suit(int value) {
        this.value=value;
    }
    
    public int getValue() {
        return value;
    }

}
