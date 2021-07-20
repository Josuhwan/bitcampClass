package com.mystudy.string;

public class Ex01_String {
	
	public static void main(String[] args) {
	// String 클래스 : 문자열 저장, 처리하기 위한 클래스
	// 사용형식 2가지
	// String str = "홍길동" // 기본 데이터 타입처럼 사용
	// String str = new String("홍길동"); // 객체(인스턴스) 생성 사용
	//---------------------------
	
	String str1 = "Java";
	String str2 = "World";
	String strObj1 = new String("Java");
	String strObj2 = new String("World");
	System.out.println("str1 : "+ str1);
	System.out.println("strObj1 : " + strObj1);
	
	String str11 = "Java";
	
	// 참조형 데이터 비교 == : 객체비교(객체 주소값 비교)
	System.out.println("str1 == str11 : " + str1 == str11);
	
	}
}
