import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] MK = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar",
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemograman", 
            "Kesehatan & Keselamatan Kerja"
        };

        double[] nilaiAngka = new double[MK.length]; 
        String[] nilaiHuruf = new String[MK.length]; 
        double[] bobotNilai = new double[MK.length]; 

        double totalBobotNilai = 0;

        System.out.println("========================================");
        System.out.println("       PROGRAM MENGHITUNG IP SEMESTER   ");
        System.out.println("========================================\n");

        for (int i = 0; i < MK.length; i++) {
            double nilai;

            while (true) {
                System.out.print("Masukkan nilai angka untuk " + MK[i] + " : ");
                nilai = sc.nextDouble();

                if (nilai >= 0 && nilai <= 100) {
                    break;
                } else {
                    System.out.println("Input tidak valid.");
                }
            }

            nilaiAngka[i] = nilai;

            
            if (nilai > 80) {
                nilaiHuruf[i] = "A";  bobotNilai[i] = 4.00;
            } else if (nilai > 73) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.50;
            } else if (nilai > 65) {
                nilaiHuruf[i] = "B";  bobotNilai[i] = 3.00;
            } else if (nilai > 60) {
                nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.50;
            } else if (nilai > 50) {
                nilaiHuruf[i] = "C";  bobotNilai[i] = 2.00;
            } else if (nilai > 39) {
                nilaiHuruf[i] = "D";  bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";  bobotNilai[i] = 0.00;
            }

            totalBobotNilai += bobotNilai[i];
        }

        System.out.println("\n===============================================");
        System.out.println("MK  Nilai  Huruf Bobot Nilai");
        
        for (int i = 0; i < MK.length; i++) {
            System.out.println(MK[i] + "  " + nilaiAngka[i] + "  " + nilaiHuruf[i] + " " + bobotNilai[i]);
        }
        

        System.out.println("\n===============================================");
        double ipSemester = totalBobotNilai / MK.length;
        System.out.println("IP : " + ipSemester);
        System.out.println("===============================================");

    }
}