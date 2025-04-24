package Chapter_2;// 다음은 대입 연산자와 증감 연산자를 활용하는
// 사례이다. 실행결과는 무엇인가?

public class example2_6 {
    public static void main(String[] args) {
        int a= 3, b= 3, c=3;
        // 대입 연산자 사례
        a +=3; // a=a+3 = 6
        b *=3; // b=b*3 = 9
        c %=2; // c=c%2 = 1
        System.out.println("a="+a+", b="+b+", c="+c);

        int d = 3;
        // 증감연산자 사례
        a= d++;
        System.out.println("a="+a+", d="+d);
        a= ++d;
        System.out.println("a="+a+", d="+d);
        a= d--;
        System.out.println("a="+a+", d="+d);
        a= --d;
        System.out.println("a="+a+", d="+d);

    }
}