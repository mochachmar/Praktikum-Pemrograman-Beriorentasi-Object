package prak_pbo_222362_moch_achmar_j_praktek;

import java.util.Scanner;

public class PRAK_PBO_222362_Moch_Achmar_J_Praktek_06 {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();

        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);
    }
}
