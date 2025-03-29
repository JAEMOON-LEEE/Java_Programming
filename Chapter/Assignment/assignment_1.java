/**
 * 계산식을 입력받아서 계산하는 프로그램 작성
 * Switch문만 사용
 *  <실행결과>
 *      계산식 >>2 + 4
 *      2 + 4의 계산결과는 6
 *  </실행결과>
 */

package Assignment;
import java.util.Scanner;
public class assignment_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("계산식>>");
        int operand1 = scan.nextInt();
        String operator = scan.next();
        int operand2 = scan.nextInt();

        switch (operator) {
            case "+":
                System.out.println(operand1 + operator + operand2 + "의 계산결과는" + ((int)((double)operand1 + (double) operand2)));
                break;
            case "-":
                System.out.println(operand1 + operator + operand2 + "의 계산결과는" + ((int)((double)operand1 - (double) operand2)));
                break;
            case "*":
                System.out.println(operand1 + operator + operand2 + "의 계산결과는" + ((int)((double)operand1 * (double) operand2)));
                break;
            case "/":
                switch (operand1) {
                    case 0:
                        System.out.println("0은 나눌 수 없습니다!");
                        break;
                    default:
                        switch (operand2) {
                            case 0:
                                System.out.println("0으로는 나눌 수 없습니다!");
                                break;
                            default:
                                System.out.println(operand1 + operator + operand2 + "의 계산결과는" + ((int)((double)operand1 / (double) operand2)));
                        }
                }break;
            case "%":
                System.out.println(operand1 + operator + operand2 + "의 계산결과는" + ((int)((double)operand1 % (double) operand2)));
                break;



        }

    }}

