package day0706;

import java.util.Scanner;
import util.ScannerUtil;
//숙제 2.
//GradeBook을 여러 학생을 관리할 수 있는 버전으로 만들되
//메소드화 시키기오.
public class Hw04 {
 
    static final int SUBJECT_SIZE = 3;  
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int SIZE = 5;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int index = 0;
        
        int[] idArray = new int[SIZE];
        String[] nameArray = new String[SIZE];
        int[] koreanArray = new int[SIZE]; 
        int[] englishArray = new int[SIZE];
        int[] mathArray = new int[SIZE];
        
        while(true) {
        	String message;
   
            int userChoice = ScannerUtil.nextInt(scanner, "1. 입력 2.출력 3.종료");
            if(userChoice == 1) {
               if(index < SIZE) {
                
            	message = "번호";   	
                idArray[index] = ScannerUtil.nextInt(scanner, message);
                
                message = "이름";
                nameArray[index] = ScannerUtil.nextLine(scanner, message);
                
                message = "국어";
                koreanArray[index] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
                
                message = "영어";
                englishArray[index] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
                
                message = "수학";
                mathArray[index] = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
                
                index++;
                
               } else {
                   System.out.println("더이상 입력하실 수 없습니다.");
               }
            } else if(userChoice == 2) {
                
                	printAll(index, idArray, nameArray, koreanArray, englishArray, mathArray);
                
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
             
    }   
        public static void printAll(int index, int[] idArray, String[] nameArray, int[] koreanArray, int[] englishArray, int[] mathArray) {
        	if(index > 0) {
        		for(int i = 0; i < index; i++) {
		        System.out.println("-----------------------");
		        System.out.printf("\t%d번째 정보\n", i + 1);
		        System.out.println("-----------------------");
//		        System.out.printf("번호: %03d번 이름: %s\n", idArray, nameArray);
//		        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", koreanArray, englishArray, mathArray);
		        int id = idArray[i];
		        String name = nameArray[i];
		        int korean = koreanArray[i];
		        int english = englishArray[i];
		        int math = mathArray[i];
		        printOne(id, name, korean, english, math);
		        System.out.println("-----------------------");
		        
        		}
        	} else {
                    System.out.println("-----------------------");
                    System.out.println("아직 입력된 정보가 없습니다.");
                    System.out.println("-----------------------");
            }

        }
        public static void printOne(int id, String name, int korean, int english, int math) {
        	int sum = korean + english + math;
        	double average = (double)sum / SIZE;
        	
        	System.out.printf("번호: %03d번 이름: %s\n", id, name);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
            System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
        }	
    
}
