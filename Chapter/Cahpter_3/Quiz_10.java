/**
 * 4x4크기의 2차원 정수 배열에 0~255 범위의 정수 16개를 랜덤하게 생성하여 초기화 하고 출력하라. 그리고 실행 사례와 같이 임계값을 입력받고,
 * 배열에 저장된 정수가 임계값보다 크면 225, 작거나 같으면 0으로 배열을 수정한 후, 배열을 출력하라
 * <실행결과>
 *     4x4 배열에 랜덤한 값을 저장한 후 출력합니다.
 *     239 0 104 166
 *     192 105 129 194
 *     59 110 255 168
 *     97 7 157 65
 *     임계값입력>>100
 *     255 0 255 255
 *     255 255 255 255
 *     0 255 255 255
 *     0 0 255 0
 * </실행결과>
 */


package Cahpter_3;
import  java.util.Scanner;
public class Quiz_10 {
    public static void main(String[] args) {
        int[][] intArray = new int[4][4];
        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        for(int i =0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++){
                intArray[i][j]=(int)(Math.random()*255);
                System.out.print(intArray[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.print("임계값 입력>>");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i =0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++){
                if(intArray[i][j]>num){
                    intArray[i][j]=255;
                }
                else{
                    intArray[i][j]=0;
                }
                System.out.print(intArray[i][j]+"\t");
}
            System.out.println();}            }}
