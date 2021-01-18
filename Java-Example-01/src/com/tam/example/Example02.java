package com.tam.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example02 {
	//formate date
	//[-|/]  - hoăc /
	public static void main(String[] args) {
		String regex = "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
		String dateTest = "06-09-2021";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dateTest);
		boolean isCheck = matcher.matches();
		System.out.println(isCheck);
	}

}
