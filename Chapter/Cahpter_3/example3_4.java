/**
 * 2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램을 작성하라.
 *
 * <실행결과>
 *     1*1=1    1*2=2   1*3=3 ...
 *     2*1=2    2*2=4   2*3=6
 *     3*1=3    3*2=8   3*3=6
 *     ...
 * </실행결과>
 */


package Cahpter_3;

public class example3_4 {
    public static void main(String[] args) {
        for(int num1=1;num1<10;num1++){
            for(int num2=1;num2<10;num2++){
                int result=num1 * num2;
                System.out.print(num1+"*"+num2+"="+result);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
