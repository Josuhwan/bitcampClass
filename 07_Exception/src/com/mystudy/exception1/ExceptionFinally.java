package com.mystudy.exception1;

public class ExceptionFinally {
	
	public static void main(String[] args) {
		System.out.println("-- main 시작 --");
		int num = 20;
		int result = 0;
		
		try {
			System.out.println(">> try 문 시작");
			num = 0;
			result = 100 / num;
			
			System.out.println(">> 연산처리 정상 실행");
			System.out.println(">> try 문 끝");
		} catch(ArithmeticException e) {
			System.out.println(">>>> catch문 실행");
		} finally {
			System.out.println("****>>>>>>>> 항상실행 finally");
		}
		System.out.println(">>finally 다음문장");
		System.out.println("result : " + result);
		
		System.out.println("-- main 끝 --");
		
	}
}
