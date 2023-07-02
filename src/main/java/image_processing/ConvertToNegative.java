package image_processing;



//Java program to demonstrate colored to negative conversion
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ConvertToNegative
{
 public static void main(String args[])throws IOException
 {
     BufferedImage img = null;
     File f = null;

     // read image
     try
     {
         f = new File("D:\\ani\\IPR1.png");
         img = ImageIO.read(f);
     }
     catch(IOException e)
     {
         System.out.println(e);
     }

     // Get image width and height
     int width = img.getWidth();
     int height = img.getHeight();

     // Convert to negative
     for (int y = 0; y < height; y++)
     {
         for (int x = 0; x < width; x++)
         {
             int p = img.getRGB(x,y);
             int a = (p>>24)&255;
             int r = (p>>16)&255;
             int g = (p>>8)&255;
             int b = p&255;

             //subtract RGB from 255
             r = 255 - r;
             g = 255 - g;
             b = 255 - b;

             //set new RGB value
             p = (a<<24) | (r<<16) | (g<<8) | b;
             img.setRGB(x, y, p);
         }
     }

     // write image
     try
     {
         f = new File("D:\\ani\\IPR1_neg.png");
         ImageIO.write(img, "jpg", f);
     }
     catch(IOException e)
     {
         System.out.println(e);
     }
 }
}
