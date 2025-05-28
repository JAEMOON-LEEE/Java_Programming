package Chapter_4.Quiz_2;

public class Quiz_2_main {
    public static void main(String[] args) {
        Quiz_2_Cube cube = new Quiz_2_Cube(1,2,3);
        System.out.println("큐브의 부피는" + cube.getVolume());
        cube.increase(1,2,3);
        System.out.println("큐브의 부피는"+cube.getVolume());
        if (cube.isZero()){
            System.out.println("큐브의 부피는 0");
        }
        else{
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}
