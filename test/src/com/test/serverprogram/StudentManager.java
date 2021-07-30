package com.test.serverprogram;

import java.util.HashSet;


public class StudentManager {

	public static void main(String[] args) {
		// 기본 생성 학생정보 3명
		//  "홍길동", 100, 90, 81
		//  "이순신", 95, 88, 92
		//  "김유신", 90, 87, 77
		//--------------------------------------
		//1. 제공된 3명과 추가한 2명 합계 5명의 학생데이터를 생성하시오.
		
		StudentVO svo1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO svo2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO svo3 = new StudentVO("김유신", 90, 87, 77);
		StudentVO svo4 = new StudentVO("윤봉길", 100, 99, 98);
		StudentVO svo5 = new StudentVO("유관순", 99, 100, 96);
		
		//2. 5명의 데이터를 선택한 List / Set / Map 타입의 저장공간을 만들고 저장하시오.
		
		HashSet<StudentVO> set = new HashSet<>();
		set.add(svo1);
		set.add(svo2);
		set.add(svo3);
		set.add(svo4);
		set.add(svo5);
		
		//3. 저장되어 있는 학생데이터를 성명, 국어, 영어, 수학, 총점, 평균을 목록형태로 화면출력하시오
		System.out.println(" 이름   국어   영어    수학     총점     평균");
		for (StudentVO svo : set) {
			svo.printData();
		}
		System.out.println("----------------------------------------------------");
		//4. <홍길동> 학생의 데이터 중 영어점수를 95점, 수학점수를 85점으로 수정하고 수정된 데이터를 출력하시오.
		for (StudentVO svo : set) {
			if("홍길동".equals(svo.getName())) {
				svo.setEng(95);
				svo.setMath(85);
				svo.printData();
			}
		}
		System.out.println("----------------------------------------------------");
		//5. 최종 처리 완료된 모든 학생 정보를 출력하시오.
		for (StudentVO svo : set) {
			svo.printData();
		}
		System.out.println("----------------------------------------------------");
		//6. 학생데이터 중 성명, 총점, 평균만 화면에 출력하시오
		System.out.println("이름   총점   평균");
		for (StudentVO svo : set) {
			System.out.println(svo.getName() +"  "+ svo.getTot() + "  "+ svo.getAvg());
		}
	}
	
}
