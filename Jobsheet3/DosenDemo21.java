import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        Dosen21[] dosen = new Dosen21[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode            : ");
            String kode = sc.next();
            sc.nextLine(); 
            System.out.print("Nama            : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (1=Pria, 0=Wanita): ");
            boolean jenisKelamin = sc.nextInt() == 1;
            System.out.print("Usia            : ");
            int usia = sc.nextInt();
            System.out.println("-----------------------------");

            dosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        System.out.println("===========Data Dosen===========");
        for (Dosen21 d : dosen) {
            d.tampilkanData();
        }
    }
}
