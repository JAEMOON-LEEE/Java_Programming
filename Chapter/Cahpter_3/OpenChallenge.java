package Cahpter_3;
import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer, guess;
        String again;

        do {
            // 0~99 사이의 임의의 수 선택
            answer = (int)(Math.random() * 100);
            int min = 0, max = 99;
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println(min + "-" + max);

            int count = 1;
            while (true) {
                System.out.print(count + ">>");
                guess = scanner.nextInt();

                if (guess < answer) {
                    System.out.println("더 높게");
                    min = guess + 1;
                } else if (guess > answer) {
                    System.out.println("더 낮게");
                    max = guess - 1;
                } else {
                    System.out.println("맞았습니다.");
                    break;
                }
                System.out.println(min + "-" + max);
                count++;
            }

            System.out.print("다시 하시겠습니까?(y/n)>>");
            again = scanner.next();
        } while (again.equals("y"));

        scanner.close();
    }
}
