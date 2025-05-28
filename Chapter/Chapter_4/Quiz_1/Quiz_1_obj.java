package Chapter_4.Quiz_1;



public class Quiz_1_obj {
    String rogo;
    int  price;
    int inch;

    Quiz_1_obj (String rogo, int inch, int price){
        this.inch = inch;
        this.rogo = rogo;
        this.price = price;
    }

    void show(){
        System.out.println(rogo+"에서 만든"+price+"만원짜리의"+inch+"인치 TV");
    }
}