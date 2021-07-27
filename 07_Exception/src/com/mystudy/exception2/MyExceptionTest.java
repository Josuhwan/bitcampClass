package com.mystudy.exception2;

public class MyExceptionTest {

	public static void main(String[] args) {
		System.out.println("----main() 시작------");
//		try {
//			throw new MyException();
//		} catch(Exception e) {
//			
//		} // 잡아서 처리하는 방식
		
		// try ~ catch 구문을 통한 예외처리
		try {
			firstMethod();
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(">> main-catch문 실행");
			System.out.println(">> 오류메시지 : " + e.getMessage());
		}
		
		System.out.println("----main() 끝------");

	}
	
	// throws 선언을 통한 예외처리
	static void firstMethod() throws MyException {
		System.out.println("--- firstMethod() 시작 ---");
		secondMethod();
		System.out.println("--- firstMethod() 끝 ---");
	}
	
	static void secondMethod() throws MyException { // 던지는 방식
		System.out.println("--- secondMethod() 시작 ---");
		// 예외 발생시키기
		throw new MyException("secondMethod()에서 예외발생");
//		System.out.println("--- secondMethod() 끝 ---");
	}
}
