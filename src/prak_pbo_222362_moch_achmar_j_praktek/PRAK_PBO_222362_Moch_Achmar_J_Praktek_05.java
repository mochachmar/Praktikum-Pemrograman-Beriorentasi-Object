package prak_pbo_222362_moch_achmar_j_praktek;

import java.util.Scanner;

public class PRAK_PBO_222362_Moch_Achmar_J_Praktek_05 {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama: ");
        nama = scan.nextLine();

        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        if(nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }
    }
}
