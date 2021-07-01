package day0701;
//사용자로부터 점수를 입력받아서
//90~: A
//80~: B
//70~: C
//60~: D
//그외: F 
//가 출력되는 프로그램을 작성하시오

import java.util.Scanner;

//단 사용자가 잘못된 점수를 입력하면 올바른 점수를 입력할 때 까지
//다시 입력이 되도록 코드를 작성하시오

//출력 예시)
//사용자의 점수: [##]점 
//최종 성적: [B]
public class GradePrinter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int score;
        String r;
        
        System.out.print("점수 입력: ");
        score = scan.nextInt();
		
        while(!(score >= 0 && score <= 100)) {
        	System.out.println("잘못된 점수입니다");
        	System.out.print("다시 점수 입력: ");     
        	score = scan.nextInt();
        }
        
//        while(score > 100 && score < 0) {
//        	System.out.print("다시 점수 입력: ");     
//        	score = scan.nextInt();
//        }
//        
	        if(score >= 90) {
	            r = "A";
	        } else if(score >= 80){
	            r = "B";
	        } else if(score >= 70){
	            r = "C";
	        } else if(score >= 60){
	            r = "D";
	        } else {
	            r = "F";
	        }
        
	        System.out.printf("사용자의 점수: [%2d]점\n", score);
	        System.out.printf("최종 성적: [%s]\n", r);
	        
	        scan.close();
	}	
}
