package day0630;
//사용자로부터 성별,나이,신체등급으로 입력을 받아서 

//현역,공익,면제를 출력해주는 프로그램
//조건1.단 사용자가 성별을 입력할 때 여성으로 입력하는 경우, 추가적인 입력없이 
//"여성에게는 국방의 의무가 부여되지 않습니다"만 출력되게 하십시오
//조건2. 다 ㄴ사용자가 남성이지만 미성년자일 경우, 추가적인 입력없이 
//"미성년자는 아직 신테등급이 부여되지 않습니다."만 출력되게 하시오
//현역:1~3
//공익:4급
//면제:그외

//성별을 입력받을 때는 1이면 남자 2이면 여자
import java.util.Scanner;

public class ArmyPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("성별을 입력하세요(남자는1,여자는2)");// 1사용자로부터 성별을 입력받는다
        int s = scanner.nextInt();// 성별의 숫자를 변수s에 저장

        if (s == 1) {
            System.out.println("나이를 입력하세요");// 1-1남성일경우 나이를 입력받는다
            int age = scanner.nextInt();// 나이를 변수age에 저장

            if (age >= 19) {
                System.out.println("신체등급을 입력하세요");// 2-1나이가 성인일경우 신체등급을 입력받는다

                int c = scanner.nextInt();// 신체등급을 변수c에 저장
                if (c < 4) {// 신체등급(c)값에 맞춰서 현역,공익,면제를 출력
                    System.out.println("현역");
                } else if (c == 4) {
                    System.out.println("공익");
                } else {
                    System.out.println("면제");
                }
            } else {
                System.out.println("미성년자는 아직 신체등급이 부여되지 않습니다.");// 2-2미성년자의 경우 출력
            }

        } else {
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");// 1-2성별이 여성일경우 메세지출력
        }
        scanner.close();
    }
}