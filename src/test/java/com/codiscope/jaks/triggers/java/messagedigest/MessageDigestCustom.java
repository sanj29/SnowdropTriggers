package com.codiscope.jaks.triggers.java.messagedigest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestCustom {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String str ="sanjay";
		
		MessageDigest sha256Digest = MessageDigest.getInstance("SHA-1");
		sha256Digest.update(str.getBytes());
		
		
		sha256Digest = MessageDigest.getInstance("SHA256");
		sha256Digest.update(str.getBytes());
	}


}
