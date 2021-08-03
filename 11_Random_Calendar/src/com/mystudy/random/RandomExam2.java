package com.mystudy.random;

import java.util.Calendar;

public class RandomExam2 {

	public static void main(String[] args) {
		//(실습) 오늘 당신의 행운지수 알아보기(0~100)
		//Math.random(), Random 사용해서 행운지수 값 만들기
		//실행결과
		//2021년 7월 29일 당신의 행운지수(0~100)는 77입니다.
		//-------------------------------
		
		//행운지수 값 만들기
		int result = 0;
		System.out.println("오늘 나의 행운지수는 얼마일까요?");
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 0 ~ 11 + 1
		int date = calendar.get(Calendar.DATE);
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		String yyyymmdd = year + "년 " + month + "월 " + date + "일";
		System.out.println("------------------");
		
		//방법1 - Random nextInt(숫자)
		
		
		//방법2 - Math.random() 
		
	}

}



