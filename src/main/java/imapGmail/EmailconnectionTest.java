package imapGmail;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.SearchTerm;

public class EmailconnectionTest {
	public static void main(String[] args) throws Exception {
		Session session = Session.getDefaultInstance(new Properties());
		Store store = session.getStore("imaps");
		store.connect("imap.googlemail.com", 993, "aniunexplored@gmail.com", "ANIGTALK");
		Folder inbox = store.getFolder("INBOX");
		inbox.open(Folder.READ_ONLY);
		int messageCount = inbox.getMessageCount();
		System.out.println("Total emails : " + messageCount);
		try {
			// creates a search criterion
			SearchTerm searchCondition = new SearchTerm() {
				@Override
				public boolean match(Message message) {
					try {
						if (message.getSubject().contains("Refund on order 405-3661590-7865951")) {
							return true;
						}
					} catch (MessagingException ex) {
						ex.printStackTrace();
					}
					return false;
				}
			};
            //int arr[] = new int[messageCount-(messageCount-10)];
			//Message[] messages = inbox.getMessages(arr);
            Message[] messages = inbox.getMessages();
			// Message[] messages = inbox.search(searchCondition);
			String searchSubject = "Critical security alert for aniruddhamukherjee1704@gmail.com";
			for (int i = messages.length - 1; i >=  messages.length - 10; i--) {
				Message msg = messages[i];

				String subject = msg.getSubject();
				if (searchSubject.equalsIgnoreCase(subject)) {
					String sentDate = msg.getSentDate().toString();

					// String contentType = msg.getContentType();
					//String messageContent = "";

					/*
					 * if (contentType.contains("text/plain") || contentType.contains("text/html"))
					 * { try { Object content = msg.getContent(); if (content != null) {
					 * messageContent = content.toString(); } } catch (Exception ex) {
					 * messageContent = "[Error downloading content]"; ex.printStackTrace(); } }
					 */
					// print out details of each message
					System.out.println("Message #" + (i + 1) + ":");
					System.out.println("\t Subject: " + subject);
					System.out.println("\t Sent Date: " + sentDate);
					//System.out.println("\t Message: " + messageContent);

					// disconnect
					inbox.close(false);
					store.close();
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} /*
			 * catch (MessagingException ex) {
			 * System.out.println("Could not connect to the message store");
			 * ex.printStackTrace(); }
			 */
	}

	// performs search through the folder
	/*
	 * Message[] foundMessages = inbox.search(searchCondition);
	 * 
	 * for (int i = 0; i < foundMessages.length; i++) { Message message =
	 * foundMessages[i]; String subject = message.getSubject();
	 * System.out.println("Found message #" + i + ": " + subject); }
	 * 
	 * // disconnect inbox.close(false); store.close(); } catch
	 * (NoSuchProviderException ex) { System.out.println("No provider.");
	 * ex.printStackTrace(); } catch (MessagingException ex) {
	 * System.out.println("Could not connect to the message store.");
	 * ex.printStackTrace(); }
	 */

	// Fetch unseen messages from inbox folder
	/*
	 * Message[] messages = inbox.search( new FlagTerm(new
	 * Flags(Flags.Flag.FLAGGED), false)); // Sort messages from recent to oldest
	 * Arrays.sort( messages, ( m1, m2 ) -> { try { return
	 * m2.getSentDate().compareTo( m1.getSentDate() ); } catch ( MessagingException
	 * e ) { throw new RuntimeException( e ); } } ); for ( Message message :
	 * messages ) { System.out.println( "sendDate: " + message.getSentDate() +
	 * " subject:" + message.getSubject() ); }
	 */

}