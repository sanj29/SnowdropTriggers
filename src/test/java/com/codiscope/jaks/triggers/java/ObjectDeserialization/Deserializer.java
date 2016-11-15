package com.codiscope.jaks.triggers.java.ObjectDeserialization;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserializer {
	/*private final byte[] bytes;

	public Deserializer(byte[] bytes) { this.bytes = bytes; }

	public Object call() throws Exception {
		return deserialize(bytes);
	}

	public static Object deserialize(final byte[] serialized) throws IOException, ClassNotFoundException {
		final ByteArrayInputStream in = new ByteArrayInputStream(serialized);
		return deserialize(in);
	}

	public static Object deserialize(final InputStream in) throws ClassNotFoundException, IOException {
		final ObjectInputStream objIn = new ObjectInputStream(in);
		return objIn.readObject();
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		final InputStream in =  args.length == 0 ? System.in : new FileInputStream(new File(args[0]));
		Object object = deserialize(in);
	}*/
	
	public Object deserializeObject(InputStream receivedFile) throws IOException, ClassNotFoundException {

	    try (ObjectInputStream in = new ObjectInputStream(receivedFile)) {
	        return (Object) in.readObject();
	    }
	}
}
