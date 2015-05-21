/*
 *  Author: Angel Macias
 *  Class: CIS 18C Instructor: Dr. Lehr
 */
package texasholdem;
import java.util.*;

public class TexasHoldEm {

        public static void main(String[] args) {
            
            //Hashmap used to store the number of chips and name of player            
            Player player1 = new Player("Angel");
            Player player2 = new Player("Michelle");
                        
            System.out.println("Creating new deck...");
            Deck newDeck = new Deck();
            newDeck.shuffle();
            
            /*=================================================================
            This is the beginning of the game. We deal 2 cards to both players
            and then we deal 5 cards to the table. After we compare the two
            hands to determine the winner
            ==================================================================*/
            System.out.println("Dealing cards to player one...");
            List<Card> playerHand = new ArrayList<>();
            playerHand.add(newDeck.getCard());
            playerHand.add(newDeck.getCard());
            player1.setHand(playerHand);
            
            
            System.out.println("Dealing cards to player two...");
            List<Card> playerHand2 = new ArrayList<>();
            
            playerHand2.add(newDeck.getCard());
            playerHand2.add(newDeck.getCard());
            
            player2.setHand(playerHand2);
            
            System.out.println("Burning a card...");
            newDeck.getCard();
            
            System.out.println("Dealing the flop...");
            List<Card> communityCards = new ArrayList<>();
            communityCards.add(newDeck.getCard());
            communityCards.add(newDeck.getCard());
            communityCards.add(newDeck.getCard());
            
            System.out.println("Burning a card...");
            newDeck.getCard();
            
            System.out.println("Dealing the turn...");
            communityCards.add(newDeck.getCard());
            
            System.out.println("Burning a card...");
            newDeck.getCard();
            
            System.out.println("Dealing the turn...");
            communityCards.add(newDeck.getCard());
            
            /*=================================================================
            Now we print out the cards on the table and then the hands of each 
            player
            =================================================================*/
            System.out.println("Here are the cards on the table...");
            for (Card communityCard : communityCards) {
                System.out.print(communityCard.getValue());
                System.out.print(communityCard.getSuit());
                System.out.print(", ");
            }
            
            System.out.println("\nCards of player 1...");
            for (Card hand : player1.getHand()) {
                System.out.print(hand.getValue());
                System.out.println(hand.getSuit());
            }
            
            System.out.println("Cards of player 2....");
            for(Card cards2: player2.getHand()) {
                System.out.print(cards2.getValue());
                System.out.println(cards2.getSuit());
            }
            
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            
            /*================================================================
            Now we determine each players hand, assign a 'strength' number to
            it, and compare each 'strength' of each players hand to determine
            which player has the better hand.
            ==================================================================*/
            
            DetermineHand winner1 = new DetermineHand(player1, communityCards);
            player1.setStrength(winner1.whatsMyHand());
            
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            
            DetermineHand winner2 = new DetermineHand(player2, communityCards);
            player2.setStrength(winner2.whatsMyHand());
            
            /*================================================================
            The else statement:
            This statement covers if two players have the same hand. Then we
            look at each players high card to determine who has the better
            kicker which in turn will win the hand. If the kicker is the same,
            then it is actually a tie
            */
            if(player1.getStrength() > player2.getStrength()) 
                System.out.println("Player: " + player1.name + " is the winner!");
            
            else if(player1.getStrength() < player2.getStrength())
                System.out.println("Player 2: " + player2.name + " is the winner!");
            else {
                Card player1HighCard = winner1.highCard(player1.getHand(), communityCards);
                Card player2HighCard = winner2.highCard(player1.getHand(), communityCards);
                System.out.println(player1HighCard.getValue().returnValue());
                System.out.println(player2HighCard.getValue().returnValue());
                if(player1HighCard.getValue().returnValue()>player2HighCard.getValue().returnValue())
                    System.out.println("Player: " + player1.name + " is the winner!");
                else if(player1HighCard.getValue().returnValue()<player2HighCard.getValue().returnValue())
                    System.out.println("Player: " + player2.name + " is the winner!");
                else
                    System.out.println("We have a tie!");
            }
            
    }
        
}
