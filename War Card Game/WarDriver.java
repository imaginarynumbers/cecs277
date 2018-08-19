/*
Name: Kacy Rowe
Date: 9-21-2017
Purpose: Build a War card game
Inputs: none
Output: player cards and whether or not one is higher then who wins
*/
package cecs277.csulb.edu;
import java.util.*; //import the entire java util library

public class WarDriver
{ 
  public static void main(String[] args)
  {
    ArrayList<Cards> playArea = new ArrayList<>();
    Deck main = new Deck(); 
    Cards card;
    Cards card2;
    Deck player1 = new Deck();
    Deck player2 = new Deck();
    //first build the default deck
    main.buildDeck();
    //shuffle deck
    main.shuffle();
    //split half to player one from main deck
    player1.splitDeck(1);
    //split other half to player two from main deck
    player2.splitDeck(2);
    System.out.println("\n\n\n");
    player1.showP1Deck();
    System.out.println("\n\n\n");
    player2.showP2Deck();
    System.out.println("\n\n\n");
    card = player1.getP1Card();
    System.out.println(card.toString());
    card2 = player2.getP2Card();
    System.out.println(card2.toString());
    System.out.println("\nrank= " + player1.getRank(card));
    
    //begin game play
    while(!player1.isEmpty() || !player2.isEmpty())
    {
      //player one starts by drawing card face up
      card = player1.getP1Card();
      System.out.println("\nPlayer One draws: " + card.toString());
      
      //player two then draws one card face up
      card2 = player2.getP2Card();
      System.out.println("Player Two draws: " + card2.toString());
      
      //these ints hold the rank of the cards
      //for comparison purposes
      int cardInt1 = Integer.parseInt(player1.getRank(card));
      int cardInt2 = Integer.parseInt(player2.getRank(card2));
      if(cardInt1 < cardInt2)
      {
        //player2 gets card
        System.out.println(cardInt1 + " is less than " + cardInt2 + " \nPlayer2 gets: " + card.toString());
        player2.addP2Card(card);
      }
      if(cardInt1 > cardInt2)
      {
        //player1 gets card
        System.out.println(cardInt2 + " is less than " + cardInt1 + " \nPlayer1 gets: " + card2.toString());
        player1.addP1Card(card2);
      }
      if(cardInt1 == cardInt2)
      {
        //war, draw 3 cards face down
        //first player one
        System.out.println("\nPlayer One draws 3 cards face down");
        playArea.add(player1.getP1Card());
        System.out.println("XX");
        playArea.add(player1.getP1Card());
        System.out.println("XX");
        playArea.add(player1.getP1Card());
        System.out.println("XX");
        //player one starts by drawing card face up
        card = player1.getP1Card();
        System.out.println("\n(WAR) Player One draws: " + card.toString());
        //now player two
        System.out.println("\nPlayer Two draws 3 cards face down");
        playArea.add(player2.getP2Card());
        System.out.println("XX");
        playArea.add(player2.getP2Card());
        System.out.println("XX");
        playArea.add(player2.getP2Card());
        System.out.println("XX");
        //player two then draws one card face up
        card2 = player2.getP2Card();
        System.out.println("(WAR) Player Two draws: " + card2.toString());
        cardInt1 = Integer.parseInt(player1.getRank(card));
        cardInt2 = Integer.parseInt(player2.getRank(card2));
        if(cardInt1 < cardInt2)
        {
          //player2 gets card
          System.out.println(cardInt1 + " is less than " + cardInt2 + " \n(WAR) Player2 gets: " + card.toString());
          player2.addP2Card(card);
        }
        if(cardInt1 > cardInt2)
        {
          //player1 gets card
          System.out.println(cardInt2 + " is less than " + cardInt1 + " \n(WAR) Player1 gets: " + card2.toString());
          player1.addP1Card(card2);
        }
        else if(cardInt1 == cardInt2) System.out.println("\nTie again!");
        
      }
    } //end while
    if(player1.isEmpty())
    {
      System.out.println("\nPlayer one wins!");
    }
    if(player2.isEmpty()) 
    {
      System.out.println("\nPlayer two wins!");
    }

  }
  
}

