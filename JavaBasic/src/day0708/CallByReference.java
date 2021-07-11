package day0708;
class Number {
    int value;
 
    public Number(int value) {
        this.value = value;
    }
}
public class CallByReference {
 
    private static int subtract(Number x, Number y) {
        swap(x, y);
        System.out.println(x.value + " --- 33");
        System.out.println(y.value + "--- 442");
        return x.value - y.value;
    }
 
    private static void swap(Number x, Number y) {
        int z = x.value;
        System.out.println(x.value + " --- 1111");
        System.out.println(y.value + "--- 2222");
        x.value = y.value;
        y.value = z;
        System.out.println(x.value);
        System.out.println(y.value);
    }
 
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Number numberX = new Number(x);
        Number numberY = new Number(y);
        System.out.println(numberX);
        System.out.println(numberY);
        System.out.println(numberX.value);
        int result = subtract(numberX, numberY);
        System.out.printf("%d - %d = %d", numberX.value, numberY.value, result);
    }
}