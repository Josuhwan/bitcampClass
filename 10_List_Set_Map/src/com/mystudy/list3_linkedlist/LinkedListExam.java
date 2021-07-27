package com.mystudy.list3_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// LinkedList : List 속성
		LinkedList<String> list = new LinkedList<>();
		list.add("홍길동");
//		list.add("홍길동");
//		list.add("김유신");
		System.out.println("list : " + list);
		System.out.println(list.get(0));
		
		String str = "홍길동,김유신,강감찬,을지문덕,홍경래";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));
		
		//배열에 있는 데이터를 리스트에 추가
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		//---------------------
		
	}

}










