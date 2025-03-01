import java.util.Scanner;
public class DataDosenDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        Dosen21[] dosenArray = new Dosen21[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = input.next();
            input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (1=Pria, 0=Wanita): ");
            boolean jenisKelamin = input.nextInt() == 1;
            System.out.print("Usia: ");
            int usia = input.nextInt();

            dosenArray[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        DataDosen21.dataSemuaDosen(dosenArray);
        DataDosen21.jumlahDosenPerJenisKelamin(dosenArray);
        DataDosen21.rerataUsiaDosenPerJenisKelamin(dosenArray);
        DataDosen21.infoDosenPalingTua(dosenArray);
        DataDosen21.infoDosenPalingMuda(dosenArray);

    }
}