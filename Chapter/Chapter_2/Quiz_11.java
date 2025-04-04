/**
 * 임베디드 컴퓨터에서는 변수의 각 비트를 장치의 상태를 나타내기 위해 사용한다.
 * 비트0(최하위비트): 값이 0이면 전원이 꺼져있고 1이면 켜져있음
 * 비트1 : 값이 0이면 문이 열려 있고, 1이면 닫혀있음
 * 비트2 : 값이 0이면 냉장고 전구가 손상된 상태이고, 1이면 정상작동
 * 비트3 : 값이 0이면 냉장고 온도가 3도 이상이고, 1이면 3도 미만
 * 비트4이상 : 아무 의미 없음
 * 냉장고의 상태를 나타내는 8비트를 입력받고 하위 4비트를 분석하여 냉장고의 상태를 출력하는 프로그램을 작성하라.
 *
 * <실행 결과>
 *     냉장고 상태 입력>> 00001101
 *     전원 켜져 있음. 문 열려 있음. 전구 정상 작동. 냉장고 온도 3도 미만
 * </실행 결과>
 * <실행 결과>
 *      냉장고 상태 입력>> 00000110
 *      전원 꺼져 있음. 문 닫혀 있음. 전구 정상 작동. 냉장고 온도 3도 이상
 * </실행 결과>
 */

package Chapter_2;
import java.util.Scanner;
public class Quiz_11 {
    public static void main(String[] args) {
        System.out.print("냉장고 상태 입력>> ");
        Scanner scan = new Scanner(System.in);

        String num = scan.next();
        byte status = Byte.parseByte(num, 2);

        if ((status & 0b00000001) != 0) {
            System.out.print("전원켜져있음.\t");}
        else {
            System.out.print("전원꺼져있음.\t");}

        if ((status & 0b00000010) != 0) {
            System.out.print("문닫혀있음.\t");}
        else {
            System.out.print("문열려있음.\t");}

        if ((status & 0b00000100) != 0) {
            System.out.print("전구정상.\t");}
        else {
            System.out.print("전구손상.\t");}

        if ((status & 0b00001000) != 0) {
            System.out.print("냉장고온도 3도 이하.\t");}
        else {
            System.out.print("냉장고온도 3도 이상.\t");}

        }
    }
