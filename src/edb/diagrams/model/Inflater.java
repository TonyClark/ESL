package edb.diagrams.model;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import runtime.data.Key;
import values.Located;

public class Inflater {

	File												file;
	Hashtable<Integer, Object>	idTable	= new Hashtable<Integer, Object>();

	public Inflater(File file) {
		super();
		this.file = file;
	}

	public Object inflate() {
		try {
			if (file.exists()) {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(file);
				doc.getDocumentElement().normalize();
				org.w3c.dom.Node node = doc.getFirstChild();
				return inflate(node);
			}
		} catch (IOException e) {
			e.printStackTrace(System.err);
		} catch (ParserConfigurationException e) {
			e.printStackTrace(System.err);
		} catch (SAXException e) {
			e.printStackTrace(System.err);
		} catch (Throwable t) {
			t.printStackTrace(System.err);
		}
		return null;
	}

	private Object inflate(org.w3c.dom.Node node) {
		String tag = node.getNodeName();
		if (tag.equals("Int"))
			return Integer.parseInt(attributeValue(node, "value"));
		else if (tag.equals("Bool"))
			return Boolean.parseBoolean(attributeValue(node, "value"));
		else if (tag.equals("Str"))
			return attributeValue(node, "value");
		else if (tag.equals("Double"))
			return Double.parseDouble(attributeValue(node, "value"));
		else if (tag.equals("Null"))
			return null;
		else if (tag.equals("EmptyVector"))
			return new Vector<Object>();
		else if (tag.equals("Vector"))
			return inflateVector(node);
		else if (tag.equals("Array"))
			return inflateArray(node);
		else if (tag.equals("Enum"))
			return inflateEnum(node);
		else if (tag.equals("Ref"))
			return inflateRef(node);
		else if (tag.equals("Located"))
			return inflateLocated(node);
		else if (tag.equals("Obj"))
			return inflateObj(node);
		else if (tag.equals("Key"))
			return inflateKey(node);
		else if (tag.equals("Color"))
			return inflateColor(node);
		else if (tag.equals("Font"))
			return inflateFont(node);
		else
			throw new Error("unknown tag " + node.getNodeName());
	}

	private Object inflateLocated(Node node) {
		Located located = (Located) inflateObj(node);
		int start = Integer.parseInt(attributeValue(node, "start"));
		int end = Integer.parseInt(attributeValue(node, "end"));
		located.setLineStart(start);
		located.setLineEnd(end);
		return located;
	}

	private Object inflateFont(org.w3c.dom.Node node) {
		return Font.decode(attributeValue(node, "value"));
	}

	private Object inflateColor(org.w3c.dom.Node node) {
		return Color.decode(attributeValue(node, "value"));
	}

	private Object inflateKey(org.w3c.dom.Node node) {
		return Key.getKey(attributeValue(node, "name"));
	}

	private Object inflateObj(org.w3c.dom.Node node) {
		String className = attributeValue(node, "class");
		int id = Integer.parseInt(attributeValue(node, "id"));
		try {
			Class<?> c = Class.forName(className);
			Object o = c.newInstance();
			idTable.put(id, o);
			NodeList ns = node.getChildNodes();
			for (int i = 0; i < ns.getLength(); i++) {
				org.w3c.dom.Node fieldNode = ns.item(i);
				String fieldName = attributeValue(fieldNode, "name");
				java.lang.reflect.Field field = c.getField(fieldName);
				Object value = inflate(fieldNode.getChildNodes().item(0));
				field.set(o, value);
			}
			return o;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private Object inflateRef(org.w3c.dom.Node node) {
		return idTable.get(Integer.parseInt(attributeValue(node, "id")));
	}

	private Object inflateEnum(org.w3c.dom.Node node) {
		String enumClass = attributeValue(node, "class");
		String name = attributeValue(node, "name");
		Class<?> c;
		try {
			c = Class.forName(enumClass);
			for (Object o : c.getEnumConstants()) {
				if (o.toString().equals(name)) return o;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		throw new Error("cannot find " + name + " in " + enumClass);
	}

	private Object inflateArray(org.w3c.dom.Node node) {
		int id = Integer.parseInt(attributeValue(node, "id"));
		int length = Integer.parseInt(attributeValue(node, "length"));
		String className = attributeValue(node, "class");
		try {
			Class<?> c = Class.forName(className);
			Object[] a = (Object[]) Array.newInstance(c, length);
			idTable.put(id, a);
			NodeList ns = node.getChildNodes();
			for (int i = 0; i < ns.getLength(); i++) {
				a[i] = inflate(ns.item(i));
			}
			return a;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Object inflateVector(org.w3c.dom.Node node) {
		int id = Integer.parseInt(attributeValue(node, "id"));
		Vector<Object> v = new Vector<Object>();
		idTable.put(id, v);
		NodeList ns = node.getChildNodes();
		for (int i = 0; i < ns.getLength(); i++) {
			v.add(inflate(ns.item(i)));
		}
		return v;
	}

	public static String attributeValue(org.w3c.dom.Node node, String name) {
		NamedNodeMap attrs = node.getAttributes();
		for (int i = 0; i < attrs.getLength(); i++) {
			Attr attribute = (Attr) attrs.item(i);
			if (attribute.getName().equals(name)) return attribute.getValue();
		}
		return null;
	}

	public static String attributeValue(org.w3c.dom.Node node, String name, String defaultValue) {
		String value = attributeValue(node, name);
		if (value == null)
			return defaultValue;
		else
			return value;
	}

}
