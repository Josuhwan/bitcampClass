package day0629;
//사용자로부터 이름,키, 몸무게를 입력받아서
 
//이름:### 키:#.##m 몸무게:##.##kg
//BMI수치: ##.###
//의 형식으로 출력되는 프로그램을 작성하시오
//단, 키는 m단위이고 몸무게는 kg단위입니다.
//BMI공식은 몸무게/키/키 입니다.
import java.util.Scanner;
public class BmiCalc {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        //1.사용자로부터 이름을 입력받아 변수에 저장
        System.out.println("이름이 무엇인가요?");
         System.out.print(">");
        
         String name = scanner.nextLine();
  
//         System.out.println("이름:"+name);
         
         //2. 사용자로부터 키를 입력받아 변수에 저장
         System.out.println("키가 몇m인가요?");
         System.out.print(">");
        
         double h = scanner.nextDouble();
         
//         System.out.printf("키:%4.3fm\n",h);
         
         //3. 사용자로부터 몸무게를 입력받아 변수에 저장
         System.out.println("몸무게가 몇kg인가요?");
        System.out.print(">");
         
         double K = scanner.nextDouble();
         
//         System.out.printf("몸무게:%.2fkg\n",K);
         
         //4.BMI를 계산하여 변수에 저장
         double BMI = K/h/h;
         
         //5. 입력받은 변수들을 정해진 형식으로 출력
         System.out.printf("이름:%s 키:%4.2fm 몸무게:%5.2fkg\n",name,h,K);
         //한번에 출력가능하니 한번에 출력하자!!!!!!!
         System.out.printf("BMI수치:%6.3f\n",BMI);
         
         scanner.close();
         
    }
    

}
