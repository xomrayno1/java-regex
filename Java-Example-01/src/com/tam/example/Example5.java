package com.tam.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 3. Kiểm tra password:
Ví dụ: + Phải chứa ít nhất 1 ký tự số từ 0 – 9
          + Phải chứa ít nhất 1 ký tự chữ thường
          + Phải chứa ít nhất 1 ký tự chữ hoa
          + Phải chứa ít nhất 1 ký tự trong tập các ký tự
 * 
 * */
public class Example5 {
	public static void main(String[] args) {
		final String regexPassword = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
		//(?=.*\\d) phải chứa 1 hoặc nhiều số
		//((số)(chữ thường)(chữ hoa)(kí tự đặc biệt).{6,20})
		//Capturing Groups cách nhau với {}  là dấu chấm
		//((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})
		//https://codelearn.io/sharing/regular-expression-trong-java
		Pattern pattern = Pattern.compile(regexPassword);
		boolean isCheck = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập Password  !");
			String phone = sc.nextLine();
			Matcher matcher = pattern.matcher(phone);
			isCheck = matcher.matches();
		}while(!isCheck);
		 System.out.println(isCheck);
	}

}
