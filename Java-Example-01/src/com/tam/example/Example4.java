package com.tam.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
	//https://codelearn.io/sharing/regular-expression-trong-java
	//https://viblo.asia/p/mot-so-vi-du-ve-su-dung-regex-trong-java-gkyREowZznv
	public static void main(String[] args) {
		//regex email
		final String regexEmail = "\\b[\\w.%-]+@[a-zA-Z0-9\\d]+\\.[a-z]{2,4}\\b";
		//final String regexEmail = "\\b[\\w.%-]+@[a-zA-Z\\d.-]+\\.[a-z]{2,4}\\b";
		// \b ranh giới 1 từ sau đó là kí tự  + @ và các điều kiện +\\.
		// \b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b
		//https://www.it-swarm-vi.tech/vi/java/email-regex-java/941333284/
		Pattern pattern = Pattern.compile(regexEmail);
		boolean isCheck = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập Email  !");
			String email = sc.nextLine();
			Matcher matcher = pattern.matcher(email);
			isCheck = matcher.matches();
		}while(!isCheck);
		 System.out.println(isCheck);
	}

}
