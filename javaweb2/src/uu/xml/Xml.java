package uu.xml;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.w3c.dom.Document;

public class Xml {
	
	@Test
	public void test() throws Exception{
		
		//   1  get the factory 
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		
		//  2  get the Builder
		DocumentBuilder builder =factory.newDocumentBuilder();
		
		InputStream xml=new FileInputStream("E:\\About Code\\xml\\dtd1.xml");
		//  3 get the Document
		Document document=builder.parse(xml);
	}

}
