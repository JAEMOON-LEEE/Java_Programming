/**
 * 비정형 배열을 만들어 갑을 초기화하고 출력하라.
 *
 * 10 11 12
 * 20 21
 * 30 31 32
 * 40 41
 *
 * 공식 : (i+1)*10+j
 */


package Cahpter_3;

public class example3_11 {
    public static void main(String[] args) {
        int[][] array;
        array = new int[4][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[2];
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j] = (i+1)*10+j;
            }
        }
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
