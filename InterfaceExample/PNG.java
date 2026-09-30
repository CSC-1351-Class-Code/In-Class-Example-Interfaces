package InterfaceExample;

import java.io.File;

import InterfaceExample.__.__;

// PNGs are a File that can be saved and loaded, so we implement the interface FileType
public class PNG implements __ {
	// Methods from FileType
	public void __(File f){
		System.out.println("Loading a PNG");
	}

	public void __(){
		System.out.println("Saving a PNG");
	}
}
