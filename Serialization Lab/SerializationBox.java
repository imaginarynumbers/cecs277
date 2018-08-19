import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializationBox implements Serializable 
{
  public byte serializableProp = 10;
  public byte getSerializableProp() 
  {
  return serializableProp;
  }
}

