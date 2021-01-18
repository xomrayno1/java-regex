package com.tam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Regex Expression
 */
public class App {
	// . chỉ một kí tự bất kì , nếu nhiều hơn sẽ false
	// .* kí tự đươc phép xuất hiện 0 hoặc nhiều lần
	// ^g bắt đầu là g và chỉ duy nhất 1 kí tự 
	// ^g.+ bắt đầu là g và kí tự ở  sau  xuất hiện 1 hoặc nhiều lần
	// r$ kết thúc bằng r chỉ 1 kí tự, nhiều nhiều hơn 1 false\
	//.{1,6}r$ kí tự bất kì xuất hiện 6 lần và kết thúc là r 
	// gpcoder -> gpcode 6 lần , r : kết thúc là r
	
	//.*[a-zA-z]  mọi kí tự là a-zA-z 
	//.*[0-9] mọi kí tự là số
	//.*[a-zA-z].*[0-9] : mọi kí tự là chữ , sau đó mọi kí tự là số
	public static void main(String[] args) {
		String str = "gpcoder2342";
		String regex = ".*[a-zA-z].*[0-9]";
		Pattern pattern = Pattern.compile(regex);
		//tạo đối tượng method thông qua method tĩnh
		Matcher matcher = pattern.matcher(str);
		// sử dụng tìm kiếm mẫu trong 1 chuổi
		//và trả về một Matcher chứa thông tin tìm kiếm đã hiện thực
		 
		boolean isCheck = matcher.matches();
		//check mẫu có khớp
		// matcher.find();  nếu tìm thấy mẫu trả về true ngước lại false
		System.out.println(isCheck);
	}
}
