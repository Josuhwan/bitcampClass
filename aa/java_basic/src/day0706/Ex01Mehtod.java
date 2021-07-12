package day0706;
//메소드(Method)
//메소드란 여러줄의 코드를 하나의 명령어로 압축시켜 놓은것이다.
//다른말로는 함수,기능이라고도 하는데 
//우리가 여러줄의 코드를 적는 것이 아니라 그 메소드의 이름만 적어주면 
//그 메소드 내부안의 코드가 모두 실행이 되는 형태가 되는것이다.

//메소드는 다음과 같은 구조로 이루어져 있는데 
//지금은 처음 두단어는 매번 똑같이 외우자
//public static 리턴타입 메소드이름(파라미터){
//     메소드가 호출되면 실행할 코드들
//}
//public:해당 메소드가 속한 클래스가 어디에 있던간에 다른곳에서 그 메소드를 실행할 수 있다.

//static: 원래대로라면 클래스 안에 있느 메소드는 반드시 해당 클래스 타입의 
//          변수를 만들어서 그 변수.메소드() 로 실행해야하지만 
//          static이 붙어있는 메소드는 변수를 안만들고 
//          클래스.메소드()로 실행가능하게 만들어준다.

//리턴타입: 이 메소드가 종료되고 나서 이 메소드를 호출했던 곳으로(=이름을 적었던 곳으로)
//          보내줄 값의 데이터타입.
//          값을 되돌려 줄때에는 해당 데이터 타입과 일치하는 값을 
//          return이라는 명령어를 통해서 되돌려 준다.
//          만약 리턴타입이 존재할 시에는 메소드에서 반드시 return을 통해서 
//          해당 데이터타입의 값을 보내주어야 한다.
//          또한 리턴의 경우 , 해당 메소드의 어디에 있던간에
//          실행되면 해당 메소드는 종료된다.
//          만약 리턴할 것이 존재하지 않으면 void라고 적어주고 
//          이때에는 오히려 return이라는 명령어가 메소드 내부에 있으면 에러가 발생.

//메소드 이름: 소문자로 시작하고 낙타등표기법을 사용하는 동사

//파라미터: 해당 메소드를 실행시키는데 필요로 하는 외부의 값
//       파라미터는 한국말로 우리가 "매개변수"라고도 하는데 변수이다.
//       이 메소드 옆에 ()에 우리가 필요로 하는 외부의 값을 변수선언을 하면 
//       그 메소드를 실행시킬때 반드시 그 파라미터의 데이터타입과 일치하는 값이 넘어와야한다.
//       그리고 넘어온 값은 해당 메소드 내부에서는 파라미터의 변수이름으로 우리가 다루게 된다.

public class Ex01Mehtod {
    public static void main(String[] args) {
        // 만약우리가 지정된 메시지를 여러번 출력해야하는 경우
        printMessage();

        System.out.println();
        System.out.println("대충코드 구현 여러줄");
        System.out.println();

        printMessage();

        // 만약 우리가 int값 1개의
        // 제곱,세제곱,네제곱까지 출력하는 코드가 여러번 필요하면?

        int number = 1;
        printNumbers(number);
        number = 2;
        printNumbers(number);
        number = 3;
        printNumbers(number);

        // 2개의 숫자중 더 큰 숫자를 찾아서 출력해주는 프로그램
        number = 1;
        int number2 = 45;
        int max = findBigger(number,number2);
        
        
        System.out.println("max:" + max);
        
        //리턴타입이 존재하는 메소드는 
        //그 메소드의 결과값을 다시 다른 메소드의 파라미터로 넣어줄 수도 있다.
        printNumbers(findBigger(number,number2));

    }

    // 지정된 메시지 1번부터 4번까지 차례대로 출력하는 메소드
    // 이 메소드는 외부로부터 값을 받아올 필요도 없고
    // 호출된 곳으로 값을 보내줄 필요도 없는 메소드이다.
    // 따라서 다음과 같은 구조를 가지게 된다!->파라미터도 없고 리턴타입도 없다.
    public static void printMessage() {
        System.out.println("지정된 메세지 1번");
        System.out.println("지정된 메세지 2번");
        System.out.println("지정된 메세지 3번");
        System.out.println("지정된 메세지 4번");
    }

    // 파라미터로 받은 int값의
    // 제곱 세제곱 네제곱을 출력해주는 메소드->파라미터는 int변수이고 리턴타입은 없다.
    public static void printNumbers(int a) {
        System.out.printf("%d의 제곱 세제곱 네제곱을 알아보자!!\n", a);
        System.out.printf("%d의 제곱: %d\n", a, a * a);
        System.out.printf("%d의 세제곱: %d\n",a, a * a * a);
        System.out.printf("%d의 네제곱: %d\n",a, a * a * a * a);
        System.out.println("===========================================");
    }

    public static int findBigger(int num1, int num2) {//->파라미터는int변수이고 리턴타입은 int
        int max = 0;
        if (num1 > num2) {
            System.out.println();
            System.out.println("=============");
            System.out.println("첫번째 숫자가 더 큽니다!!");
            System.out.println("=============");
            System.out.println();
            return num1;
        } else {
            System.out.println();
            System.out.println("================");
            System.out.println("두번째 숫자가 더 큽니다!!");
            System.out.println("================");
            System.out.println();
            return num2;
        }
    }

}