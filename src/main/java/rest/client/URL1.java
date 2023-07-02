package rest.client;

import java.net.MalformedURLException;
import java.net.URL;

class URL1
{
 public static void main(String[] arg) throws MalformedURLException
 {
  URL hp = new URL("http://www.studytonight.com/index");
  System.out.println(hp.getProtocol()); 
  System.out.println(hp.getFile());
 }
}