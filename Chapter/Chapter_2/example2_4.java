package Chapter_2; /**
 * 이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요
 * Kim Seoul 20 65.1 true (키입력 부분)
 * 이름은 Kim, 도시는 Seoul, 나이는 20살, 체중은 65.1kg, 독신여부는 true입니다.
 */

import java.util.Scanner;
public class example2_4 {
    public static void main(String[] args) {
        System.out.print("이름, 도시, 나이, 체중, 독신여부를 빈칸에 분리하여 입력하세요 :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String city = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean marry = scanner.nextBoolean();
        System.out.println("이름은"+name+", 도시는"+city+", 나이는"+age+"살, 체중은"+weight+", 독신여부는"+marry+"입니다.");
        scanner.close(); // scanner 객체 닫기
    }
}
