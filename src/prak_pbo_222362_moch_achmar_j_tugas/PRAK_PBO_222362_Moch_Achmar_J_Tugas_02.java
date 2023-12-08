package prak_pbo_222362_moch_achmar_j_tugas;
import java.util.Scanner;

public class PRAK_PBO_222362_Moch_Achmar_J_Tugas_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;

        do {
            System.out.println("Data Nilai Ujian Algoritma dan Pemrograman");
            System.out.println("----------------------------------------------------");
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("NAMA MHS: ");
            String nama = input.nextLine();
            System.out.print("NILAI MID: ");
            double nilaiMid = input.nextDouble();
            System.out.print("NILAI SEMESTER: ");
            double nilaiSemester = input.nextDouble();

            double nilaiAkhir = 0.4 * nilaiMid + 0.6 * nilaiSemester;

            String nilaiHuruf;
            if (nilaiAkhir >= 86) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 81) {
                nilaiHuruf = "A-";
            } else if (nilaiAkhir >= 76) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 71) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 66) {
                nilaiHuruf = "B-";
            } else if (nilaiAkhir >= 61) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 56) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 41) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("----------------------------------------------------");
            System.out.println("NIM: " + nim);
            System.out.println("NAMA MHS: " + nama);
            System.out.println("NILAI MID: " + nilaiMid);
            System.out.println("NILAI SEMESTER: " + nilaiSemester);
            System.out.println("NILAI AKHIR: " + nilaiAkhir);
            System.out.println("NILAI HURUF: " + nilaiHuruf);

            String jawaban;
            do {
                System.out.print("Inputkan data mahasiswa lagi? (ya/tidak): ");
                input.nextLine();
                jawaban = input.nextLine().toLowerCase();
                if (!jawaban.equals("ya") && !jawaban.equals("tidak")) {
                    System.out.println("Masukkan perintah yang benar (ya/tidak).");
                }
            } while (!jawaban.equals("ya") && !jawaban.equals("tidak"));

            ulangi = jawaban.equals("ya");
        } while (ulangi);

        input.close();
    }
}
