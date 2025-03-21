/**
 * 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하라.
 * <실행결과>
 *     수를 입력하시오: 129
 *     3의 배수입니다.
 * </실행결과>
 */

import java.util.Scanner;
public class example2_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("수를 입력하시오 :");
        int num = scan.nextInt();
        if( num % 3 == 0){
            System.out.println("3의 배수입니다.");
        }
        else{
            System.out.println("3의 배수가 아닙니다.");
        }

    }
}
