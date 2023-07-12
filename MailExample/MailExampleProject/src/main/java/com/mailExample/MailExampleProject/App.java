package com.mailExample.MailExampleProject;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String message="Hello, it is mail API testing";
        String subject ="CodersArea: MAil testting";
        String to="shekhawatashu46@gmail.com";
        String from ="ashu.shekhawat@lmdconsulting.com";
        
        sendEmail(message,subject, to, from);
        
    }

    //this method is responsible for sending emails
	/**
	 * @param message
	 * @param subject
	 * @param to
	 * @param from
	 */
	private static void sendEmail(String message, String subject, String to, String from) {

String host="smtp.ionos.com";
 Properties properties= System.getProperties();
 
 //set host
 properties.put("mail.smtp.host", host);
 properties.put("mail.smptp.port", "465");
 properties.put("mail.smptp.ssl.enable", "true");
 properties.put("mail.smptp.auth", "true");
 
 
 // your credentials       
 String username = "ashu.shekhawat@lmdconsulting.com"; // or API key, I used API key
 String password = "s#}D,v6X!wyZ";
 
 
 Session session=Session.getInstance(properties);
 MimeMessage mimeMessage= new MimeMessage(session);

 // get the transport instance from the freshly created session
 // pass the valid protocol name, here the SMTP is used
 


 // connect to the transport instance with your credentials
Transport transport = null;
try {
	transport = session.getTransport("smtp");
} catch (NoSuchProviderException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 Object emai="hdchd";


 // send the message
 try {
	transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
} catch (MessagingException e) {
	// TODO Auto	-generated catch block
	e.printStackTrace();
}
int port=465;
//connect to the transport instance with your credentials
 try {
	transport.connect(host, port, username,password);
} catch (MessagingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

 // send the message
 try {
	transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
} catch (MessagingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

 
 
 
 
// Session session=Session.getInstance(properties, new Authenticator() {
//
//	@Override
//	protected PasswordAuthentication getPasswordAuthentication() {
//		// TODO Auto-generated method stub
//		return 	new PasswordAuthentication("ashu.shekhawat@lmdconsulting.com","s#}D,v6X!wyZ");	
//	}
//
// });
//		session.setDebug(true);
//		
//		MimeMessage mimeMessage= new MimeMessage(session);
//		
//		try {
//			mimeMessage.setFrom(from);
//			
//			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			mimeMessage.setSubject(subject);
//			mimeMessage.setText(message);
//			
//			Transport.send(mimeMessage);
//			System.out.println("success....");
//			
//		} catch (MessagingException e) {
//			e.printStackTrace();
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
