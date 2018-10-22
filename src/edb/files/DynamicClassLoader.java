package edb.files;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

public class DynamicClassLoader extends ClassLoader {

	ClassLoader parent;

	public DynamicClassLoader(ClassLoader parent) {
		super(parent);
		this.parent = parent;
	}

	public Class loadClass(String name) throws ClassNotFoundException {
		if (!name.startsWith("esl.")) return Class.forName(name);
		if (name.equals("esl.lib.Lib")) return esl.lib.Lib.class;
		if (name.equals("esl.lib.ESLVal")) return esl.lib.ESLVal.class;
		if (name.startsWith("esl.lib")) return parent.loadClass(name);
		try {
			InputStream input = new FileInputStream("bin/" + name.replace(".", "/") + ".class");
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int data = input.read();

			while (data != -1) {
				buffer.write(data);
				data = input.read();
			}

			input.close();

			byte[] classData = buffer.toByteArray();

			return defineClass(name, classData, 0, classData.length);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}