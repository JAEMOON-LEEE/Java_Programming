package Chapter_2;

// 다음은 비교 연산자와 논리연산자의 사례이다. 실행결과는 무엇인가?
public class example2_7 {
    public static void main(String[] args) {
        // 비교연산
        System.out.println('a'>'b');
        System.out.println(3 >=2);
        System.out.println(-1 <0);
        System.out.println(3.45 <= 2);
        System.out.println(3 ==2);
        System.out.println(3 !=2);
        System.out.println(!(3 != 2));

        // 비교연산과 논리연산 복합
        System.out.println((3>2) && (3>4));
        System.out.println(((3 != 2) || (-1 >0)));
        System.out.println((3 !=2)^(-1>0));
    }
}
