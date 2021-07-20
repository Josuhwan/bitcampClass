package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {
	
	public static void main(String[] args) {
		// StringBuffer 클래스
		int num = 100;
		String str1 = "Hello"; // 사용가능
		String str = new String("Hello Java!!!");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		System.out.println(sb.toString());
		String sbValue = sb.toString();
		System.out.println("sb.toString() : " + sbValue);
		
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println("----------StringBuffer -----------");
		sb.append("반갑습니다").append("@@@@@@");
		System.out.println(sb);
		
		sb.reverse(); // 문자열 뒤집기
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		System.out.println("-------------- delete(), insert(), replace() ----------");
		// Hello Java!!!반갑습니다@@@@@@
		System.out.println("sb.delete(0, 6) : " +sb.delete(0, 6));
		System.out.println(sb);
		
		sb.insert(0, "Hello "); // 삽입(추가, 입력)
		System.out.println(sb);
		
		// replace(int start, int end, String str
		sb.replace(0, 5, "Hi,"); // 수정
		System.out.println(sb);
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity()); // 용량
		
		// ==========================================
		
	}
}
