import java.util.Scanner;

public class JumlahBarisKolom {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[][] A = new int[4][4];   // matriks awal 4x4
            int[][] B = new int[5][5];   // matriks output 5x5 (dengan tambahan baris + kolom)

            // Input matriks
            System.out.println("Masukkan elemen matriks 4x4:");
            for (int i = 0; i < 4; i++) {
                System.out.print("Baris " + (i + 1) + ": ");
                for (int j = 0; j < 4; j++) {
                    A[i][j] = in.nextInt();
                }
            }

            // Salin A ke B
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    B[i][j] = A[i][j];
                }
            }

            // Hitung jumlah per baris → kolom ke-5
            for (int i = 0; i < 4; i++) {
                int sum = 0;
                for (int j = 0; j < 4; j++) {
                    sum += A[i][j];
                }
                B[i][4] = sum;
            }

            // Hitung jumlah per kolom → baris ke-5
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    sum += A[i][j];
                }
                B[4][j] = sum;
            }

            // Hitung total keseluruhan (pojok kanan bawah)
            int total = 0;
            for (int i = 0; i < 4; i++) {
                total += B[i][4];
            }
            B[4][4] = total;

            // Output
            System.out.println("\n=== Matriks dengan Penjumlahan Baris & Kolom ===");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
