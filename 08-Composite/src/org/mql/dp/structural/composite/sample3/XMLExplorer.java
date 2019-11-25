package org.mql.dp.structural.composite.sample3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.mql.dp.structural.composite.Component;
import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLExplorer {

	public XMLExplorer() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Node doc =  builder.parse("resources/web_ex.xml");
			Node root = doc.getFirstChild();
			while(root.getNodeType() != Node.ELEMENT_NODE) {
				root = root.getNextSibling();
			}
			Component xml = explore(root);
			xml.operation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Component explore(Node doc) {
		NodeList childs = doc.getChildNodes();
		if(doc.getNodeType() == Node.ELEMENT_NODE ) {
			if(doc.getChildNodes().getLength() == 0) {
				return new Leaf(doc.getNodeName());
			}else {
				Composite composite = new Composite(doc.getNodeName());
				for (int i = 0; i < childs.getLength() ; i++) {
					Component item = explore(childs.item(i));
					if(item!=null) {
						composite.add(explore(childs.item(i)));
					}
				}
				return composite;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		new XMLExplorer();

	}

}
