/**
 * 겜블링 게임 프로그램을 작성해보자. 사용자가 엔터키를 입력하면  0,1,2 중에서 랜덤하게 3개의 수를 생성하여 출력하고
 * 3개가 모두 같은 값일때 "성공, 대박났어요!"를 출력한다. 실행 예시를 참고하여 프로그램을 작성하라
 * [조건문, whiel 반복문]
 * <실행결과>
 *     ***** 갬블링 게임을 시작합니다. *****
 *     엔터키 입력>>
 *     1 1 0
 *     엔터키 입력>>
 *     0 2 1
 *     인터키입력>>
 *     2 2 2
 *     성공! 대박났어요!
 *     계속하시겠습니까?(yes/no)>> yes
 *     엔터키입력>>
 *     2 2 2
 *     성공! 대박났어요!
 *     계속하시겠습니까?(yes/no)>> no
 *     게임을 종료합니다.
 * </실행결과>
 */


package Cahpter_3;
import java.util.Scanner;
public class Quiz_14 {
    public static void main(String[] args) {
        System.out.println("***** 갬블링 게임을 시작합니다. *****");
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("엔터키 입력>>");
            String enter = scan.nextLine();

            int num1 = (int)(Math.random()*2);
            int num2 = (int)(Math.random()*2);
            int num3 = (int)(Math.random()*2);
            System.out.println(num1+"\t"+num2+"\t"+num3);
            if((num1==num2)&&(num2==num3)){
                System.out.println("성공! 대박났어요!");
                System.out.print("계속하시겠습니까?>>(yes/no)");
                String choice = scan.nextLine();
                if(choice.equals("yes")){
                    continue;
                }
                if(choice.equals("no")){
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }


        }
}}
