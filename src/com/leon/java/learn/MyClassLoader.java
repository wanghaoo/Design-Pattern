package com.leon.java.learn;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader{
	
	public Class<?> findClass (String className) {
		try {
			byte[] byteArray = loadClassData(className);
			return this.defineClass(null, byteArray, 0, byteArray.length);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public byte[] loadClassData(String name) throws IOException {
		assert name != null;
		File file = new File(name);
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int ns = 0;
		while ((ns = fis.read()) != -1) {
			baos.write(ns);
		}
		return baos.toByteArray();
		
	}

}
