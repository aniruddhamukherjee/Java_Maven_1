/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
 
public class HtmlPagetoPDF{
 public static void main(String[] args) throws JDOMException, DocumentException {
 
  URL url;
 
  try {
   //----------------------- HTML CREATTION ------------------------
   // get URL content
   url = new URL("http://www.tutorialspoint.com/sql/sql-rdbms-concepts.htm");
   URLConnection conn = url.openConnection();
 
   // open the stream and put it into BufferedReader
   BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
   String inputLine;
 
   //save to this filename
   String fileName = "C://temp_html.html";
   File file = new File(fileName);
   if (!file.exists()) {
    file.createNewFile();
   }
   //use FileWriter to write file
   FileWriter fw = new FileWriter(file.getAbsoluteFile());
   BufferedWriter bw = new BufferedWriter(fw);
   while ((inputLine = br.readLine()) != null) {
    bw.write(inputLine);
    System.out.println(inputLine);
   }
   bw.close();
   br.close();
   System.out.println("Html Creation Done");
   //----------------------- HTML CREATTION ------------------------
   
   //----------------------- HTML TO XML CREATTION ------------------------   
   FileWriter fwOutXml =null;
   FileReader frInHtml=null;
   BufferedWriter bwOutXml =null;
   BufferedReader brInHtml=null;
   
   frInHtml = new FileReader("C:\\temp_html.html");
      brInHtml = new BufferedReader(frInHtml);
      SAXBuilder saxBuilder = new SAXBuilder("org.ccil.cowan.tagsoup.Parser", false);
      org.jdom.Document jdomDocument = saxBuilder.build(brInHtml);
      XMLOutputter outputter = new XMLOutputter();
   
      outputter.output(jdomDocument, System.out);
         fwOutXml = new FileWriter("C:\\temp_xml.xml");
         bwOutXml = new BufferedWriter(fwOutXml);
         outputter.output(jdomDocument, bwOutXml);
         System.out.flush();
         System.out.println("XML Creation Done");

         fwOutXml.flush();
         fwOutXml.close();
         bwOutXml.close();
           //----------------------- HTML TO XML CREATTION ------------------------   
       
         //----------------------- XML TO PDF CREATTION ------------------------   
         Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C://pdf.pdf"));
         document.open();
         XMLWorkerHelper.getInstance().parseXHtml(writer, document,new FileInputStream("C://temp_xml.xml"));        
         document.close();
         System.out.println( "PDF Created Successfully" );
         //----------------------- XML TO PDF CREATTION ------------------------ 
         
         File html_temp_file = new File("C://temp_html.html");
         File xml_temp_file = new File("C://temp_xml.xml");
         xml_temp_file.delete();
         html_temp_file.delete();
         System.out.println("Both Files Deleted Successfully");
 
  } catch (MalformedURLException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
 
 }
}
*/