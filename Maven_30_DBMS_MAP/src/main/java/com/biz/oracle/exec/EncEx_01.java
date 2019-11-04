package com.biz.oracle.exec;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "USERID";
		String password = "PASSWORD";
		String salt = "com.biz.oracle";

		// 문자열을 암호화 시키기 위한 클래스
		StandardPBEStringEncryptor pbEnc 
				= new StandardPBEStringEncryptor();
		
		// 암호화 타입
		// MD5 또는 DES형식의 암호화 타입
		// 가장 쉽게 접근할수 있는 암호화 타입
		// jasypt만으로 암호화 시키는 방법
		String encType = "PBEWithMD5AndDES";
		
		// MD5, DES방식으로 암호화를 하고 Key값으로 salt 문자열을
		// 사용하라
		pbEnc.setAlgorithm(encType);
		pbEnc.setPassword(salt);
		
		String encUser = pbEnc.encrypt(user);
		String encPassword = pbEnc.encrypt(password);

		System.out.printf("%s -> %s\n",user,encUser);
		System.out.printf("%s -> %s\n",password,encPassword);
		/*
		 * 
		 * iolist2 -> m+1okBxj0YzuyhJUNch7lQ==
		 * iolist2 -> 7c1ecTD681/ANstF+TZJFA==
		 * 
		 */
	}

}
