/**
 * 1차원 정수 배열을 2개 생성하고 10명 학생의 학번과 점수를 입력받아 각각 저장하라.
 * 그리고 다음과 같이 학번을 입력하면 점수를 출력하라
 * [배열, 반복문, Scanner, InputMismatchException 예외 등 종합 완성]
 * <실행결과>
 * 10명 학생의 학번과 점수 입력
 * 1>>1 10
 * 2>>2 20
 * 3>>3 30
 * 4>>4 40
 * 5>>5 50
 * 6>>6 60
 * 7>>7 70
 * 8>>8 80
 * 9>>9 90
 * 10>>10 100
 * 학번으로 점수 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>1
 * 학번>>황기태
 * 경고!! 정수를 입력하세요.
 * 학번으로 점수 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>1
 * 학번>>8
 * 점수는 80점입니다.
 * 학번으로 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>2
 * 점수>>80
 * 학번으로 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>2
 * 점수>>80점
 * 경고!1 정수를 입력하세요.
 * 점수가 80점인 학생은 6 7 8 입니다.
 * 학번으로 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>1
 * 학번>>15
 * 15의 학생은 없습니다.
 * 학번으로 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>2
 *
 * 점수>>67점인 학생은 없습니다.
 * 학번으로 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>3
 * 프로그램을 종료합니다.
 * </실행결과>
 */


package Cahpter_3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Quiz_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] students = new int[10][2];

        System.out.println("10명 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ">>");
            for (int j = 0; j < 2; j++) {
                while (true) {
                    try {
                        students[i][j] = scan.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        scan.nextLine();
                        System.out.print((i + 1) + ">>");
                    }
                }
            }
        }

        while (true) {
            System.out.print("학번으로 점수 검색 : 1, 점수로 검색 : 2, 끝내려면 3>>");
            int menu;
            try {
                menu = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scan.nextLine();
                continue;
            }

            if (menu == 1) {
                System.out.print("학번>>");
                try {
                    int id = scan.nextInt();
                    for (int i = 0; i < 10; i++) {
                        if (students[i][0] == id) {
                            System.out.println("점수는 " + students[i][1] + "점입니다.");
                            break;
                        }
                        if (i == 9) System.out.println(id + "의 학생은 없습니다.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    scan.nextLine();
                }
            } else if (menu == 2) {
                System.out.print("점수>>");
                try {
                    int score = scan.nextInt(), count = 0;
                    for (int i = 0; i < 10; i++) {
                        if (students[i][1] == score) {
                            if (count++ == 0) System.out.print("점수가 " + score + "점인 학생은 ");
                            System.out.print(students[i][0] + " ");
                        }
                    }
                    System.out.println(count > 0 ? "입니다." : "점수가 " + score + "점인 학생은 없습니다.");
                } catch (InputMismatchException e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    scan.nextLine();
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("1~3 사이의 숫자를 입력하세요.");
            }
        }
        scan.close();
    }
}
