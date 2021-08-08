package com.test.interfaceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerImpl implements StudentManger {
	
	List<StudentVO> list = new ArrayList<>();
	
	@Override
	public int insert(StudentVO vo) {
		for (StudentVO student : list) {
			if (student.getId().equals(vo.getId())) {
				System.out.println("중복된 값");
				return -1;
			}
		}
		list.add(vo);
		return 0;
	}

	@Override
	public StudentVO selectOne(String id) {
		for (StudentVO svo : list) {
			if (svo.getId().equals(id)) {
					return svo;
			}
		}
		return null;
	}

	@Override
	public List<StudentVO> selectList(String name) {
		List<StudentVO> list = new ArrayList<>();
		for (StudentVO svo : this.list) {
			if (svo.getName().equals(name)) {
				list.add(svo);
			}
		}
		return list;
	}

	@Override
	public List<StudentVO> selectAll() {
		return list;
	}

	@Override
	public int update(StudentVO vo) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 국어점수: ");
		System.out.print(">>");
		int kor = scan.nextInt();
		System.out.println("수정할 영어점수: ");
		System.out.print(">>");
		int eng = scan.nextInt();
		System.out.println("수정할 수학점수: ");
		System.out.print(">>");
		int math = scan.nextInt();
		
		for (StudentVO svo : list) {
			if (vo.getId().equals(svo.getId())) {
				vo.setKor(kor);
				vo.setEng(eng);
				vo.setMath(math);
	
			}
		}
		
		return 0;
	}

	@Override
	public int delete(String id) {
		StudentVO svo = selectOne(id);
		if(svo != null) {
			list.remove(svo);
		}
		return 0;
	}
	
	
	public void printData() {
		System.out.println(list);
	}

}
