/*
Name: Kacy Rowe
Date: 9-21-2017
Purpose: Build a War card game
Inputs: none
Output: player cards and whether or not one is higher then who wins
*/
package cecs277.csulb.edu;

public class Cards
{
  private int suit;
  private int value;
  private String[] valueC = {"Ace", "King", "Queen", "Jack", "10",
                             "9", "8", "7", "6", "5", "4", "3", "2"};
  private String[] suitC = {"Hearts", "Clubs", "Diamonds", "Spades"};
  
  public Cards()
  {
    //default constructor
    suit = 0;
    value = 0;
  }
//------------------------------------------------------------
  public Cards(int value, int suit)
  {
    //constructor
    this.suit = suit;
    this.value = value;
  }
//------------------------------------------------------------
  public String toString()
  {
    //overridden toString
    String cardReturn = valueC[value] + " of " + suitC[suit];
    return cardReturn;
  }
//------------------------------------------------------------
}
