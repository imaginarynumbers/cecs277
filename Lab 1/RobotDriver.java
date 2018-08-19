/*
Name: Kacy Rowe
Date: 9-12-2017
Purpose: Utilize the point class to have 3 different robots
wandering on an infinite plane
Inputs: none
Output: coordinates, direction of the robot
*/
package cecs277.csulb.edu;
public class RobotDriver
{
  public static void main(String[] args)
  {
    //driver class for the robot project
    //Robot 1
    Robot robot1 = new Robot(); //testing with default constructor
    System.out.println("\nNow testing Robot #1");
    System.out.println("Facing: " + robot1.getDirection() + " (" + robot1.getLocation() + ")");
    robot1.move(); //move robot in specified direction
    System.out.println("Moving: " + robot1.getDirection() + "\n" + robot1.toString());
    robot1.turnLeft(); //change direction
    System.out.println("Turning Left, Facing: " + robot1.getDirection());
    robot1.move(); //move robot in specified direction
    System.out.println("Moving: " + robot1.getDirection() + "\n" + robot1.toString());
    robot1.turnRight(); //change direction
    System.out.println("Turning Right, Facing: " + robot1.getDirection());
    robot1.move(); //move robot in specified direction
    System.out.println("Moving: " + robot1.getDirection() + "\n" + robot1.toString());
    robot1.turnRight(); //change direction
    System.out.println("Turning Right, Facing: " + robot1.getDirection());
    
    //Robot 2
    Robot robot2 = new Robot(2, 5, "South"); //testing with x = 2 and y = 5
    System.out.println("\nNow testing Robot #2." + " \nStarting at: (" + robot2.getLocation() + ")");
    System.out.println("Facing: " + robot2.getDirection());
    robot2.move(); //move robot in specified direction
    System.out.println("Moving: " + robot2.getDirection() + "\n" + robot2.toString());
    robot2.turnLeft(); //change direction
    System.out.println("Turning Left, Facing: " + robot2.getDirection());
    robot2.move(); //move robot in specified direction
    System.out.println("Moving: " + robot2.getDirection() + "\n" + robot2.toString());
    robot2.turnRight(); //change direction
    System.out.println("Turning Right, Facing: " + robot1.getDirection());
    robot2.move(); //move robot in specified direction
    System.out.println("Moving: " + robot2.getDirection() + "\n" + robot2.toString());
    robot2.turnRight(); //change direction
    System.out.println("Turning Right, Facing: " + robot2.getDirection());
    
    //Robot 3
    Robot robot3 = new Robot (10, 66, "West"); //testing with x = 10 and y = 66
    System.out.println("\nNow testing Robot #3" + "\nStarting at: " + "(" + robot3.getLocation() + ")");
    System.out.println("Facing: " + robot3.getDirection());
    robot3.move(); //move robot in specified direction
    System.out.println("Moving: " + robot3.getDirection() + "\n" + robot3.toString());
    robot3.turnLeft(); //change direction
    System.out.println("Turning Left, Facing: " + robot3.getDirection());
    robot3.move(); //move robot in specified direction
    System.out.println("Moving: " + robot3.getDirection() + "\n" + robot3.toString());
    robot3.turnRight(); //change direction
    System.out.println("Turning Right, Facing: " + robot3.getDirection());
    robot3.move(); //move robot in specified direction
    System.out.println("Moving: " + robot3.getDirection() + "\n" + robot3.toString());
    robot3.turnRight(); //change direction
    System.out.println("Turning Right, Facing: " + robot3.getDirection());
  }

}
