package com.mystudy.calendar;

import java.util.Date;

public class CalendarExam {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("new Date() : " + date);
		
		// 년 : 입력 된 년도 값에 1900이 더해진 결과값이 사용됨
		date = new Date(2021 - 1900, 7, 29);
		System.out.println(date);
	}
}
