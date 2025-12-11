import java.util.Scanner;

public class SegitigaBawahFungsi {

    public static int[][] inputMatrix(int n, Scanner in) {
        int[][] M = new int[n][n];
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Baris " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                M[i][j] = in.nextInt();
            }
        }
        return M;
    }

    public static int[][] makeLowerTriangle(int[][] A) {
        int n = A.length;
        int[][] B = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    B[i][j] = 0; 
                } else {
                    B[i][j] = A[i][j]; 
                }
            }
        }
        return B;
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = in.nextInt();

        int[][] A = inputMatrix(n, in);
        int[][] segitigaBawah = makeLowerTriangle(A);

        System.out.println("\n=== Matriks Segitiga Bawah ===");
        printMatrix(segitigaBawah);
    }
}
