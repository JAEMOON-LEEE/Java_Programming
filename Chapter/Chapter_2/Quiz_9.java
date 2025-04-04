/**
 * 2차원 평명에서 사각형은 두 점으로 표현할수 있다. (10, 10)과(200, 300)의 두점으로 이루어진 사각형이 있을 때, 정수 X와Y값을 입력받고
 * 점(x, y)가 이 사각형 안에 있는지, 사각형 선 상에 있는지, 사각형 외부에 있는지 판별하는 프로그램을 작성하라.
 * <실행결과>
 *     점 (x, y)의 좌표입력>>50, 50
 *     (50, 50)는 사각형 안에 있습니다.
 * </실행결과>
 *  * <실행결과>
 *  *     점 (x, y)의 좌표입력>>10, 250
 *  *     (10, 250)는 사각형 안에 있습니다.
 *  * </실행결과>
 *   * <실행결과>
 *  *     점 (x, y)의 좌표입력>>10, 320
 *  *     (10, 320)는 사각형 안에 있습니다.
 *  * </실행결과>
 */

package Chapter_2;

import java.util.Scanner;
    public class Quiz_9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // 1. 입력 받기 (예: "50 50")
            System.out.print("점 (x, y)의 좌표 입력>> ");
            int x = scan.nextInt(); // 첫 번째 정수 (x)
            int y = scan.nextInt(); // 두 번째 정수 (y)

            // 2. 사각형 범위 설정 (문제에서 주어진 값)
            int left = 10, bottom = 10;   // 왼쪽 아래 좌표
            int right = 200, top = 300;   // 오른쪽 위 좌표

            // 3. 점의 위치 판별
            if (x >= left && x <= right && y >= bottom && y <= top) {
                // 사각형 내부 또는 경계에 있을 때
                if (x == left || x == right || y == bottom || y == top) {
                    System.out.println("(" + x + ", " + y + ")는 사각형 선 상에 있습니다.");
                } else {
                    System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
                }
            } else {
                System.out.println("(" + x + ", " + y + ")는 사각형 밖에 있습니다.");
            }
        }
    }