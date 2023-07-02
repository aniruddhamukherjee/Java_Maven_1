package serialization;

import java.io.*;
class SD implements Serializable 
{
 String name;
 int rid;
 transient String contact;
 SD(String n, int r, String c)
 {
  this.name = n;
  this.rid = r;
  this.contact = c;
 }
}

public class Test{
 public static void main(String[] args)
 {
 try
 {
	 SD si = new SD("Ani", 104, "110044");
  FileOutputStream fos = new FileOutputStream("C:\\Users\\1359122\\Desktop\\Ani.txt");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(si);
  oos.close();
  fos.close();
  }
  catch (Exception e)
  { e. printStackTrace(); }
 }
}
