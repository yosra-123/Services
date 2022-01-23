package StringConcat;

import static javax.script.ScriptEngine.NAME;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.jar.Attributes.Name;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import StringConcat.SOAPADD;

public class SOAPADD {
	static Concatunation.SOAPADD Add;
	
	 public static void main(String[] args) throws IOException, SOAPException {
	        try{
	            MessageFactory myMsgFct = MessageFactory.newInstance();
	            SOAPMessage message = myMsgFct.createMessage();
	            SOAPHeader entete = message.getSOAPHeader();
	            entete.detachNode();
	            MimeHeaders mimeHeader = message.getMimeHeaders();
	            mimeHeader.setHeader("SOAPAction", "http://Services/Add ");
	            SOAPPart mySPart = message.getSOAPPart();
	            SOAPEnvelope myEnvp = mySPart.getEnvelope();
	            SOAPBody body = myEnvp.getBody();
	            
	            
	            
	            Name bodyName = (Name) myEnvp.createName("ADD","","http://Addition/Add");
	            SOAPBodyElement bdEl = body.addBodyElement((javax.xml.soap.Name) bodyName);
	            
	            Name myContent = (Name) myEnvp.createName("a");
	            SOAPElement mySymbol = bdEl.addChildElement((javax.xml.soap.Name) myContent);
	            mySymbol.addTextNode("");
	            
	            Name myContent1 = (Name) myEnvp.createName("b");
	            SOAPElement mySymbol2 = bdEl.addChildElement((javax.xml.soap.Name) myContent1);
	            mySymbol.addTextNode("");
	            
	            
	            
	            
	            java.net.URL adresse = new URL("http://Addition");
	           SOAPConnectionFactory myFct =  SOAPConnectionFactory.newInstance();
	           
	            SOAPConnection myCon = myFct.createConnection();
	            SOAPMessage reponse = myCon.call(message,adresse);
	            myCon.close();
	            SOAPBody corpsReponse = reponse.getSOAPBody();
	            Iterator<SOAPBodyElement>it2=corpsReponse.getChildElements();
	            while(it2.hasNext()){
	                SOAPBodyElement elementReponse = it2.next();
	                if (elementReponse.getNodeName().equalsIgnoreCase("ADDResponse")){
	                System.out.println("Result: "+ elementReponse.getFirstChild().getTextContent());
	                }
	            }
	        }
	        catch (MalformedURLException e){
	            e.printStackTrace();
	        }
	        catch (UnsupportedOperationException e){
	          e.printStackTrace();
	        }
	         catch (SOAPException e){
	          e.printStackTrace();
	        }
	    }

}
