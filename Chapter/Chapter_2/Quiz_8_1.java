/**
 * <문제>
 * 실수(double)에 대한 사칙연산을 수행하는 프로그램을 작성하라.
 * 연산은 "더하기","빼기","곱하기","나누기"로 하고, 계산식은 "2.3 더하기 3.6"과같이 빈 칸으로 분리하여 입력
 * 0으로 나누기가 입력되면. "0으로 나눌 수 없습니다."를 출력하고, 연산 명령이 사칙이 아닌경우 "사칙연산이 아닙니다"를 출력하고 종료
 * if-else문을 이용하여 프로그램을 작성하라.
 * </문제>
 *
 * <실행결과>
 *     연산 입력 >>25 곱하기 2.7
 *     25.0 곱하기 27의 계산 결과는 67.5
 *
 * </실행결과>
 */

package Chapter_2;

import java.util.Scanner;
public class Quiz_8_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("연산 입력>>");

        double num1 = scan.nextDouble();
        String operation = scan.next();
        double num2 = scan.nextDouble();
        if(num2 == 0.0){
            System.out.println("0으로는 나눌수 없습니다.");
        }
        else if(operation.equals("더하기")){
            System.out.println(num1+"더하기" + num2 + "의 계산 결과는"+(num1+num2));
        }
        else if(operation.equals("빼기")){
            System.out.println(num1+"빼기" + num2 + "의 계산 결과는"+(num1-num2));
        }
        else if(operation.equals("곱하기")){
            System.out.println(num1+"곱하기" + num2 + "의 계산 결과는"+(num1*num2));
        }
        else if(operation.equals("나누기")) {
            System.out.println(num1 + "나누기" + num2 + "의 계산 결과는" + (num1 / num2));
        }

        else{
                System.out.println("사칙연산이 아닙니다");
        }

    }
}
