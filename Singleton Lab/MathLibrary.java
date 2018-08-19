package lab;

public class MathLibrary 
{
  private static MathLibrary instance;
  
  private MathLibrary()
  {
    //private constructor
  }
  public static synchronized MathLibrary getInstance()
  {
    if(instance == null)
    {
      instance = new MathLibrary();
    }
    return instance;
  }
  
  public int someMathMethod() 
  {
    return -1;
  }
  
  public double anotherMathMethod() 
  {
    return 0;
  }
}