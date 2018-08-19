/*
Name: Kacy Rowe
Date: 9-12-2017
Purpose: Utilize the point class to have 3 different robots
wandering on an infinite plane
Inputs: none
Output: coordinates, direction of the robot
*/
package cecs277.csulb.edu;

import java.awt.Point;
//////////////////////////////////////////////////////////////
public class Robot
{
  private Point bot; //declare Point object
  private int coordX; //declare coordinate X variable
  private int coordY; //declare coordinate Y variable
  private String direction; //declare direction string
//------------------------------------------------------------
  public Robot() 
  {
    //default constructor
    bot = new Point(0,0); //instantiate Point object
    coordX = 0; //instantiate coordinate X variable
    coordY = 0; //instantiate coordinate Y variable
    direction = "North"; //instantiate direction string to North by default
  } //end default constructor
//------------------------------------------------------------
  public Robot(int x, int y, String dir)
  {
    //constructor
	 //for when we want to specify a location and direction
    bot = new Point(x , y); //instantiate Point object
    coordX = x; //instantiate x coordinate variable
    coordY = y; //instantiate y coordinate variable
    direction = dir; //instantiate direction variable
  } //end constructor
//------------------------------------------------------------
  public void turnLeft()
  {
     //checks what direction robot is facing
	  //changes direction in accordance with left
	  if(direction == "North")
    {
      direction = "West";
    }
    else if(direction == "West")
    {
      direction = "South";
    }
    else if(direction == "South")
    {
      direction = "East";
    }
    else if(direction == "East")
    {
      direction = "North";
    }
  } //end turnLeft
//------------------------------------------------------------
  public void turnRight()
  {
	 //checks what direction robot is facing
	 //changes direction in accordance with right
	 if(direction == "North")
    {
      direction = "East";
    }
    else if(direction == "West")
    {
      direction = "North";
    }
    else if(direction == "South")
    {
      direction = "West";
    }
    else if(direction == "East")
    {
      direction = "South";
    }
  } //end turnRight
//------------------------------------------------------------
  public void move()
  {
    //move 1 unit each time 
	 //example if north (0,0) -> (0,1)
    if(direction == "North")
    {
      bot.setLocation(coordX, coordY++);
    }
    else if(direction == "West")
    {
      bot.setLocation(coordX--, coordY);
    }
    else if(direction == "South")
    {
      bot.setLocation(coordX, coordY--);
    }
    else if(direction == "East")
    {
      bot.setLocation(coordX++, coordY);
    }
  } //end move
//------------------------------------------------------------
  public Point getLocation()
  {
    return bot;
  } //end getLocation
//------------------------------------------------------------
  public String getDirection()
  {
    //returns north, south, east, west
    return direction;
  } //end getDirection
//------------------------------------------------------------
  public String toString()
  {
    //@Override
	 return "Coordinates: (" + coordX + "," + coordY + ")";
  } //end toString
//------------------------------------------------------------
} //end Robot class
//////////////////////////////////////////////////////////////
