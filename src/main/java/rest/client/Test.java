package rest.client;

import java.net.InetAddress;
import java.net.UnknownHostException;
class Test
{
 public static void main(String[] args) throws UnknownHostException
 {
  InetAddress address = InetAddress.getLocalHost(); 
  System.out.println(address.getHostAddress()+" / "+address.getHostName());
  address = InetAddress.getByName("www.studytonight.com");
  System.out.println(address);
  InetAddress sw[] = InetAddress.getAllByName("www.google.com");
  for(int i=0; i< sw.length; i++)
  {
   System.out.println(sw[i]);
  }
 }
}