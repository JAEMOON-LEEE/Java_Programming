/**
 * 자동차 제어 장치에는 자동차의 상태를 나타내는 정수형 변수가 있다. 이 변수의 각 비트는 다음과 같이 자동차의 상태를 나타낸다고 하자.
 * 비트 0~5 : 현재 자동차 내 온도 값으로 , 십진수로는 0~312의 값
 * 비트 6 : 값이 0이면 에어컨이 꺼져 있는 상태, 1이면 켜져 있는 상태
 * 비트 7 : 값이 0이면 자동차가 정지 상태, 1이면 달리는 상태
 * 비트 8 이상 : 아무 이상 없음
 *
 * <실행결과>
 *     자동차 상태 입력>>139
 *     자동차는 달리는 상태이고 에어컨이 꺼진 상태이고 온도는 11도이다.
 * </실행결과>
 * <실행결과>
 *     자동차 상태 입력>>80
 *     자동차는 달리는 상태이고 에어컨이 켜진 상태이고 온도는 16도이다.
 * </실행결과>
 */


package Chapter_2;
import java.util.Scanner;
public class Quiz_12 {
    public static void main(String[] args) {
        System.out.println("자동차 상태 입력>>");
        Scanner scan = new Scanner(System.in);

        int status = scan.nextInt();

        if ((status & 0b00000001) != 0) {
            System.out.print((int)(status & 0b00000001);}
        else {
            System.out.print("전원꺼져있음.\t");}

        if ((status & 0b00100000) != 0) {
            System.out.print("에어컨 꺼져있음..\t");}
        else {
            System.out.print("에어컨 켜져있음.\t");}

        if ((status & 0b01000000) != 0) {
            System.out.print("전구정상.\t");}
        else {
            System.out.print("전구손상.\t");}





    }
}
