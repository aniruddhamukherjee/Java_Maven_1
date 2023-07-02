package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream; 
class Deserial
{
 public static void main(String[] args)
 {
  SD si=null ;
  try  
  {
   FileInputStream fis = new FileInputStream("C:\\Users\\1359122\\Desktop\\Ani.txt");
   ObjectInputStream ois = new ObjectInputStream(fis);
   si = (SD)ois.readObject();
  } 
  catch (Exception e)
   { e.printStackTrace(); }
  System.out.println(si.name);
  System.out. println(si.rid);
  System.out.println(si.contact);
 }
}