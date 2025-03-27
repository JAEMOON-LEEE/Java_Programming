/**
 * 여행 경비를 계산하는 프로그램을 작성한다. 방하나에는 2명까지 투숙가능하며 1명만 투숙해도 1방의 비용을 지불한다.
 *
 * <실행결과>
 *     여행지>> 태국 치앙마이
 *     인원수>> 5
 *     숙박일>> 4
 *     1인당 항공료>> 250000
 *     1방 숙박비>> 150000
 *     5명의 태국 치앙마이 4박 5일 여행에는 방이 3개 필요하며 경비는 3050000원입니다.
 * </실행결과>
 */

package Chapter_2;
import java.util.Scanner;
public class Quiz_4 {
    public static void main(String[] args) {

        System.out.print("여행지>>");
        Scanner scanner = new Scanner(System.in);
        String where = scanner.nextLine();

        System.out.print("인원수>>");
        Scanner scanner2 = new Scanner(System.in);
        int people = scanner2.nextInt();

        System.out.print("숙박일>>");
        Scanner scanner3 = new Scanner(System.in);
        int sleep = scanner3.nextInt();

        System.out.print("1인당 항공료>>");
        Scanner scanner4 = new Scanner(System.in);
        int fly = scanner4.nextInt();

        System.out.print("숙박비>>");
        Scanner scanner5 = new Scanner(System.in);
        int SleepMoney = scanner5.nextInt();

        int room = ((people/2) + (people %2));

        System.out.println(people+"명의"+where+"박"+(where+1)+"일 여행에는 방이"+room+"개 필요하며 경비는"+((people*fly)+(SleepMoney*room*sleep))+"입니다.");
    }

}
