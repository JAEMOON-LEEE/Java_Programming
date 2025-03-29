/**
 * For문을 이용하여 1에서 10까지 덧셈으로 표시하고 합을 출력하라.
 *
 * <실행결과>
 *     1+2+3+4+5+6+7+8+9+10=55
 * </실행결과>
 */



package Cahpter_3;

public class example3_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += i;
            System.out.print(i);
            if(i<10){
                System.out.print("+");
            }
            else{
                System.out.print("=");
            }

        }

        System.out.print(sum);
    }

}

