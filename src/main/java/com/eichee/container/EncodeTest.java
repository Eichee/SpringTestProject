package com.eichee.container;

import java.io.UnsupportedEncodingException;

import javax.xml.bind.DatatypeConverter;

public class EncodeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes="34381217".getBytes("utf-8");
		String encoded=DatatypeConverter.printBase64Binary(bytes);
		
		byte[] decoded=DatatypeConverter.parseBase64Binary(encoded);
		
		
		System.out.println(encoded);
		System.out.println(new String(decoded,"utf-8"));
		
		String str="bsnQH9h6Po0=";
		byte[] bt=DatatypeConverter.parseBase64Binary(str);
		System.out.println(new String(bt,"UTF-16LE"));
	}
}
