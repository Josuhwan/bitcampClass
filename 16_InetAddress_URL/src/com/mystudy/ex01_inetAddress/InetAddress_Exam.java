package com.mystudy.ex01_inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {

	public static void main(String[] args) throws UnknownHostException {
		// InetAddress : IP�ּ� ���� Ŭ����
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("ȣ��Ʈ�̸� : %s \n", iaddr);
		System.out.println("ȣ��Ʈ�� : " + iaddr.getHostName());
		System.out.println("ȣ��Ʈ IP�ּ� : " + iaddr.getHostAddress());
		
		//------------------------------------------------
		System.out.println("----- ���̹� �ּ� �˻� -----");
		iaddr = InetAddress.getByName("www.naver.com"); // �����θ�
		System.out.printf("ȣ��Ʈ�̸� : %s \n", iaddr);
		System.out.println("ȣ��Ʈ�� : " + iaddr.getHostName());
		System.out.println("ȣ��Ʈ IP�ּ� : " + iaddr.getHostAddress());
		
		System.out.println("---- ���̹� IP �ּҵ� �˻� -----");
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		
		for (InetAddress ia : iaArr) {
			System.out.println("ȣ��Ʈ�� : " + ia.getHostName());
			System.out.println("ȣ��Ʈ IP�ּ� : " + ia.getHostAddress());
		}
		
	}

}
