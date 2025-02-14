import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine(); 

        String[] mataKuliah = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];

        double totalBobotNilai = 0;
        int totalSKS = 0;

        System.out.println("\n============================================");
        System.out.println("        INPUT DATA MATA KULIAH        ");
        System.out.println("============================================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = sc.nextLine();

            System.out.print("Masukkan jumlah SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Masukkan nilai huruf (A, B+, B, C+, C, D, E): ");
            nilaiHuruf[i] = sc.nextLine().toUpperCase(); 

            switch (nilaiHuruf[i]) {
                case "A":  bobotNilai[i] = 4.00; break;
                case "B+": bobotNilai[i] = 3.50; break;
                case "B":  bobotNilai[i] = 3.00; break;
                case "C+": bobotNilai[i] = 2.50; break;
                case "C":  bobotNilai[i] = 2.00; break;
                case "D":  bobotNilai[i] = 1.00; break;
                case "E":  bobotNilai[i] = 0.00; break;
                default:
                    System.out.println("Nilai tidak valid, dianggap E.");
                    bobotNilai[i] = 0.00;
            }

            totalBobotNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];

            System.out.println("--------------------------------------------");
        }

        double ipSemester = totalBobotNilai / totalSKS;

        System.out.println("\n============================================");
        System.out.println("                HASIL PERHITUNGAN           ");
        System.out.println("============================================");
        System.out.println("Mata Kuliah               | SKS | Nilai | Bobot");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(mataKuliah[i] + " | " + sks[i] + " | " + nilaiHuruf[i] + " | " + bobotNilai[i]);
        }

        System.out.println("============================================");
        System.out.println("IP : " + ipSemester);
        System.out.println("============================================");

    }
}
