package uu.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DomAnalise {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		// 1  create a document factory
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		
		//2 get a document anailse
		DocumentBuilder builder=factory.newDocumentBuilder();
		
		//3 get the specific document
		org.w3c.dom.Document document=builder.parse("dtd.xml");
		
		NodeList child=document.getChildNodes();
		for(int i=0;i<child.getLength();i++){
			System.out.println(child.item(i).getNodeName());
		}
	}

}
