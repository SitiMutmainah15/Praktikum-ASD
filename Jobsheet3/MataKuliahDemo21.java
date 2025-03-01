import java.util.Scanner;
public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah21[] arrayOfMataKuliah21 = new MataKuliah21[3];
        String kode, nama, dosenPengajar;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("SKS            : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam     : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.print("Dosen Pengajar : ");
            dosenPengajar = sc.nextLine();
            System.out.println("-----------------------------");

            arrayOfMataKuliah21[i] = new MataKuliah21(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah21[i].tambahData(dosenPengajar);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("DATA MATAKULIAH KE-" + (i + 1));
            arrayOfMataKuliah21[i].cetakInfo();
        }
    }
}
