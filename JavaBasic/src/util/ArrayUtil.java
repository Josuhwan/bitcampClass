package util;
// 배열을 사용할 때

// 도움이 될만한 메소드들을 구현한 클래스

public class ArrayUtil {
    // 1. int 배열
    // A. size()
    // 해당 배열의 크기를 리턴한다.
    public static int size(int[] arr) {
        return arr.length;
    }

    // B. isEmpty()
    // 해당 배열의 엘리먼트가 아무것도 존재하지 않으면 true
    // 존재하면 false가 나온다.
    // 단, 해당 메소드는 동적 할당이 되어있는
    // 메소드에만 적용가능하다.
    public static boolean isEmpty(int[] arr) {
        return size(arr) == 0;
    }

    // C. get()
    // 파라미터로 들어온 배열에
    // 파라미터로 들어온 인덱스 값에 있는 값을 리턴한다.

    public static int get(int[] arr, int index) {
        return arr[index];
    }

    // D. contains()
    // 파라미터로 들어온 배열에 파라미터로 들어온 int 값이
    // 존재하면 true, 존재하지 않으면 false가 리턴된다.
    public static boolean contains(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return true;
            }
        }

        return false;
    }

    // E. indexOf()
    // 해당 배열에서 파라미터 e의 인덱스를
    // 리턴해주는 메소드.
    // 단, 해당 배열에 e가 존재하지 않는다면
    // -1이 리턴된다.
    // 또한 e와 같은 값이 배열에 여러 칸에 있으면
    // 가장 먼저 등장하는 칸의 인덱스를 리턴한다.
    public static int indexOf(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return i;
            }
        }

        return -1;
    }

    // F. lastIndexOF
    // 해당 배열에 가장 마지막에 등장하는 e의
    // 인덱스를 리턴한다.
    // 단, e가 배열에 없을 시에는 -1이 리턴된다.
    public static int lastIndexOf(int[] arr, int e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i) == e) {
                return i;
            }
        }

        return -1;
    }

    // G. clear()
    // 아무것도 없는 배열을 리턴한다.
    public static int[] clear() {
        int[] temp = new int[0];
        return temp;
    }

    // H. add()
    // 파라미터로 들어온 배열에 e를
    // 가장 끝에 추가하여 리턴하는 메소드.
    // 추가될때마다 해당 배열의 길이는 1씩 늘어난다.
    public static int[] add(int[] arr, int e) {
        // 1. 기존의 내용을
        // 임시 보관할 배열을 만든다.
        int[] temp = new int[size(arr)];

        // 2. arr의 내용을 temp에 복사한다.
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }

        // 3. arr의 크기를 1 늘린다.
        arr = new int[size(temp) + 1];

        // 4. temp의 내용을 arr에 복사한다.
        for (int i = 0; i < size(temp); i++) {
            arr[i] = get(temp, i);
        }

        // 5. arr의 가장 마지막 인덱스에
        // e를 넣는다.
        int lastIndex = size(arr) - 1;
        arr[lastIndex] = e;

        // 6. 그렇게 크기가 늘어난 arr을
        // 리턴한다.
        return arr;
    }

    // I. add()
    // 파라미터로 들어온 배열에 특정 index에 e를 추가하는
    // 메소드.
    // 단, index가 유효하지 않을 경우에는
    // 원래 배열을 리턴한다.
    public static int[] add(int[] arr, int index, int e) {
        // index가 유효한 범위이면
        // 진행하고 아니면 아무것도 안한다.
        if (index >= 0 && index < size(arr)) {
            // 유효한 index 이므로
            // 배열에 추가하기 시작한다.

            // 임시 보관할 배열 temp
            int[] temp = new int[size(arr)];

            // arr의 내용을 temp에 복사
            for (int i = 0; i < size(arr); i++) {
                temp[i] = get(arr, i);
            }

            // arr의 크기를 1 늘린다.
            arr = new int[size(temp) + 1];

            // temp의 값 중 인덱스 0번부터~index-1번까지
            // arr에 복사한다.
            for (int i = 0; i < index; i++) {
                arr[i] = get(temp, i);
            }

            // arr의 index번 칸에 e를 넣는다.
            arr[index] = e;

            // temp의 값 중 index번 칸부터 끝까지를
            // arr에 한칸씩 뒤로 밀어서 복사한다.
            for (int i = index; i < size(temp); i++) {
                arr[i + 1] = get(temp, i);
            }
        }

        return arr;
    }
}
