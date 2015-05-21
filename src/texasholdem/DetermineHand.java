/*
 *  Author: Angel Macias
 *  Class: CIS 18C Instructor: Dr. Lehr
 */
package texasholdem;
import java.util.*;

/*==========================================================================
The most important class in the applcation. Holds the following methods to 
determine the type of hand a player has:
1. Royal Flush
2. Four of A Kind
3. Full House
4. Straight Flush
5. Flush
6. Straight
7. Three of A Kind
8. Two Pair
9. Pair
10. High Card
More details of each method can be found before each method
whatsMyHand() : Tests for each hand. Each if statement prints out the cards if
it returns true.
============================================================================*/
public class DetermineHand {
    
    private Player player;
    private List<Card> commCards;
    
    public DetermineHand(Player player, List<Card> commCards) {
        this.player=player;
        this.commCards=commCards;
        
    }
    
    public int whatsMyHand() {
        if(isRoyalFlush(player.getHand(),commCards)) {
            System.out.println("Player: " + player.name + " has a Royal flush!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 8;
        }
        else if(isFourOfAKind(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Four of a kind!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 7;
        }
        else if(isFullHouse(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Full house!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 6;
        }
        else if(isFlush(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Flush!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 5;
        }
        else if(isStraight(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Straight!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 4;
        }
        else if(isThreeOfAKind(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Three of a kind!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 3;
        }
        else if(isTwoPair(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Two pair!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 2;
        }
        else if(isPair(player.getHand(), commCards)) {
            System.out.println("Player: " + player.name + " has a Pair!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 1;
        }
        else {
            System.out.println("Player: " + player.name + " has a High card!");
            List<Card> allTogether = new ArrayList<>();
        
            for(Card playerHand : player.getHand()) {
                allTogether.add(playerHand);
            }

            for(Card commCard : commCards) {
                allTogether.add(commCard);
            }
            Collections.sort(allTogether);
            for(Card all : allTogether) {
                System.out.print(all.getValue());
                System.out.println (all.getSuit());
            }
            return 0;
        }
            
        
    }
     /*===================================================================
    @param hand: The players hand
    @param commCards: The cards from the table
    Sorts the cards then returns the last element in the list.
    ======================================================================*/
    public Card highCard(List<Card> hand, List<Card> commCards) {
        List<Card> allTogether = new ArrayList<>();
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);      
        
        return allTogether.get(6);
    }    
    /*===================================================================
    @param hand: The players hand
    @param commCards: The community cards
    This method utilizes a hashmap to keep track the number of times
    a certain suit appears. Once the count reaches five, we have a flush!
    =====================================================================*/
    public boolean isFlush(List<Card> hand, List<Card> commCards) {
        
        List<Card> allTogether = new ArrayList<>();
        HashMap<Suit,Integer> numOccur = new HashMap<>();
        boolean isFlush=false;
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        //For:each loop that counts the number of times a suit appears                
        for (Card temp : allTogether) {
            if(numOccur.containsKey(temp.getSuit())) {
                Integer count = numOccur.get(temp.getSuit());
                
                if(count==null)
                    count=0;
                count++;

                numOccur.put(temp.getSuit(), count);
            }
            else
                numOccur.put(temp.getSuit(), 1);
            
            if(numOccur.get(temp.getSuit())==5)
                isFlush=true;
        }
        
        return isFlush;
    }
    
    /*=======================================================================
    @param hand: The players hand
    @param commCards: The community cards
    This method checks for the presence of a straight.
    First we check if our high card is an ACE:
        - Then check if our other cards are 2, 3, 4, 5 or
            10, J, Q, K.
    Then we set a rank equal to the beginning card, increment by one, then check
    if the next card is equal to the rank. If it is, keep going until the count 
    reaches 5. If it reaches 5, we have a straight. If not, no straight
    ==========================================================================*/
    public boolean isStraight(List<Card> hand, List<Card> commCards) {
        List<Card> allTogether = new ArrayList<>();
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);
               
        if(allTogether.get(6).getValue().returnValue()==14) {
            boolean caseA = allTogether.get(5).getValue().returnValue()==13 &&
                    allTogether.get(4).getValue().returnValue()==12 &&
                    allTogether.get(3).getValue().returnValue()==11 &&
                    allTogether.get(2).getValue().returnValue()==10;
            boolean caseB = allTogether.get(0).getValue().returnValue()==2 &&
                    allTogether.get(1).getValue().returnValue()==3 &&
                    allTogether.get(2).getValue().returnValue()==4 && 
                    allTogether.get(3).getValue().returnValue()==5;
            
            return( caseA || caseB);
        }
        
        else {
            boolean isStraight=true;
            int straightCount=0;
            int nextRank=allTogether.get(1).getValue().returnValue();
            
            for(int i=1;i<6;i++) {
                                
                if(allTogether.get(i).getValue().returnValue() != nextRank &&
                        allTogether.get(i).getValue().returnValue() != nextRank-1) {
                    straightCount=0;
                    isStraight=false;
                    nextRank=allTogether.get(i).getValue().returnValue();
                }
                
                nextRank++;
                straightCount++;
                
                if(straightCount==5)
                    return isStraight;
                
            }
            return isStraight;
        }
    }
    
    /*=======================================================================
    @param hand: Players hand
    @param commCards: The community cards
    We use our pre-existing methods to determine straight flushes. If there is
    a straight and a flush, we have a straight flush!
    =========================================================================*/
    public boolean isStraightFlush(List<Card> hand, List<Card> commCards) {
               
        return isStraight(hand, commCards) && isFlush(hand, commCards);
    }
    /*=======================================================================
    @param hand: Players hand
    @param commCards: Community cards
    We use our pre-existing methods to determine royal flush. If there is a
    straight, flush, and our high card is an ACE, we have a royal flush!
    =========================================================================*/
    public boolean isRoyalFlush(List<Card> hand, List<Card> commCards) {
        
        return isStraight(hand, commCards) && isFlush(hand,commCards) &&
                highCard(hand, commCards).getValue()==Rank.ACE;
    }
    /*=========================================================================
    @param hand: Players hand
    @param commCards: Community cards
    We utilize a hashmap to determine the four a kind. We keep track of each
    time the value of a card appears, then we increment the count in the hashmap
    If the count reaches 4, we have a four of a kind!
    ===========================================================================*/
    public boolean isFourOfAKind(List<Card> hand, List<Card> commCards) {
        List<Card> allTogether = new ArrayList<>();
        HashMap<Rank,Integer> numOccur = new HashMap<>();
        boolean isFourOfAKind=false;
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);
        
        for (Card temp : allTogether) {
            if(numOccur.containsKey(temp.getValue())) {
                Integer count = numOccur.get(temp.getValue());
                
                if(count==null)
                    count=0;
                count++;

                numOccur.put(temp.getValue(), count);
            }
            else
                numOccur.put(temp.getValue(), 1);
            
            if(numOccur.get(temp.getValue())==4)
                isFourOfAKind=true;
        }
        
        return isFourOfAKind;
        
    }
    /*=======================================================================
    @param hand: Players hand
    @param commCards: Community cards
    Utilizes a hash map to keep track of the number of times a card appears
    We have 2 booleans, if there is a pair, and if there is a three of a kind
    If the count reaches 2, our pair is true.
    If count reaches 3, our three of a kind is true.
    If both booleans are true, we have a full house.
    =========================================================================*/
    public boolean isFullHouse(List<Card> hand, List<Card> commCards) {
        boolean pair=false;
        boolean threeKind=false;
        
        List<Card> allTogether = new ArrayList<>();
        HashMap<Rank,Integer> numOccur = new HashMap<>();
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);
                
        for (Card temp : allTogether) {
            if(numOccur.containsKey(temp.getValue())) {
                Integer count = numOccur.get(temp.getValue());
                
                if(count==null)
                    count=0;
                count++;

                numOccur.put(temp.getValue(), count);
            }
            else
                numOccur.put(temp.getValue(), 1);
            
            if(numOccur.get(temp.getValue())==2)
               pair=true;
            
            if(numOccur.get(temp.getValue())==3)
                threeKind=true;
            
        }
        
        return (pair && threeKind);
    }
    /*====================================================================
    @param hand: Players hand
    @param commCards: Community cards
    First we test if there is a four of a kind or full house
        -If true, return false because there is a better hand
        -Else: Use a hashmap to keep track of number of ocurrences. When count
                    reaches 3, we have a three of a kind.
    ======================================================================*/
    public boolean isThreeOfAKind(List<Card> hand, List<Card> commCards) {
        boolean isThreeOfAKind=false;
        
        if(isFourOfAKind(hand,commCards) || isFullHouse(hand,commCards)) 
            return isThreeOfAKind;

        List<Card> allTogether = new ArrayList<>();
        HashMap<Rank,Integer> numOccur = new HashMap<>();
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);
                
        for (Card temp : allTogether) {
            if(numOccur.containsKey(temp.getValue())) {
                Integer count = numOccur.get(temp.getValue());
                
                if(count==null)
                    count=0;
                count++;

                numOccur.put(temp.getValue(), count);
            }
            else
                numOccur.put(temp.getValue(), 1);
            
            if(numOccur.get(temp.getValue())==3)
                isThreeOfAKind=true;
        }
        
        return isThreeOfAKind;
        
    }
    
    /*=======================================================================
    @param hand: Players hand
    @param commCards: Community cards
    If there is a full house, four of a kind, three of a kind: return false
    Else: Use hashmaps to determine the number of counts. Once count reaches 2,
    test to see if there is another key in our hashmap with a value of 2. If 
    both cases are true, two pair is true.
    =========================================================================*/
    public boolean isTwoPair(List<Card> hand, List<Card> commCards) {
        boolean isTwoPair=false;
        
        if (isFullHouse(hand, commCards) || isFourOfAKind(hand, commCards) ||
                isThreeOfAKind(hand, commCards))
            return isTwoPair;
            
        List<Card> allTogether = new ArrayList<>();
        HashMap<Rank,Integer> numOccur = new HashMap<>();
        int twoPairCounter=0;
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);
        
        for (Card temp : allTogether) {
            if(numOccur.containsKey(temp.getValue())) {
                Integer count = numOccur.get(temp.getValue());
                
                if(count==null)
                    count=0;
                count++;
                if(count==2) 
                    twoPairCounter++;
                
                if(twoPairCounter==2)
                    isTwoPair=true;
                numOccur.put(temp.getValue(), count);
            }
            else
                numOccur.put(temp.getValue(), 1);
            
        }
             
        return isTwoPair;
        
    }
    
    /*=======================================================================
    @param hand: Player hand
    @param commCards: Community cards
    If 4Kind, FullHouse, 3Kind, TwoPair: return false(there are better hands).
    Else use hashmaps to increment counts. If count=2, return true
    =========================================================================*/
    public boolean isPair(List<Card> hand, List<Card> commCards) {
        boolean isPair=false;
        
        if(isFourOfAKind(hand,commCards) || isFullHouse(hand,commCards) ||
                isThreeOfAKind(hand,commCards) || isTwoPair(hand,commCards))
            return isPair;
        
        List<Card> allTogether = new ArrayList<>();
        HashMap<Rank,Integer> numOccur = new HashMap<>();
        
        for(Card playerHand : hand) {
            allTogether.add(playerHand);
        }
        
        for(Card commCard : commCards) {
            allTogether.add(commCard);
        }
        
        Collections.sort(allTogether);
        
        for (Card temp : allTogether) {
            if(numOccur.containsKey(temp.getValue())) {
                Integer count = numOccur.get(temp.getValue());
                
                if(count==null)
                    count=0;
                count++;

                numOccur.put(temp.getValue(), count);
            }
            else
                numOccur.put(temp.getValue(), 1);
            if(numOccur.get(temp.getValue())==2)
                isPair=true;
        }
        
        return isPair;
    }
    
}
