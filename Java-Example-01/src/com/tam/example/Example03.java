package com.tam.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {
	 
	// \\S So khớp với bất kỳ ký tự không phải ký tự trống
	// \\s so khớp với bất kỳ ký tự trống nào
	// \\D => bắt buộc chữ => true , số => false 
	// \\d => bắt buộc số => true , chữ => false
	public static void main(String[] args) {
		//check sdt  từ 8 -11 số  , phải là số ;
		
		String regex = "^0\\d{8,11}$";
		//^0 bắt đầu là 0 
		// \\d kí từ số
		//8-11 kí tự 
		//$ kết thúc
		Pattern pattern = Pattern.compile(regex);
		boolean isCheck = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập số điện thoại !");
			String phone = sc.nextLine();
			Matcher matcher = pattern.matcher(phone);
			isCheck = matcher.matches();
		}while(!isCheck);
		 System.out.println(isCheck);
	}

}
