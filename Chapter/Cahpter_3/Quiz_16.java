/**
 * 양수들을 한 줄에 입력받고 평균을 구하는 프로그램을 작성하라. 입력에서 양의 정수가 아닌 것들은 모두 빼고 평균을 구하라.
 * 다음은 실행 사례이다.
 * [예외처리]
 * <실행결과>
 *     양의정수를 입력하세요. -1은 입력 끝>>10 hello 20 3.14 30 -2 40 -1
 *     hello 제외
 *     3.14 제외
 *     -2 제외
 *     평균은 25
 * </실행결과>
 */



package Cahpter_3;
import java.util.Scanner;
public class Quiz_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");
        int sum =0;
        int count = 0;
        while(true){
            String input = scan.next();
            int num;
            try {
                num = Integer.parseInt(input);
            }
            catch (NumberFormatException e){
                System.out.println(input+"제외");
                continue;
            }
            if(num==-1){
                break;
            }
            if(num<0){
                System.out.println(num+"제외");
            }
            sum+=num;
            count++;



    }
        System.out.println("평균은"+sum/count);
}}
