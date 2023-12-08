package prak_pbo_222362_moch_achmar_j_tugas;

import java.util.Scanner;

public class PRAK_PBO_222362_Moch_Achmar_J_Tugas_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan waktu dalam satuan detik: ");
        int detik = input.nextInt();

        int[] waktu = new int[3];
        String[] satuan = {"jam", "menit", "detik"};
        int[] pembagi = {3600, 60, 1};

        for (int i = 0; i < waktu.length; i++) {
            waktu[i] = detik / pembagi[i];
            detik %= pembagi[i];
        }

        for (int i = 0; i < waktu.length; i++) {
            System.out.print(waktu[i] + " " + satuan[i]);
            if (i < waktu.length - 1) {
                System.out.print(", ");
            }
        }
    }
}