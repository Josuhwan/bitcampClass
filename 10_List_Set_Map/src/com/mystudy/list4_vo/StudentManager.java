package com.mystudy.list4_vo;

import java.util.ArrayList;

public class StudentManager {
	
	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<>();
		
		StudentVO svo = new StudentVO(null, 0, 0, 0);
			
		svo.setName("홍길동");
		svo.setKor(100);
		svo.setEng(90);
		svo.setMath(81);
		
		list.add(svo);
		
		svo = new StudentVO(null, 0, 0, 0);
		
		svo.setName("이순신");
		svo.setKor(95);
		svo.setEng(88);
		svo.setMath(92);
	
		list.add(svo);	
		svo = new StudentVO("김유신", 90, 87, 77);
		list.add(svo);
		
		svo.printData();
		
		System.out.println(list);
		
		
		for(int i = 0; i < list.size(); i++) {
//			StudentVO vo = (StudentVO)list.get(i); // StudentVO <ㅡ Object
			StudentVO vo = list.get(i);
			vo.printData();
		}
		
		System.out.println("-----------");
		for(StudentVO vo : list) {
			vo.printData();
		}
		System.out.println("================");
		
		
	}
	
	
	private static void printData(ArrayList<StudentVO> list) {
		for(StudentVO vo : list) {
			vo.printData();
		}
		
	}	
}
