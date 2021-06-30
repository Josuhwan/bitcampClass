package day0630;
//사용자로부터 성별, 나이, 신체등급순으로 입력을 받아서

//현역, 공익, 면제를 출력해주는 프로그램.
//조건1. 단, 사용자가 성별을 입력할 때 여성으로 입력하는 경우, 
//    추가적인 입력 없이
//    "여성에게는 국방의 의무가 부여되지 않습니다." 만 출력되게 하시오.
//조건2. 단, 사용자가 남성이지만 미성년자일 경우,
//    추가적인 입력 없이
//    "미성년자는 아직 신체 등급이 부여되지 않습니다." 만 출력되게 하시오.
//현역: 1~3급
//공익: 4급
//면제: 그외

//성별을 입력 받을때에는
//1이면 남자 2면 여자 로 입력 받읍시다
import java.util.Scanner;

public class ArmyPrinter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int s;
        int age;
        int g;
        
        System.out.print("성별 입력(남1 여2): ");
        s = scan.nextInt();
      
        if(s == 1) {
            System.out.print("나이 입력: ");
            age = scan.nextInt();
            if(age > 20) {
                System.out.print("신체등급 입력: ");
                g = scan.nextInt();  
                if(g <= 3) {
                    System.out.println("현역");
                } else if(g == 4) {
                    System.out.println("공익");
                } else {
                    System.out.println("면제");
                }
            } else {
                System.out.println("미성년자는 아직 신체 등급 x");
            }
        } else {
            System.out.println("여성에게는 국방의 의무가 x");
        }
            
        scan.close();
    }
}
