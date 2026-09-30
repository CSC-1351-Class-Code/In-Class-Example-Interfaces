package InterfaceExample;

import java.io.File;

import InterfaceExample.__.__;
import InterfaceExample.__.__;

// GIFs are a File that can be saved and loaded, so we implement the interface FileType
// They also have a playable aspect, so we implement Playable
public class GIF implements __, __{

	// Methods from FileType
	public void __(File f){
		System.out.println("Loading a GIF");
	}

	public void __(){
		System.out.println("Saving a GIF");
	}

	// Methods from Playable
	public void __(){
		System.out.println("Playing a GIF");
	}

}
