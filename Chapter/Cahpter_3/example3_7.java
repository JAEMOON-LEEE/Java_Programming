/**
 * 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라 [ 배열사용]
 * <실행결과>
 *     양수 5개를 입력하세요.
 *     1
 *     39
 *     78
 *     100
 *     99
 *     가장 큰 수는 100입니다.
 * </실행결과>
 */


package Cahpter_3;
import java.util.Scanner;
public class example3_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("양수 5개를 입력하세요.");
        int intArray [] = new int[5];
        int max = 0;
        for(int i=0;i<5;i++) {
            intArray[i] = scan.nextInt();
            if (intArray[i] > max) {
                max = intArray[i];
            } else {
            }
        }
        System.out.println("가장 큰 수는 "+max+"입니다.");


    }}