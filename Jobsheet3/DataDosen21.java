import java.util.Scanner;

public class DataDosen21 {

    public static void dataSemuaDosen(Dosen21[] dosen) {
        System.out.println("Data Semua Dosen:");
        for (Dosen21 d : dosen) {
            d.tampilkanData();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen21[] dosen) {
        int pria = 0, wanita = 0;
        for (Dosen21 d : dosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen21[] dosen) {
        int totalPria = 0, totalWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen21 d : dosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }
        System.out.println("Rata-rata Usia Dosen Pria: " + (jumlahPria > 0 ? (totalPria / jumlahPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (jumlahWanita > 0 ? (totalWanita / jumlahWanita) : 0));
    }

    public static void infoDosenPalingTua(Dosen21[] dosen) {
        Dosen21 tertua = dosen[0];
        for (Dosen21 d : dosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanData();
    }

    public static void infoDosenPalingMuda(Dosen21[] dosen) {
        Dosen21 termuda = dosen[0];
        for (Dosen21 d : dosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanData();
    }
}