package day0630;

import java.util.Scanner;

// 숙제 3.
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서
// 예쁘게 출력하시오.

// 단, 모든 입력이 끝난 후에 모든 점수가 올바른 범위일때에만 
// 출력이 진행 되고
// 만약 잘못된 점수가 존재할 경우에는
// "잘못된 점수가 있어서 결과를 출력할 수 없습니다."
// 가 출력되게 코드를 작성하시오
public class GradeBook2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        String name;
        int kor;
        int eng;
        int math;

        System.out.print("번호를 입력: ");
        num = scan.nextInt();
        
        System.out.print("이름을 입력: ");
        scan.nextLine();
        name = scan.nextLine();
         
        System.out.print("국어점수 입력: ");
        kor = scan.nextInt();
        
        System.out.print("영어점수 입력: ");
        eng = scan.nextInt();
        
        System.out.print("수학점수 입력: ");
        math = scan.nextInt();
        
        System.out.println("===========================");
        
        if(kor >= 0 && kor <= 100) {
            if(eng >= 0 && eng <= 100) {
                if(math >= 0 && math <= 100) {
                    System.out.println("번호: " + num);
                    System.out.println("이름: " + name);
                    System.out.println("국어: " + kor + "점");
                    System.out.println("영어: " + eng + "점");
                    System.out.println("수학: " + math + "점");
                } else {
                    System.out.println("잘못된 점수가 있어서 결과를 출력할 수 없습니다");
                }
            } else {
                System.out.println("잘못된 점수가 있어서 결과를 출력할 수 없습니다");
            }
        } else {
            System.out.println("잘못된 점수가 있어서 결과를 출력할 수 없습니다");
        }
       
    }
}
