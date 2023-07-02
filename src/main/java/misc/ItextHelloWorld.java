/*import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

public class ItextHelloWorld {

	public static void main(String[] args) {

		Document document = new Document();

		try {

			PdfWriter.getInstance(document, new FileOutputStream(
					"C:\\Users\\461698\\Desktop\\Itext1.pdf"));

			document.open();

			//Image image1 = Image
				//	.getInstance("C:\\Users\\461698\\Desktop\\Grup_pic.jpg");
			//document.add(image1);

			
			 * String imageUrl =
			 * "http://46qasb3uw5yn639ko4bz2ptr8u-wpengine.netdna-ssl.com/files/2013/01/java-script.jpg" ;
			 *  Image image2 = Image.getInstance(new URL(imageUrl));
			 * document.add(image2);
			 

			Font font1 = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
			Font font2 = new Font(Font.FontFamily.COURIER, 18, Font.ITALIC
					| Font.UNDERLINE);
			Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 27);

			document.add(new Paragraph("This pdf is generated from iText.."));
			
			document.add(new Chunk("This is sentence 1. "));
			document.add(new Phrase("This is sentence 2. "));
			document.add(new Paragraph("This is sentence 3. "));
			
			document.add(new Chunk("This is sentence 1. ", font1));
			document.add(new Phrase("This is sentence 2. ", font2));
			document.add(new Paragraph("This is sentence 3. ", font3));
			document.close(); // no need to close PDFwriter?
            System.out.println("File geenrated successfully");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}*/