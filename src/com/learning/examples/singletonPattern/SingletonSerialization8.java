// Java code to remove the effect of
// Serialization on singleton classes
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class SingletonSerialization8 implements Serializable
{
    // public instance initialized when loading the class
    public static SingletonSerialization8 instance = new SingletonSerialization8();
     
    private SingletonSerialization8()
    {
        // private constructor
    }
     
    // implement readResolve method
    protected Object readResolve()
    {
        return instance;
    }
}
 
public class GFG
{
 
    public static void main(String[] args)
    {
        try
        {
            SingletonSerialization8 instance1 = SingletonSerialization8.instance;
            ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();
         
            // deserailize from file to object
            ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));
            SingletonSerialization8 instance2 = (SingletonSerialization8) in.readObject();
            in.close();
         
            System.out.println("instance1 hashCode:- "
                                           + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                                           + instance2.hashCode());
        }
         
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
