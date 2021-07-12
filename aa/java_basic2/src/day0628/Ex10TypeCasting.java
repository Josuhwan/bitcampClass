package day0628;
//형변환(type casting)
//특정데이터타입의 값을 다른 데이터타입의 값으로 변경하는 것

/*형변환에는 암시적 형변환과 명시적 형변환이 있다.
 * -암시적 현변환(implicit type casting)
 * 우리가 특별히 형변환을 해달라고 말을 하지 않더라도 
 * 자바 내부적으로 값을 형변환 해주는것.
 * 더 작은 데이터타입의 값을 더 큰 데이터타입의 변수or상수에 저장할때
 * 암시적 형변환이 발생하여 더 작은 데이터값을 더 큰 데이터타입의 값으로 
 * 바꾸고 저장이 실행된다.
 * -명시적 형변환(explicit type casting)
 * 더 큰 데이터타입의 값을 더 작은 데이터타입의 공간에 할당할때
 * 오버플로우나 언너플로우로 대표되는 데이터손실을 무시하고 
 * 값을 저장하라는 의미.
 * 우리가 반드시 코드 상으로 "해당 데이터타입으로 바꿔!"라고 명령해야함.
 *   바꾸는방법: (바꿀 데이터타입)값;
 *   ex)myInt를 byte값으로 바꾸려면?
 *       ->(byte)myInt; 
 *  
 * 만약 바꿀값이 해당 데이터타입의 공간이 표시 가능한 값이면 문제없음.
 * But, 범위를 벗어난다면 언더플로우 혹은 오버플로우가 발생하게 된다.      
 */

public class Ex10TypeCasting {
    public static void main(String[]args) {
            //암시적 형변환의 경우
        //byte변수 myByte선언하고 3으로 초기화
        byte myByte = 3;
        //int 변수 myInt선언 하고 myByte로 초기화
        int myInt = myByte;
        //화면에 myInt의 현재값출력
        System.out.println(myInt);
        
            //명시적 형변환의 경우
        //myInt에 20
         myInt = 20;
        //myByte에 myInt의 현재값을 할당한다
          myByte = (byte)myInt;
        //화면에서 myByte의 현재값 출력
        System.out.println(myByte);
        
            //오버플로우 체험
        //myByte에 127을 할당
        myByte = 127;
        //myByte의 현재값을 출력
        System.out.println(myByte);
        //myByte에 128을 할당
        myByte = (byte)128;
        //byte의 범위를 벗어났기 때문에 오버플로우발생 최소값이 된다.
        //myByte의 현재값을 출력
        System.out.println(myByte);
        //myByte에 129을 할당
        myByte = (byte)129;
        //myByte의 현재값을 출력
        System.out.println(myByte);
        
            //언더플로우 체험
        //myByte에 -128할당
        myByte = -128;
        //myByte의 현재값을 출력
        System.out.println(myByte);
        //myByte에-129를 할당
        myByte = (byte)-129;
        //myByte의 현재값을 출력
        System.out.println(myByte);
        
        //예전처럼 리소스에 제한을 심하게 둘 필요가 없으므로
        //편하게 int/double쓸수있다.
    }
}
