package edb.diagrams.model;

import java.awt.Color;
import java.awt.Font;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Hashtable;
import java.util.Vector;

import org.jfree.chart.imagemap.ImageMapUtilities;

import exp.BoaConstructor;
import runtime.data.Key;
import values.Located;

public class Serializer {

	Hashtable<Object, Integer>	idTable				= new Hashtable<Object, Integer>();
	PrintStream									out;
	int													counter				= 0;
	int													indent				= 0;
	boolean											humanReadable	= false;

	public Serializer(PrintStream out) {
		super();
		this.out = out;
	}

	public int newId() {
		return counter++;
	}

	public void start(String s) {
		print(s);
		indent++;
	}

	public void end(String s) {
		indent--;
		print(s);
	}

	public void print(String s) {
		if (humanReadable) {
			for (int i = 0; i < indent; i++)
				out.print(" ");
			out.println(s);
		} else
			out.print(s);
	}

	public void serialize(Object o) {
		if (o == null)
			print("<Null/>");
		else if (o instanceof Integer) {
			print("<Int value='" + o + "'/>");
		} else if (o instanceof Boolean) {
			print("<Bool value='" + o + "'/>");
		} else if (o instanceof String) {
			print("<Str value='" + ImageMapUtilities.htmlEscape((String) o) + "'/>");
		} else if (o instanceof Double) {
			print("<Double value='" + o + "'/>");
		} else if (o.getClass().isEnum()) {
			print("<Enum class='" + o.getClass().getName() + "' name = '" + o + "'/>");
		} else if (o instanceof Vector && ((Vector) o).isEmpty()) {
			print("<EmptyVector/>");
		} else if (o instanceof Color) {
			Color c = (Color) o;
			print("<Color value = '" + c.getRGB() + "'/>");
		} else if (o instanceof Font) {
			Font f = (Font) o;
			print("<Font value = '" + f.getName() + " " + f.getStyle() + " " + f.getSize() + "'/>");
		} else if (o instanceof Key) {
			Key k = (Key) o;
			print("<Key name = '" + k.getString() + "'/>");
		} else {
			if (idTable.containsKey(o)) {
				print("<Ref id='" + idTable.get(o) + "'/>");
			} else {
				int id = newId();
				idTable.put(o, id);
				if (o.getClass().isArray()) {
					Class<?> c = o.getClass();
					Object[] a = (Object[]) o;
					start("<Array id='" + id + "' length='" + a.length + "' class = '" + c.getComponentType().getName() + "'>");
					for (Object e : a) {
						serialize(e);
					}
					end("</Array>");
				} else {
					if (o instanceof Vector) {
						Vector<Object> v = (Vector) o;
						start("<Vector id='" + id + "'>");
						for (Object element : v) {
							serialize(element);
						}
						end("</Vector>");
					} else {
						if (o.getClass().isAnnotationPresent(BoaConstructor.class)) {
							serializeAnnotatedObject(o, id);
						} else
							out.println("ERROR: " + o);
					}
				}
			}
		}
	}

	private void serializeAnnotatedObject(Object o, int id) {
		if (o instanceof Located) {
			Located located = (Located) o;
			int start = located.getLineStart();
			int end = located.getLineEnd();
			start("<Located class='" + o.getClass().getName() + "' id='" + id + "' start='" + start + "' end = '" + end + "'>");
			serializeAnnotatedFields(o.getClass(), o);
			end("</Located>");
		} else {
			start("<Obj class='" + o.getClass().getName() + "' id='" + id + "'>");
			serializeAnnotatedFields(o.getClass(), o);
			end("</Obj>");
		}
	}

	private void serializeAnnotatedFields(Class<?> k, Object o) {
		if (k.isAnnotationPresent(BoaConstructor.class)) {
			BoaConstructor c = k.getAnnotation(BoaConstructor.class);
			String[] fields = c.fields();
			for (String field : fields) {
				try {
					Field f = o.getClass().getField(field);
					Object fieldValue = f.get(o);
					start("<Field name='" + f.getName() + "'>");
					serialize(fieldValue);
					end("</Field>");
				} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
					System.err.println("Field: " + o + "." + field);
					e.printStackTrace(System.err);
				}
			}
			serializeAnnotatedFields(k.getSuperclass(), o);
		}
	}

}
