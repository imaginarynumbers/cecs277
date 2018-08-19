package lab;

public class Driver
{
  public static void main(String[] args)
  {  
    MathLibrary mL = MathLibrary.getInstance();
    
    System.out.println(mL.anotherMathMethod());
    //output 0.0
    System.out.println(mL.someMathMethod());
    //output -1
  }
}
