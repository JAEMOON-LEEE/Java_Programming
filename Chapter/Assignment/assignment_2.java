/**
 * RaggedArray 클래스는 RaggedArray의 생성, 초기화, 출력, 행별 합을 출력하는 실습 입니다.
 *
 * @author (5조, 이재문, 니시 야스히로)
 * @version (2025 04 18)
 */
/**
 * RaggedArray 클래스는 RaggedArray의 생성, 초기화, 출력, 행별 합을 출력하는 실습 입니다.
 *
 * @author (5조, 이재문, 니시 야스히로)
 * @version (2025 04 18)
 */
package Assignment;
public class assignment_2 {
    public static void main(String args[]) {
        // ragged array 생성
        int[][] ragged_array = makeArray(4);

        // ragged array 초기화
        initializeArray(ragged_array);

        // ragged array 출력
        printArray(ragged_array);

        // 줄나눔
        System.out.println("----------");

        // 각 행의 합 출력
        for (int[] ragged_array_row : ragged_array) {
            int ragged_array_row_sum = sumRowData(ragged_array_row);
            System.out.println(ragged_array_row_sum);
        }
    }

    // 행 수를 받아 Ragged Array 생성 (유연성 반영)
    private static int[][] makeArray(int row_count) {
        int[][] ragged_array = new int[row_count][];
        for (int i = 0; i < row_count; i++) {
            if (i % 2 == 0)
                ragged_array[i] = new int[3];
            else
                ragged_array[i] = new int[2];
        }
        return ragged_array;
    }

    // 배열 초기화 (리턴 없이 배열 참조 직접 변경)
    private static void initializeArray(int[][] ragged_array) {
        for (int i = 0; i < ragged_array.length; i++) {
            int j = 0;
            do {
                ragged_array[i][j] = (i + 1) * 10 + j;
                j++;
            } while (j < ragged_array[i].length);
        }
    }

    // 배열 출력 (while + for-each, 가독성 향상)
    private static void printArray(int[][] ragged_array) {
        int now_row_idx = 0;
        while (now_row_idx < ragged_array.length) {
            int[] now_row = ragged_array[now_row_idx];
            for (int num : now_row) {
                System.out.print(num + " ");
            }
            System.out.println();
            now_row_idx++;
        }
    }

    // 한 행의 합 계산
    private static int sumRowData(int[] ragged_array_row) {
        int sum = 0;
        for (int num : ragged_array_row) {
            sum += num;
        }
        return sum;
    }
}

