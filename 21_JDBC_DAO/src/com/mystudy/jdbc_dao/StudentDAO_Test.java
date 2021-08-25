package com.mystudy.jdbc_dao;

import java.util.List;

public class StudentDAO_Test {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.selectAll();
		for (StudentVO svo : list) {
			System.out.println(svo);
		}
		
		System.out.println("------ 1개 데이터 조회(ID) ------");
		StudentVO vo = dao.selectOne("2021001");
		System.out.println(vo);
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println("-----------");
		
		StudentVO vo1 = new StudentVO("2021001", "test", 0, 0, 0);
		vo = dao.selectOne(vo1);
		System.out.println(vo);
		
//		System.out.println("---- 입력(INSERT) -----");
		StudentVO insertVO = new StudentVO("2021012", "테스트12", 100, 90, 82);
//		int result = dao.insert(insertVO);
//		System.out.println(">> 입력건수 : " + result);
//		
//		System.out.println("--- 입력데이터 조회 ---");
//		StudentVO insertResultVO = dao.selectOne(insertVO);
//		System.out.println(insertResultVO);

		System.out.println("----수정(UPDATE) ------------");
		
		
		System.out.println("----삭제(DELETE) ------------");
		dao.delete(insertVO.getId());
		dao.selectOne(insertVO);
		
	}

}








