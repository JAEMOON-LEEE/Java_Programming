/*
 * do-while 문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하라.
 * <실행결과>
 * abcdefghijklmnopqrstuvwxyz
 * </실행결과>
 *
 */
package Cahpter_3;

public class example3_3 {
    public static void main(String[] args) {
        char i = 'a';
        do{
            System.out.print(i);
            i++;
        } while(i<='z');
    }
}
