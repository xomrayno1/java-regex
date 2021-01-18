package com.tam.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {
	// check khoản trắng đầu và cuối câu
	// \\S So khớp với bất kỳ ký tự không phải ký tự trống
	// \\s so khớp với bất kỳ ký tự trống nào
	public static void main(String[] args) {
		String regex = "^[ \\s]+|[ \\s]$";
		String strTest = "Tran Hung Dao"; // hợp lệ true, 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(strTest);
		boolean isCheck = matcher.matches();
		System.out.println(isCheck);
	}

}
