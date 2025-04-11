/**
 * "exit"이 입력되면 while문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.
 *
 * <실행결과>
 *     exit을 입력하면 종료합니다.
 *     >>edit
 *     >>exit
 *     종료합니다.
 * </실행결과>
 */


package Cahpter_3;
import java.util.Scanner;
public class example3_6 {
    public static void main(String[] args) {
        System.out.println("exit을 입력하면 종료합니다.");
        Scanner scan = new Scanner(System.in);
        String i = scan.next();
        while(i=="exit"){
            System.out.println("종료합니다.");
            break;

        }
    }
}
