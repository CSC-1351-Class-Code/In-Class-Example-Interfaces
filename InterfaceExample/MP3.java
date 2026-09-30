package InterfaceExample;

import java.io.File;

import InterfaceExample.__.__;
import InterfaceExample.__.__;

// MP3s are a File that can be saved and loaded, so we implement the interface FileType
// They also have a playable aspect, so we implement Playable
public class MP3 implements __, __{
	File[] frames;

	// Methods from FileType
	public void __(File f){
		System.out.println("Loading a MP3");
	}

	public void __(){
		System.out.println("Saving a MP3");
	}

	// Methods from Playable
	public void __(){
		System.out.println("Playing a MP3");
	}

}
