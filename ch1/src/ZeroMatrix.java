public class ZeroMatrix {
    public static void main(String[] args) {
        // setting up matrix
        int M = 5;
        int N = 4;
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 11;
            }
        }
        matrix[2][1] = 0;
        matrix[4][1] = 0;

        zeroMatrix(matrix, M, N);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.format("%-3d", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    private static void zeroMatrix(int[][] matrix, int M, int N) {
        int[] row = new int[M];
        int[] column = new int[N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (row[i] == 1 || column[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
