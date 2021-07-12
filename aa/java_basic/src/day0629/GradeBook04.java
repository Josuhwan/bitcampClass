package day0629;
//시용자 로부터 

//번호,이름, 국어점수, 영어점수,수학점수를 차례대로 입력받아서 다음과 같은 형식에 맞추어 출력하는 프로그램을 작성하시오.
//다음과 같은 형식에 맞추어 출력하는 프로그램을 작성하시오
//
//출력결과 
//번호:##번 이름:###
//국어:###점 영어:###점 수학:###점
//총점:###점 평균:###.##점

import java.util.Scanner;
public class GradeBook04 {
    public static void main(String[]args) {
      
        Scanner scanner = new Scanner(System.in);
        //과목의 숫자가 초기화된 상수 SUBJECT_SIZE
        final int SUBJECT_SIZE = 3;
        
        //1. 사용자로부터 번호를 입력받아 변수에 저장하고 출력
        //   변수의 이름중에 학생의 번호, 사원의 번호 등 하나의 고유한 정보를
        //   나타내는 변수는 우리가 주로 id라고 부른다.
//        int입력받기
        System.out.println("번호를 입력해주세요.");
       System.out.print(">");
        int n= scanner.nextInt();
        
        System.out.printf("번호:"+n);
        System.out.println("번");
        
        //2. 사용자로부터 이름을 입력받아 변수에 저장하고 출력
//        String
        System.out.println("이름을 입력해주세요.");
        System.out.print(">");
        
        scanner.nextLine();
        //앞에서 int를 썼기때문에 
        //버퍼메모리를 비어주기 위해 scanner.nextLine(); 코드를 쓴다.
       String name = scanner.nextLine();
       System.out.println("이름:"+name);
        
       //3.사용자로부터 국어,영어,수학점수를 입력받아 변수에 저장하고 출력
//       int입력받기
       System.out.println("국어점수가 몇점인가요?");
       int K=scanner.nextInt();
       System.out.printf("국어:%03d점\n",K);
       
       System.out.println("영어점수가 몇점인가요?");
       int E = scanner.nextInt();
       System.out.printf("영어:%03d점\n",E);
       
       System.out.println("수학점수가 몇점인가요?");
       int M = scanner.nextInt();
       System.out.printf("수학:%03d점\n",M);
       
       //4.사용자로부터 입력받은 점수를 토대로 총점과 평균을 계산하여 변수에 저장하고 출력
       int sum = K+E+M;
       double aver= (double)sum/SUBJECT_SIZE;
       //명시적형변환 int->double
   
       //내가 못한것: System.out.printf("번호:%2d번 이름:%s\n",n,name);
       //System.out.printf("국어:%3d점 영어:%3d점 수학:%3d점\n",K,E,M);
     //한번에 쓰면 되는데 나눠서 썼다, 비효율적...좀더 생각해서 풀어보자!
       System.out.printf("총점:%3d점 평균:%06.2f점\n",sum,aver);
     
       scanner.close();
       }
// 하드코딩과 소프트코딩
    //하드코딩이란 매직 넘버등을 사용하여 경직된 코드를 만들어서 유지보수가 어려운 코딩을 
//    하드코딩이라 한다.
//    물론 난이도가 낮은 프로그램을 만들때에는 하드코딩이 소프트코딩보다 
    //더쉽고 빠르게 만들수 있지만 여러분들이 규모가 크거나 유지보수가 잦은 프로그램을
    //만들때에는 하드코딩을 하지 말아야 한다!
    
    //그에 반해 소프트 코딩은 코드를 유연하게 코딩해서 유지보수를쉽게 할 수 있는 코딩이다.
    //적극적인 상수 사용, 재사용 가능성이 높은 코드는 메소드화 시키는 등 
    //상하드코딩에 비교하면은 작업랴이 많기 때문에 난이도가 낮은 프로그램에서는 
    //상대적으로 소프트 코딩이 더 불편하다.
    //하지만 하드코딩과는 반대로 규모가 크거나 유지보수가 잦으면 소프트코딩이 월등이 유리.
}
