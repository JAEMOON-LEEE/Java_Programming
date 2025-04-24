/**
 * 2차원 배열에 학년별롷 1학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력하라
 * 1학년: 3.3, 3.4
 * 2학년: 3.5, 3.6
 * 3학년: 3.7, 4.0
 * 4학년: 4.1, 4.2
 * <실행결과>
 *   4년 전체 평점 평균은 3.725
 * </실행결과>
 */


package Cahpter_3;

public class example3_10 {
    public static void main(String[] args) {
        double[][] score = {{3.3, 3.4},
                            {3.5, 3.6},
                            {3.7, 4.0},
                            {4.1, 4.2}};
        double sum = 0;
        for(int i = 0;i<score.length;i++){
            for(int j=0;j<score[0].length;j++){
                sum += score[i][j];
            }

        }
        System.out.println("4년간 전체 평균 평점은"+(double)sum/8);
    }
}
