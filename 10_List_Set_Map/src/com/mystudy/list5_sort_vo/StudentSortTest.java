package com.mystudy.list5_sort_vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StudentSortTest {

	public static void main(String[] args) {
		StudentVO svo1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO svo2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO svo3 = new StudentVO("김유신", 90, 87, 77);
		
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(svo1);
		list.add(svo2);
		list.add(svo3);
		
		printData(list);
		
		System.out.println("-------- sort 진행전 ---------");
		printData(list);
		
		Collections.sort(list);
		
		System.out.println("-------- sort 진행후 ---------");
		
		printData(list);
	}
	
	private static void printData(ArrayList<StudentVO> list) {
		for(StudentVO vo : list) {
			vo.printData();
		}
	}	
}
