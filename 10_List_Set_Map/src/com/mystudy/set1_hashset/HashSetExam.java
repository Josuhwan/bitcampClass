package com.mystudy.set1_hashset;

import java.util.HashSet;

public class HashSetExam {
	
	public static void main(String[] args) {
		// HashSet : Set 인터페이스를 구현한 구현체(클래스)
		// 순서가 없고, 중복데이터 허용안함(동일데이터는 하나만 저장)
		// Set에서 동일데이터 여부 확인은 hashCode(), equals() 값 확인
		// 1. 해쉬코드 값 확인 : hashCode()
		// 2. equals() 메소드() 메소드 결과값이 모두 일치하면 동일데이터
		// -----------------------------------------------
		
		HashSet<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("홍길동");
		set.add("김유신");
		set.add(new String("홍길동"));
		"홍길동".hashCode();
		System.out.println("홍길동 해시코드 : " + "홍길동".hashCode());
		System.out.println("홍길동 해시코드 : " + "홍길동".hashCode());
		System.out.println(set);
		System.out.println("set.size() : " + set.size() );
	}
}
