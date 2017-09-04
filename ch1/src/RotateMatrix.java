// This implementation creates and returns another matrix instead of
// switching around values in the original matrix.

public class RotateMatrix {
    public static void main(String[] args) {
        // setting up matrix
        int N = 4;
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = i*N+j;
            }
        }

        int[][] newMatrix = rotateMatrix(matrix, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.format("%-3d", newMatrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    private static int[][] rotateMatrix(int[][] matrix, int N) {
        int[][] newMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                newMatrix[i][j] = matrix[N-1-j][i];
            }
        }
        return newMatrix;
    }
}
