/**
 * 2차원 평명에서 사각형은 두 점으로 표현할 수 있다. 사용자로부터 사각형을 구성하는 두 점 (x1, y1), (x2, y2)을 입력받고
 * 이 사각형이 (10, 10)과 (200, 300) 의 사각형에 완전히 포함되면 "포함된다", 아니면 "포함되지 않는다"를 출력하는
 * 프로그램을 작성하라
 *
 * <실행결과>
 * (x1, y1), (x2, y2)의 좌표 입력>> 50 30 150 200
 * (50, 30) (150, 200) 사각형은 (10,10) (200,300) 사각형이 포함된다
 * </실행결과>
 * <실행결과>
 * (x1, y1), (x2, y2)의 좌표 입력>> 100 100 300 300
 * (100, 100) (300, 300) 사각형은 (10,10) (200,300) 사각형이 포함된다
 * </실행결과>
 *
 */

package Chapter_2;
import java.util.Scanner;
public class Quiz10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("(x1, y1), (x2, y2)의 좌표 입력>>");

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int xx1 = 10;
        int yy1 = 10;
        int xx2 = 200;
        int yy2 = 300;



    }
}
