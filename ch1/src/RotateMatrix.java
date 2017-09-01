public class RotateMatrix {
    public static void main(String[] args) {
        // setting up matrix
        int N = 4;
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j; j < N; j++) {
                matrix[i][j] = i*4+j;
            }
        }


    }
}
