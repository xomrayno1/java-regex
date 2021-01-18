package com.tam.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example01 { 
	//https://codelearn.io/sharing/regular-expression-trong-java
	// \d : viết tắt [0-9]
	// _- không có khoảng trắng và phải không dấu
	public static void main(String[] args) {
		//formate username có độ dài từ 6 - 12 , không có khoảng trắng và không dấu
		
		String regex = "[a-z0-9_-]{6,12}$";
		String username  = "xomrayno5";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(username);
		boolean isCheck = matcher.matches();
		System.out.println(isCheck);
	}

}
