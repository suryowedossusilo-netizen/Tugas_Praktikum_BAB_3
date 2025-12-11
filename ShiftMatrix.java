import java.util.Scanner;

public class ShiftMatrix {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] A = new int[4][4];
            int[][] B = new int[4][4];

            System.out.println("Masukkan elemen matriks 4x4:");
            for (int i = 0; i < 4; i++) {
                System.out.print("Baris " + (i + 1) + ": ");
                for (int j = 0; j < 4; j++) {
                    A[i][j] = input.nextInt();
                }
            }

            System.out.println("\n=== Matriks Sebelum Digeser ===");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < 4; i++) {
                int from = (i - 1 + 4) % 4;
                for (int j = 0; j < 4; j++) {
                    B[i][j] = A[from][j];
                }
            }

            System.out.println("\n=== Matriks Setelah Digeser ===");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
