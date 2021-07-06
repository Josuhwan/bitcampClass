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
    static final int SIZE = 10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int id = 0;
        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
//        boolean inputSwitch = false;
        int index = 0;
        
        int[] idArray = new int[SIZE];
        String[] nameArray = new String[SIZE];
        int[] koreanArray = new int[SIZE]; 
        int[] englishArray = new int[SIZE];
        int[] mathArray = new int[SIZE];
        
        while(true) {
            System.out.println("1. 입력 2.출력 3.종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
               if(index < SIZE) {
                
                id = ScannerUtil.nextInt(scanner, "번호");
                idArray[index] = id;
                
                name = ScannerUtil.nextLine(scanner, "이름");
                nameArray[index] = name;
                
                korean = ScannerUtil.nextInt(scanner, "국어", SCORE_MIN, SCORE_MAX);
                koreanArray[index] = korean;
                
                english = ScannerUtil.nextInt(scanner, "영어", SCORE_MIN, SCORE_MAX);
                englishArray[index] = english;
                
                math = ScannerUtil.nextInt(scanner, "수학", SCORE_MIN, SCORE_MAX);
                mathArray[index] = math;
                
                index++;
                
               } else {
                   System.out.println("더이상 입력하실 수 없습니다.");
               }
            } else if(userChoice == 2) {
                if(index > 0) {
                    for(int i = 0; i < index; i++) {
                        System.out.println("-----------------------");
                        System.out.printf("\t%d번째 정보\n", i + 1);
                        System.out.println("-----------------------");
                        System.out.printf("번호: %03d번 이름: %s\n", id, name);
                        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
//                        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);                
                    }
                } else {
                    System.out.println("-----------------------");
                    System.out.println("아직 입력된 정보가 없습니다.");
                    System.out.println("-----------------------");
                }
            } else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
             
    }   
//        public static void printInfo(int[] idArray, String[] nameArray, int[] koreanArray, int[] englishArray, int[] mathArray) {
//            
//        int sum = korean + english + math;
//
//        double average = (double) sum / SUBJECT_SIZE;
//
//        // 출력
//        System.out.printf("번호: %03d번 이름: %s\n", id, name);
//        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
//        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
//    }
}
