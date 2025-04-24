/**
 * 분식점 가격 계산 프로그램을 작성해보자. 떡볶이 1인분은 2000원,
 * 김말이 1인분은 1000원, 쫄면1인분은 3000원이다
 *
 * <실행결과>
 *     **** 자바분식입니다. 주문하면 금액을 알려드립니다. ****
 *     떡볶이 몇 인분>>3
 *     김말이 몇 인분>>4
 *     쫄면 몇 인분>>2
 *     전체 금액은 16000원입니다.
 * </실행결과>
 */
package Chapter_2;
import java.util.Scanner;
public class Quiz_3 {
    public static void main(String[] args) {
        System.out.println("**** 자바분식입니다. 주문하면 금액을 알려드립니다. ****");
        System.out.print("떡볶이 몇 인분>>");
        Scanner scanner = new Scanner(System.in);
        int booki = scanner.nextInt();
        System.out.print("김말이 몇 인분>>");
        Scanner scanner2 = new Scanner(System.in);
        int kim = scanner2.nextInt();
        System.out.print("쫄면 몇 인분>>");
        Scanner scanner3 = new Scanner(System.in);
        int noodle = scanner3.nextInt();

        System.out.println("전체금액은"+
                ((booki*2000)+(kim*1000)+(noodle*3000))+"원 입니다.");
    }
}
