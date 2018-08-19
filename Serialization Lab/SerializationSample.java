import java.io.*;
public class SerializationSample 
{
//------------------------------------------------------------ 
  public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException 
  {
    SerializationBox serialB = new SerializationBox();
    System.out.println("the value of the property is: " + serialB.serializableProp);
    serialize("serial.out", serialB);
    //serialB.serializableProp=(byte)20;
    //ystem.out.println("the value of the property is: " + serialB.serializableProp);
    SerializationBox sb = (SerializationBox) deSerialize("serial.out");
    System.out.println("The restored value is: " + sb.getSerializableProp());
  }
//------------------------------------------------------------ 
  public static void serialize(String outFile, Object serializableObject) throws IOException 
  {
    FileOutputStream fos = new FileOutputStream(outFile);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(serializableObject);
  }
//------------------------------------------------------------ 
  public static Object deSerialize(String serilizedObject)  
        throws FileNotFoundException, IOException, ClassNotFoundException 
  {
    FileInputStream fis = new FileInputStream(serilizedObject);
  ObjectInputStream ois = new ObjectInputStream(fis);
    return ois.readObject();
  }
//------------------------------------------------------------ 
}