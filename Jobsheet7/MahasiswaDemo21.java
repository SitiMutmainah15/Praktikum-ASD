import java.util.Scanner;
public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        

    }
}
