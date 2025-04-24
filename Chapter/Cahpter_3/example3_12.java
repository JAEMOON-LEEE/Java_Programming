/**
 * 정수 4개를 가지는 일차원 배열을 생성하고 1, 2, 3, 4로 초기화한 다음, 배열을
 * 리턴하는 makeArray()를 작성하고
 * 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램을 작성하라.
 *
 * <실행결과>
 *     0 1 2 3
 * </실행결과>
 */



package Cahpter_3;

public class example3_12 {
    public static int[] makeArray() {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
    public static void main(String[] args){
        int[] intarray;
        intarray=makeArray();
        for(int i = 0;i<intarray.length;i++){
            System.out.print(intarray[i]+"\t");
        }
        }
    }

