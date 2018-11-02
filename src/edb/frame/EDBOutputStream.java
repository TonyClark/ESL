package edb.frame;

import java.io.IOException;
import java.io.OutputStream;

public class EDBOutputStream extends OutputStream {
	
	EDBFrame frame;

	public EDBOutputStream(EDBFrame frame) {
		this.frame = frame;
	}

	public void write(int b) throws IOException {
		frame.write(b);
	}

}
