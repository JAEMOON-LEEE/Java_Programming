/**
 * Scanner 클래스를 이용하여 달러를 입력받아 실행 사례와 같이 원화로 바꾸는 프로그램을 작성하라.
 * $1 = 1200원으로 가정한다
 *
 * <실행결과>
 *   $1 = 1200원입니다. 달러를 입력하세요>> 253
 *   $253는 303600입니다.
 * </실행결과>
*/
package Chapter_2;
import java.util.Scanner;
public class Quiz_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("$1 = 1200원입니다. 달러를 입력하세요>>");
        int Doller = scan.nextInt();
        int KoreaMoney = Doller * 1200;

        System.out.println("$"+Doller+"는"+KoreaMoney+"원 입니다.");


    }
}
