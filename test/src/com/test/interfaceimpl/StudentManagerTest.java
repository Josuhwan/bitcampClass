package com.test.interfaceimpl;

import java.util.ArrayList;
import java.util.List;

public class StudentManagerTest {
	
	public static void main(String[] args) {
		
		StudentManagerImpl students = new StudentManagerImpl();
		
		StudentVO svo1 = new StudentVO("1", "박지성", 100, 90, 68);
		StudentVO svo2 = new StudentVO("2", "박찬호", 90, 80, 78);
		StudentVO svo3 = new StudentVO("3", "김연경", 90, 50, 80);
		StudentVO svo4 = new StudentVO("4", "손흥민", 87, 48, 87);
		StudentVO svo5 = new StudentVO("5", "손흥민", 99, 85, 97);
		
		students.insert(svo1);
		students.insert(svo2);
		students.insert(svo3);
		students.insert(svo4);
		students.insert(svo5);
		
		students.printData();
		System.out.println("--------------------------------------------");
		System.out.println("1번학생 찾기 : " + students.selectOne("1"));
		System.out.println("--------------------------------------------");
		System.out.println("손흥민 찾기 : " + students.selectList("손흥민"));
		System.out.println("--------------------------------------------");
		
	
		List<StudentVO> selectAll = students.selectAll();
		
		System.out.println("전체 : " + selectAll);
		
		System.out.println("--------------------------------------------");
		System.out.println("수정 전 5번 : " + students.selectOne("5"));	
		students.update(svo5);
		System.out.println("수정 후 5번 : " + students.selectOne("5"));
		
		System.out.println("--------------------------------------------");
		
		students.delete("4");
		
		System.out.println("삭제 후 전체 : " + selectAll);
	}
}
