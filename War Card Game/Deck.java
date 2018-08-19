/*
Name: Kacy Rowe
Date: 9-21-2017
Purpose: Build a War card game
Inputs: none
Output: player cards and whether or not one is higher then who wins
*/
package cecs277.csulb.edu;
import java.util.*; //all java util imported, including collections

public class Deck
{
  private static ArrayList<Cards> deck;
  private static ArrayList<Cards> playerOne;
  private static ArrayList<Cards> playerTwo;
//////////////////////////////////////////////////////////////
  public Deck()
  {
    //default constructor
    deck = new ArrayList<>(); //instantiate new deck ArrayList
    playerOne = new ArrayList<>(); //instantiate new deck ArrayList
    playerTwo = new ArrayList<>(); //instantiate new deck ArrayList
  }
//------------------------------------------------------------
  public Deck (ArrayList<Cards> inDeck, int player)
  {
    //constructor
    if(player == 1)
    {
      playerOne = inDeck; 
    }
    if(player == 2)
    {
      playerTwo = inDeck;
    }
  }
//------------------------------------------------------------
  public void addP1Card(Cards card)
  {
    //add a card to playerOne's deck
    playerOne.add(card);
  }
//------------------------------------------------------------
  public void addP2Card(Cards card)
  {
    //add a card to playerTwo's deck
    playerTwo.add(card);
  }
//------------------------------------------------------------
  public String getRank(Cards card)
  {
    Cards cardTemp = new Cards();
    cardTemp = card;
    String rankTest = cardTemp.toString().substring(0,1);
    if(rankTest.equals("A"))
    {
      rankTest = "14";
    }
    if(rankTest.equals("K"))
    {
      rankTest = "13";
    }
    if(rankTest.equals("Q"))
    {
      rankTest = "12";
    }
    if(rankTest.equals("J"))
    {
      rankTest = "11";
    }
    return rankTest;
  }
//------------------------------------------------------------
  public void buildDeck()
  {
    //build the deck with nest for loop
    for(int i = 0; i < 13; i++)
    {
      for(int j = 0; j < 4; j++)
      {
        deck.add(new Cards(i,j)); //add value and suit to ArrayList deck
      }
    }
	 System.out.println("\ndeck size is: " + deck.size());
  }
//------------------------------------------------------------
  public boolean isEmpty()
  {
    //check if any player's deck is empty using built in method
    if(playerOne.isEmpty())
    {
      return true; //player one wins
    }
    if(playerTwo.isEmpty())
    {
      return true; //player two wins
    }
    return false; //no decks empty, keep playing
  }
//------------------------------------------------------------
  public Deck splitDeck(int player)
  {
    //split the deck of 52 to each player
    //playerOne get's even numbered cards
    //playerTwo get's odds
    if(player == 1)
    {
      for(int w = 0; w < 52; w++)
      {
        if(w % 2 == 0)
        {
          playerOne.add(deck.get(w));
        }
      }
      for(int i = 0; i < playerOne.size(); i++)
      {
        System.out.println(playerOne.get(i));
      }
    }
    if(player == 2)
    {
      for(int r = 0; r < 52; r++)
      {
        if((r % 2 != 0))
        {
          playerTwo.add(deck.get(r));
        }
      }
      for(int i = 0; i < playerTwo.size(); i++)
      {
        System.out.println(playerTwo.get(i));
      }
    }
    //split complete, return split decks
    if(player == 1)
    {
      return new Deck(playerOne, 1);
    }
    if(player == 2)
    {
      return new Deck(playerTwo, 2);
    }
    else
    {
      return new Deck(deck, 3);
    }
  }
//------------------------------------------------------------
  public void shuffle()
  {
    //shuffle cards here
    //run this before dealing
    for(int i = 0; i < 3; i++)
    {
      //shuffle 3 times to simulate human shuffling
      Collections.shuffle(deck);
    }
  }
//------------------------------------------------------------
  public Cards getP1Card()
  {
    //remove card from playerOne's deck
    return playerOne.remove(0);
  }
//------------------------------------------------------------
  public Cards getP2Card()
  {
    //remove card from playerTwo's deck
    return playerTwo.remove(0);
  }
//------------------------------------------------------------
  public void showP1Deck()
  {
    //print the cards in playerOne's deck
    for(int i = 0; i < playerOne.size(); i++)
    {
      System.out.println(playerOne.get(i));
    }
  }
//------------------------------------------------------------
  public void showP2Deck()
  {
    //print the cards in playerTwo's deck
    for(int i = 0; i < playerTwo.size(); i++)
    {
      System.out.println(playerTwo.get(i));
    }
  }
//------------------------------------------------------------
}
//////////////////////////////////////////////////////////////
