package uu.xml;

import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class AnaliseXml {
	
	@Test
	public void test() throws ParserConfigurationException, SAXException, IOException{
		// 1  create a factory
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		// 2 get the  analyze of document
	 DocumentBuilder db =dbf.newDocumentBuilder();  
		// 3 analyze the document
	
		Document d=(Document) db.parse("E:\\About Code\\xml\\dtd1.xml");
	
	}
}
