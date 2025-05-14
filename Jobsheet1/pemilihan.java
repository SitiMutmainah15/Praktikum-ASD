import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, ket;
        //input
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextDouble();

        //output
        System.out.println("=============================");
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
        System.out.println("nilai tidak valid");
        System.out.println("=============================");
        return;
    }
    //hitung nilai akhir
        nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
    //nilai huruf
        if (nilaiAkhir > 80) nilaiHuruf = "A";
        else if (nilaiAkhir > 73) nilaiHuruf = "B+";
        else if (nilaiAkhir > 65) nilaiHuruf = "B";
        else if (nilaiAkhir > 60) nilaiHuruf = "C+";
        else if (nilaiAkhir > 50) nilaiHuruf = "C";
        else if (nilaiAkhir > 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";
    //keterangan
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            ket = "TIDAK LULUS";
        } else {
            ket = "SELAMAT ANDA LULUS";
        }
        System.out.println("Nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("=============================");
        System.out.println(ket);
    }
}
