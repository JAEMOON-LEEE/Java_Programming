/**
 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라
 * <실행결과>
 *     5개의 정수를 입력하세요>> 2 3 4 5 9
 *     평균은 4.6
 * </실행결과>
 */



package Cahpter_3;
import  java.util.Scanner;
public class example3_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[5];
        int sum = 0;
        System.out.print(intArray.length+"개의 정수를 입력하세요>>");
        for (int i=0;i<intArray.length;i++) {
            intArray[i] = scan.nextInt();
        }
        for (int i = 0;i<intArray.length;i++) {
            sum += intArray[i];
        }
        System.out.println("평균은"+(double)sum/intArray.length);




    }
}
