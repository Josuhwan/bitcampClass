package com.mystudy.reader_writer_filecopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		
		// FileReader, FileWriter 사용해서 파일 복사
		// 원본파일 : file/test_char.txt
		// 대상파일 : file/test_char_copy.txt
		// 처리 : 원본파일을 읽어서 대상파일에 쓰기/저장(문자단위 처리)
		// --------------------------------------------------
		
		// 0. 파일준비
		
		// 1. 파일로부터 읽어들이고, 쓸 객체를 저장할 변수 선언
		
		File file = new File("file/test_char.txt");
		File file2 = new File("file/test_char_out.txt");
		
		// 2. 읽기위한 객체 생성, 쓰기 위한 객체 생성
		
		FileReader fr = null; // 읽기		
		FileWriter fw = null; // 쓰기
		
		// 3. 읽고, 쓰기 반복(원본파일 끝을 만날때까지)
		
		try {
			fr = new FileReader(file);
			fw = new FileWriter(file2);
			
			while (true) {
				int readChar = fr.read();
				if (readChar == -1) break; // 읽기
				fw.write((char)readChar); // 쓰기
				System.out.print((char)readChar);
			}
			
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			// 4. 사용객체 close
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
