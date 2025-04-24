

package Chapter_2;
import java.util.Scanner;
public class Quizx_12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("자동차 상태 입력>>");
            String str = scanner.next();
            byte status = Byte.parseByte(str, 2);  // 2진수 문자열 입력받아 byte로 변환

            // 7번 비트: 달리는 상태인지
            if ((status & 0b10000000) != 0) System.out.print("달리는 상태이고 ");
            else System.out.print("정지 상태이고 ");

            // 6번 비트: 에어컨 상태
            if ((status & 0b01000000) != 0) System.out.print("에어컨이 켜진 상태이고 ");
            else System.out.print("에어컨이 꺼진 상태이고 ");

            // 0~5번 비트: 온도 (0~31)
            int temperature = status & 0b00111111;
            System.out.println("온도는 " + temperature + "도이다.");

            scanner.close();
        }
    }

