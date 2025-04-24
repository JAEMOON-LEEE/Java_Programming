/**
 * 사용자로부터"남" 혹은 "여"를 입력받아. 남자 또는 여자의 이름을 작명하는 프로그램을 작성하라. 다음 실행 예시와 같이 "그만"을 입력하면 프로그램을 종료한다.
 * [배열, 조건문, while반복문 사용]
 * <실행결과>
 *     ***** 작명 프로그램이 실행됩니다. *****
 *     남/여 선택>>여
 *     성 입력>>하
 *     추천 이름: 하여린
 *     남/여 선택>>여
 *     성 입력>>김
 *     추천 이름: 김하진
 *     남/여 선택>>남
 *     성 입력>>홍
 *     추천 이름: 홍민우
 *     남/여 선택>야야야
 *     남/여/그만 중에서 입력하세요!!!
 *     남/여 선택>>그만
 * </실행결과>
 */

package Cahpter_3;
import java.util.Scanner;
public class Quiz_12 {
    public static void main(String[] args) {
        System.out.println("***** 작명 프로그램이 실행됩니다. *****");
        Scanner scan = new Scanner(System.in);

        String boyMiddleList[] = {"준", "현", "우", "석", "혁", "빈", "재", "태", "도", "형"};
        String boyLastList[] = {"호", "진", "성", "찬", "범", "식", "일", "건", "훈", "철"};
        String girlMiddleList[] = {"서", "예", "지", "하", "은", "유", "아", "솔", "다", "연"};
        String girlLastList[] = {"린", "현", "미", "진", "슬", "나", "빛", "별", "율", "혜"};


        //중간이름(남자)
        int index = (int)(Math.random()*boyMiddleList.length);
        String boymiddle = boyMiddleList[index];

        //뒷이름(남자)
        int index2 = (int)(Math.random()* boyLastList.length);
        String boylast = boyLastList[index2];

        //중간이름(여자)
        int index3 = (int)(Math.random()*boyMiddleList.length);
        String girlmiddle = boyMiddleList[index];

        //뒷이름(여자)
        int index4 = (int)(Math.random()* boyLastList.length);
        String girllast = boyLastList[index2];

        while(true) {
            System.out.print("남/여 선택>>");
            String sex = scan.nextLine();

            if (sex.equals("그만")) {
                break;
            }
            if (!sex.equals("남") && !sex.equals("여")) {
                System.out.print("남/여/그만 중에서 입력하세요!");
                System.out.println();
                continue;

            }
            System.out.print("성 입력>>");
            String firstName = scan.nextLine();

            if(sex.equals("남")){
                System.out.print("추천이름:"+firstName+boymiddle+boylast);
            }
            else if (sex.equals("여")) {
                System.out.print("추천이름:"+firstName+girlmiddle+girllast);

            }
            System.out.println();
        }







        }



    }
