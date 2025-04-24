/**
 * 몇 개이 정수를 저장할 것인지 개수를 입력받고, 그 만큼의 배열을 생성하라 그리고 배열에 1~100 범위의 랜덤한 정수를 저장한 후, 정수들과
 * 평균을 출력하라. 단 같은 정수가 저장되지 않게 하라.
 * <실행결과>
 *     정수 몇 개 저장하시겠습니까?>12
 *     랜덤한 정수들...67 69 21 48 27 92 55 50 47 93 75
 *     평균은 56.166666666666666664
 * </실행결과>
 */


package Cahpter_3;

import java.util.Scanner;
public class Quiz_8 {
    public static void main(String[] args) {
        System.out.print("정수 몇 개 저장하시겠습니까?>>");
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        int[] number = new int[j];
        System.out.print("랜덤한 정수들...");
        int sum = 0;

        for(int i = 0; i<j;i++){
            number[i] = (int)(Math.random()*100)+1;
            sum+=number[i];
            System.out.print(number[i]+"\t");
        }
        System.out.println();
        System.out.println("평균은"+(double)sum/j);



    }
}
