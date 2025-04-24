package Cahpter_3;

public class Quiz_4 {
    public static void main(String[] args) {
        int[][] array={{1, 2, 3},{1, 2},{1},{1, 2, 3},{1, 2, 3, 4}};
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
