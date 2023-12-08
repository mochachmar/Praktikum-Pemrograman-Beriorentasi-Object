package prak_pbo_222362_moch_achmar_j_tugas;

import java.util.Scanner;

public class PRAK_PBO_222362_Moch_Achmar_J_Tugas_03_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();

        int gajiPerJam = 45000;
        int jamNormal = 20;
        int jamLembur;
        int gaji = 0;
        int gajiLembur = 0;
        int totalGaji = 0;

        while (jamKerja > 0) {
            if (jamKerja > jamNormal) {
                jamLembur = jamKerja - jamNormal;
                gajiLembur = (int) (jamLembur * gajiPerJam * 1.5);
                jamKerja = jamNormal;
            }
            gaji = jamKerja * gajiPerJam;
            totalGaji = gaji + gajiLembur;
            jamKerja = 0;
        }

        System.out.println("Nama karyawan: " + nama);
        System.out.println("Gaji: Rp. " + gaji);
        System.out.println("Lembur: Rp. " + gajiLembur);
        System.out.println("Total gaji: Rp. " + totalGaji);
    }
}