/**
 * 1. 다음프로그램에 대해 물음에 답하라.
 */


package Cahpter_3;

public class Quiz_1_1 {
    public static void main(String[] args) {
        int sum=0, i=1;
        while (true) {
            if(i > 50)
                break;
            sum = sum + i;
            i += 3;
        }
        System.out.println(sum);
    }
}
