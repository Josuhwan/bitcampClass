package stringbuilder_exam;

import java.util.Arrays;
import java.util.StringTokenizer;

import javax.naming.Name;

public class StringControls {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		  String str2 = "    TOM    을지문덕 김유신 연개소문";
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
		     (String.split() 또는 StringTokenizer 클래스 사용)
		      예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...   
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍,이,이,T,홍,T,을... 
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		      예) 인덱스번호:을지문덕
		********************************/
		
		String str1 = "홍길동 이순신     이순신 tom 홍길동";
		String str2 = "         TOM   을지문덕 김유신 연개소문";
		
		String str = str1 + str2;
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(str2);
		System.out.println(sb);
		//==============================================
		
		// 2-1
//		String[] names = sb.toString().split(" ");
////		System.out.println(Arrays.toString(names));
//		for(String s : names) {
//			System.out.println("-" + s);
//		}
		
		StringTokenizer stk = new StringTokenizer(sb.toString(), " ");
		System.out.println(stk.countTokens());
		
		while(stk.hasMoreTokens()) {
			String name = stk.nextToken();
			System.out.print(name);
		}
		System.out.println();
		
		stk = new StringTokenizer(sb.toString(), " ");
		System.out.println(stk.countTokens());
		
		String[] names = new String[stk.countTokens()];
		
		int idx = 0;
		while(stk.hasMoreTokens()) {
			names[idx++] = stk.nextToken();
			
		}
		System.out.println(Arrays.toString(names));
		
		System.out.println("----------- 3번 ----------");
		// 3.
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + ",");	
			sb1.append(names[i]).append(",");
		}
		System.out.println(sb1.toString());
		System.out.println();
		
		//---------------
		System.out.println("-------------");
		sb1 = new StringBuilder();
		for(int i = 0; i < names.length; i++) {
			if(i == 0) {
				sb1.append(names[i]);
			}else {
				sb.append(",").append(names[i]);
			}
		}
		System.out.println(sb.toString());
		
		System.out.println("-------------");
		sb1 = new StringBuilder();
		boolean isFirst = true;
		for(int i = 0; i < names.length; i++) {
			if(isFirst) { //첫번째 데이터
				sb1.append(names[i]);
				isFirst = false;
			} 
		}
		
		for(int i = 1; i < names.length; i++) {
			sb1.append(",").append(names[i]);
		}
		System.out.println(sb1.toString());
		
		System.out.println("==========4번=============");		
		//4.
		StringBuilder sb2 = new StringBuilder();
		if(names.length > 0) {
			sb2.append(names[0].charAt(0));
		}
		for(int i = 1; i < names.length; i++) {
			sb2.append(",").append(names[i].charAt(0));
		}
		System.out.println("sb2 : " + sb2);
		
		System.out.println("=========5번============");
		// 5.
//		sb2.delete(0, sb2.length());
		sb2.setLength(0);
		System.out.println("sb2 : " + sb2);
		for(int i = 0; i <names.length; i++) {
			if(names[i].length() >= 4) {
				sb2.append(i + ":" + names[i] + "\n");
			}
		}
		System.out.println(sb2);
	}	
}