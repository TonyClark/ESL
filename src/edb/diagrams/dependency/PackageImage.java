package edb.diagrams.dependency;

import edb.diagrams.displays.Image;
import exp.BoaConstructor;

@BoaConstructor(fields = {  })
public class PackageImage extends Image {

	public PackageImage() {
	}

	public PackageImage(String path, int width, int height) {
		super(path, width, height);
	}

}
