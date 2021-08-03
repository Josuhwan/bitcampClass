package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWriterExam {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferdReader = null;
		BufferedWriter bufferdWriter = null;
		
		try {
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			bufferdReader = new BufferedReader(fr); // ���ۻ��+�����б� ���
			
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			bufferdWriter = new BufferedWriter(fw);
			
			// �а�, ����
			bufferdWriter.write("�ȳ��ϼ���. �ڹٰ������Դϴ�. \n");
			bufferdWriter.write("Hello Java!!!!.\n");
			bufferdWriter.write("-----------------------------");
			bufferdWriter.newLine();
			
			String str = bufferdReader.readLine();		
			while(str != null) {
				bufferdWriter.write(str);
				bufferdWriter.newLine();
				str = bufferdReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				bufferdWriter.close();
				bufferdReader.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		
		
	}
}
