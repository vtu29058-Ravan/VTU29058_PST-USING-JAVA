public class StrassenMatrix {

    static int[][] multiply(int[][] A, int[][] B) {

        int n = A.length;
        int[][] C = new int[n][n];

        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int newSize = n / 2;

        int[][] A11 = new int[newSize][newSize];
        int[][] A12 = new int[newSize][newSize];
        int[][] A21 = new int[newSize][newSize];
        int[][] A22 = new int[newSize][newSize];

        int[][] B11 = new int[newSize][newSize];
        int[][] B12 = new int[newSize][newSize];
        int[][] B21 = new int[newSize][newSize];
        int[][] B22 = new int[newSize][newSize];

        split(A, A11, 0, 0);
        split(A, A12, 0, newSize);
        split(A, A21, newSize, 0);
        split(A, A22, newSize, newSize);

        split(B, B11, 0, 0);
        split(B, B12, 0, newSize);
        split(B, B21, newSize, 0);
        split(B, B22, newSize, newSize);

        int[][] M1 = multiply(add(A11, A22), add(B11, B22));
        int[][] M2 = multiply(add(A21, A22), B11);
        int[][] M3 = multiply(A11, subtract(B12, B22));
        int[][] M4 = multiply(A22, subtract(B21, B11));
        int[][] M5 = multiply(add(A11, A12), B22);
        int[][] M6 = multiply(subtract(A21, A11), add(B11, B12));
        int[][] M7 = multiply(subtract(A12, A22), add(B21, B22));

        int[][] C11 = add(subtract(add(M1, M4), M5), M7);
        int[][] C12 = add(M3, M5);
        int[][] C21 = add(M2, M4);
        int[][] C22 = add(subtract(add(M1, M3), M2), M6);

        combine(C, C11, 0, 0);
        combine(C, C12, 0, newSize);
        combine(C, C21, newSize, 0);
        combine(C, C22, newSize, newSize);

        return C;
    }

    static int[][] add(int[][] A, int[][] B) {

        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    static int[][] subtract(int[][] A, int[][] B) {

        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];

        return C;
    }

    static void split(int[][] P, int[][] C, int row, int col) {

        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < C.length; j++)
                C[i][j] = P[i + row][j + col];
    }

    static void combine(int[][] C, int[][] P, int row, int col) {

        for (int i = 0; i < P.length; i++)
            for (int j = 0; j < P.length; j++)
                C[i + row][j + col] = P[i][j];
    }

    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] C = multiply(A, B);

        System.out.println("Result:");

        for (int[] row : C) {
            for (int value : row)
                System.out.print(value + " ");

            System.out.println();
        }
    }
}