/**
 * Switch문을 이용하여 커피메뉴의 가격을 알려주는 프로그램을 작성하라. 에소프레소, 카푸치노, 카페라떼는 3,500원이고, 아메리카노는 2,000원이다
 *
 * <실행결과>
 *     무슨 커피 드릴까요? 에소프레소
 *     에소프레소는 3500원입니다.
 * </실행결과>
 */



package Chapter_2;
import java.util.Scanner;

public class example2_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("무슨 커피 드릴까요?");

        String order = scan.next();
        switch (order){
            case "에소프레소":
            case "카푸치노":
            case "카페라떼":
                System.out.println(order+"는 3,500원 입니다");
            break;
            case "아메리카노":
                System.out.println(order+"는 2,000원 입니다.");
                break;
            default:
                System.out.println("메뉴에 없습니다.");
        }
    }
}
