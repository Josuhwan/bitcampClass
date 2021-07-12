package util;


//배열을 사용할때 
//도움이 될만한 메소드들을 구현한 클래스

public class ArrayUtil {
    // 1. int배열
    // A. size()
    // 해당배열의 크기를 리턴한다.
    public static int size(int[] arr) {
        return arr.length;// arr배열의 크기를 리턴한다.
    }

    // B.isEmpty()
    // 해당배열에 아무것도 존재하지않으면 true
    // 존재하면 false가 나온다.
    // 단,해당 메소드는 동적할당이 되어있는
    // 매소드에만 적용가능하다.
    public static boolean isEmpty(int[] arr) {
        return size(arr) == 0;
    }

    // C.get()
    // 파라미터로 들어온 배열에
    // 파라미터로 들어온 인덱스 값에 있는 값을 리턴한다.
    public static int get(int[] arr, int index) {
        return arr[index];
    }

    // D.contains()
    // 파라미터로 들어온 배열에 파라미터로 들어온 int(e)값이 존재하면 true
    // 존재하지 않으면 false가 리턴된다.
    public static boolean contains(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return true;
            }
        }
        return false;
    }

    // D.indexOF()
    // 해당배열에서 파라미터 e의 인덱스를 리턴해주는 메소드.
    // 단, 해당배열에 e가 존재하지 않는다면
    // -1이 리턴된다.
    // 또한 e와 같은 값이 배열의 여러 칸에 있으면 가장 먼저 등장하는 칸의 인덱스를 리턴한다.
    public static int indexOf(int[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return i;
            }
        }
        return -1;// 위로 다시 돌아가면 ++이 되기때문에 0부터 시작하기위해 -1로 초기화한다.
    }

    // E.lastIndexOF
    // 해당배열에 가장 마지막에 등장하는 e의 인덱스를 리턴한다.
    // 단,e가 배열에 없을시에는 -1이 리턴된다.
    public static int lastIndexOf(int[] arr, int e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i) == e) {
                return i;
            }
        }
        return -1;
    }

    // F.clear()
    // 아무것도 없는 배열을 리턴한다
    public static int[] clear(int[] arr) {
        arr = new int[0];
        return arr;
    }

    // E. add()
    // 파라미터로 들어온 배열에 e를 가장끝에 추가하여 리턴하는 메소드.
    // 추가될때마다 해당 배열의 길이는 1씩 늘어난다.
    public static int[] add(int[] arr, int e) {
        // 기존의 내용을 임시보관할 배열을 만든다
        int[] temp = new int[size(arr)];

        // arr의 내용을 temp에 복사한다.
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        // arr의 크기를 1늘린다.
        arr = new int[size(temp) + 1];
        // temp의 내용을 arr에 복사한다.
        for (int i = 0; i < size(temp); i++) {
            arr[i] = get(temp, i);
        }
        // arr 의 가장 마지막 인덱스에 e를 넣는다.
        int lastIndex = size(arr) - 1;
        arr[lastIndex] = e;
        // 그렇게 크기가 늘어난 arr을 리턴한다.
        return arr;
    }

    // I. add
    // 파라미터로 들어온 배열에 특정 index에 e를 추가하는 메소드
    // 단, index가 유효하지 않을 겨우에는 원래배열을 리턴한다.
    public static int[] add(int[] arr, int index, int e) {
        // index가 유효한 범위이면 진행하고
        // 아니면 아무것도 안한다.
        if (index >= 0 && index < size(arr)) {
            // 유효한 index이므로 배열에 추가하기 시작한다.

            // arr을 임시보관할 배열 temp
            int[] temp = new int[size(arr)];
            // arr의 내용을 temp에 복사
            for (int i = 0; i < size(arr); i++) {
                temp[i] = get(arr, i);
            }
            // arr의 크기를 1늘린다.
            arr = new int[size(temp) + 1];

            // temp의 값 중 인덱스 0번부터 ~index-1번까지 arr에 복사한다.
            for (int i = 0; i < index; i++) {
                arr[i] = get(temp, i);
            }
//          //arr의 index번 칸에 e를 넣는다.
            arr[index] = e;
            // temp의 값 중 index번 칸부터 끝까지를 arr에 한칸씩 뒤로 밀어서 복사한다.
            for (int i = index; i < size(temp); i++) {
                arr[i + 1] = get(temp, i);
            }
        }
        return arr;
    }

    // J. set()
    // 해당배열의 특정위치의 값을 다른 값으로 바꾼다.
    // 단, 원래 있던 값은 우리가 다른데서 사용할 '수'도 잇으니까
    // 리턴되서 호출된 곳으로 보내주도록 한다.
    public static int set(int[] arr, int index, int e) {
        int temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    // K. remove()
    // 해당배열에 특정 인덱스를 삭제하고
    // 크기라 1줄어든 배열을 리턴한다.
    public static int[] remove(int[] arr, int index) {
        // 먼저 유효한 인덱스인지 체크한다.
        if (index >= 0 && index < size(arr)) {
            // 먼저 arr의 현재내용을 임의로 만든 배열(temp)에 저장한다.
            int[] temp = new int[size(arr)];
            for (int i = 0; i < size(arr); i++) {
                temp[i] = arr[i];// =get(arr,i)랑 같은 의미
            }
            // arr의 크기를 1줄여서 새로만든다
            arr = new int[size(temp) - 1];
            // temp로부터 0부터 index이전까지 복사한다.
            for (int i = 0; i < index; i++) {
                arr[i] = get(temp, i);
            }
            // temp로부터 index+1부터 끝까지 복사한다.
            for (int i = index + 1; i < size(temp); i++) {
                arr[i - 1] = get(temp, i);
            }
        }
        return arr;
    }

    // L.removeByElement()
    // 해당 배열에서 특정 엘리먼트와 일치하는 칸을 삭제한다.
    // 단, 다른 데이터타입은 오버로딩이 가능하기 때문에 remove()라고 해줘도 되지만.
    // int[]의 기준에는 파라미터로 들어온 int값이
    // 인덱스를 말하는지, 삭제할 엘리먼트를 말하는건지 불명확하기 때문에
    // int[]만 메소드 이름을 removeByElement()라고 한다.
    public static int[] removeByElement(int[] arr, int e) {
        int index = indexOf(arr, e);// arr배열에서 e의 index를 찾아 리턴
        arr = remove(arr, indexOf(arr, e));
        return remove(arr, indexOf(arr, e));
    }

    // 2.double배열
    // A. size(arr)
    public static int size(double[] arr) {
        return arr.length;
    }

    // B. isEmpty(배열이름)
    public static boolean isEmpty(double[] arr) {
        return size(arr) == 0;
    }

    // C.get(arr,index)
    public static double get(double[] arr, int index) {
        return arr[index];
    }

    // D.conains(arr,e)
    public static boolean contains(double[] arr, int e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return true;
            }
        }
        return false;
    }

    // E.indexOf(arr,e)
    public static int indexOf(double[] arr, double e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i) == e) {
                return i;
            }
        }
        return -1;
    }

    // F.lastIndex(arr,e)
    public static int lastIndexOf(double[] arr, double e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i) == e) {
                return i;
            }
        }
        return -1;
    }

    // G.clear(arr)
    public static double[] clear(double[] arr) {
        arr = new double[0];
        return arr;
    }

    // H.add(arr,e)
    public static double[] add(double[] arr, double e) {
        double[] temp = new double[size(arr)];
        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        arr = new double[size(temp) + 1];
        for (int i = 0; i < size(temp); i++) {
            arr[i] = get(temp, i);
        }
        arr[size(arr) - 1] = e;

        return arr;
    }

    // I.add(arr,index,e)
    public static double[] add(double[] arr, int index, double e) {
        if (index >= 0 && index < size(arr)) {
            double[] temp = new double[size(arr)];

            for (int i = 0; i < size(arr); i++) {
                temp[i] = get(arr, i);
            }
            arr = new double[size(temp) + 1];

            for (int i = 0; i < index; i++) {
                arr[i] = get(temp, i);
            }
            arr[index] = e;
            for (int i = index; i < size(temp); i++) {
                arr[i + 1] = get(temp, i);
            }
        }
        return arr;
    }

    // J.set(arr,index,e)
    public static double set(double[] arr, int index, double e) {
        double temp = get(arr, index);
        arr[index] = e;

        return temp;
    }

    // K.remove(arr,index)
    public static double[] remove(double[] arr, int index) {
        if (index >= 0 && index < size(arr)) {
            double[] temp = new double[size(arr)];

            for (int i = 0; i < size(arr); i++) {
                temp[i] = get(arr, i);
            }
            arr = new double[size(temp) - 1];

            for (int i = 0; i < index; i++) {
                arr[i] = get(temp, i);
            }
            for (int i = index; i < size(arr); i++) {
                arr[i] = get(temp, i + 1);
            }
        }
        return arr;
    }

    // L.removeByindex(arr,element)
    public static double[] removeByindex(double[] arr, double e) {
        int index = indexOf(arr, e);
        arr = remove(arr, index);
        return arr;
    }

    // 3.String배열
    // A. size(배열이름)
    public static int size(String[] arr) {
        return arr.length;
    }

    // B. isEmpty(배열이름)
    public static boolean isEmpty(String[] arr) {
        return size(arr) == 0;
    }

    // C.get(arr,index)
    public static String get(String[] arr, int index) {
        return arr[index];
    }

    // D.conains(arr,e)
    public static boolean contains(String[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(e)) {
                return true;
            }
        }
        return false;
    }

    // E.indexOf(arr,e)
    public static int indexOf(String[] arr, String e) {
        for (int i = 0; i < size(arr); i++) {
            if (get(arr, i).equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // F.lastIndexOf(arr,e)
    public static int lastIndexOf(String[] arr, String e) {
        for (int i = size(arr) - 1; i >= 0; i--) {
            if (get(arr, i).equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // G.clear(arr)
    public static String[] claer(String[] arr) {
        arr = new String[0];
        return arr;
    }

    // H.add(arr,e)
    public static String[] add(String[] arr, String e) {
        String[] temp = new String[size(arr)];

        for (int i = 0; i < size(arr); i++) {
            temp[i] = get(arr, i);
        }
        arr = new String[size(temp) + 1];

        for (int i = 0; i < size(temp); i++) {
            arr[i] = get(temp, i);
        }
        arr[size(arr) - 1] = e;
        return arr;
    }

    // I.add(arr,index,e)
    public static String[] add(String[] arr, int index,String e) {
        String[] temp = new String[size(arr)];
        
        for(int i=0; i<size(arr); i++) {
            temp[i] = get(arr,i);
        }
        arr = new String[size(temp)+1];
       
        
        for(int i=0; i<index; i++) {
            arr[i] = get(temp,i);
        }
        arr[index] = e;
        for(int i=index+1; i<size(arr); i++) {//index에서 +1을 하고 temp[i-1]하는것
//                                                  ==size(temp)를하고 arr[i+1]을 하는것
            arr[i] = get(temp,i-1);
    }return arr;
    }
    // J.set(arr,index,e)
    public static String set(String[] arr, int index, String e ) {
        String temp=get(arr,index);
        arr[index] = e;
        
        return temp;
    }
    // K.remove(arr,index)
    public static String[] remove(String[] arr,int index) {
        if(index>=0 && index<size(arr)) {
             String[] temp = new String[size(arr)];
             
             for(int i=0; i<size(arr); i++) {
                 temp[i] = get(arr,i);
             }
             arr = new String[size(temp)-1];
             
             for(int i=0; i<index; i++) {
                 arr[i] = get(temp,i);
             }
             for(int i=index; i<size(arr); i++) {
                 arr[i] = get(temp,i+1);
             }
        }return arr;
    }
    // L.removeByindex(arr,element)
    public static String[] removeByindex(String[] arr,String e) {
        int index = indexOf(arr,e);
        arr = remove(arr,indexOf(arr,e));
        
        return arr;
    }
}
