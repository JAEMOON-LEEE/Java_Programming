package Chapter_2;

public class CheckTime {
    public static void main(String[] args) {
        int x = 2, y= 10, z= 0;
        z= x++*2+--y-5+x*(y%2); //식에서 x,y는 왼쪽부터 계산해서 변수가 변경되면 뒤에나오는 변수도 변경됨 ex) 앞에서 x가 3으로 증가되면 뒤의 x도 3으로 증가함.
        System.out.println(z);

        System.out.println(8>>2);
        System.out.println(-16>>2);

        int opr = 4;
        System.out.println(opr++); // 4표출 : ++는 후위 증가 연산자이므로 4표출됨
    }
}
