package com.mystudy.stringbuilder;

import java.util.StringTokenizer;


public class Ex03_StringTokenizer {
	
	public static void main(String[] args) {
		// String split() vs StingTokenizer
		System.out.println("---------- String split() ---------");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str :" + str);
		
		String[] strSplit = str.split(",");
		System.out.println("strSplit : " + strSplit);
		System.out.println("strSplit: " + strSplit.length);
		
		System.out.println("---- str.split(\",\") ---------");
		for(int i = 0; i < strSplit.length; i++) {
//			System.out.println(strSplit[i]);
			System.out.println(i + " : " + "-" + strSplit[i] + "-");
		}
		System.out.println("------ 개선 된 for문 형태도 -----");
		for(String str2 : strSplit) {
			System.out.println("-" + str2 + "-");
		}
		System.out.println("-------------------");
		
		int idx = 0;
		for(String str2 : strSplit) {
			System.out.println(idx++ + ": -" + str2 + "-");
//			idx++;
		}
		System.out.println("===============================");
		
		System.out.println("-------------- StringTokenizer 사용 -----------");
		StringTokenizer strToken = new StringTokenizer(str, ",");
		System.out.println("strToken.contTokens() : " + strToken.countTokens());
		
		while(strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
		}
		System.out.println("저장된 토큰 : " + strToken.countTokens());
		
		//==============================================
		System.out.println("------- for 문 사용 토큰값 조회 -------");
		strToken = new StringTokenizer(str, ",");
		System.out.println("저장된 토큰갯수 : " + strToken.countTokens());
		
		int tokenCnt = strToken.countTokens();
		for(int i = 0; i < strToken.countTokens(); i++) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
		}
		
	}
}
