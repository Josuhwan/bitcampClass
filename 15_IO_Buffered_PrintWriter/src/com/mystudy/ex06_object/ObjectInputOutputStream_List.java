package com.mystudy.ex06_object;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutputStream_List {
	
	public static void main(String[] args) {
		// StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고
		// 파일에서 읽어들인  ArrayList 객체에 담긴 VO 정보를 화면에 출력
		File file = new File("file/object_io_list.data");
		
		System.out.println(">> 저장할 데이터 작성");
		StudentVO stu1 = new StudentVO("21001", "김유신", 95, 90, 85);
		StudentVO stu2 = new StudentVO("21002", "홍길동", 100, 90, 81);
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		System.out.println("=============================");
		
		// ArrayList에 담기
		List<StudentVO> list = new ArrayList<>();
		
		list.add(stu1);
		list.add(stu2);
		
		System.out.println("list : " + list);
		// ArrayList 타입의 객체를 파일에 저장(Output)
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// 파일에 저장된 ArrayList 객체를 읽어서 화면출력(Input)
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			List<StudentVO> listIn = (List<StudentVO>) ois.readObject();
			System.out.println("----------------");
			System.out.println(listIn);
			System.out.println("----------------");
			
			for (int i = 0; i < listIn.size(); i++ ) {
				StudentVO stvo = list.get(i);
				System.out.println(stvo.getName() +" "+ stvo.getKor());
			}
				
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
