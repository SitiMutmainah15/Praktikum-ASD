import java.util.Scanner;

public class TugasMain {

    public class SLIMain25 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pilihan;
            TugasQueue sll = new TugasQueue();

            do {
                System.out.println("\n===== MENU LAYANAN KEMAHASISWAAN ====");
                System.out.println("1. Tambah Antrian Mahasiswa");
                System.out.println("2. Panggil Mahasiswa");
                System.out.println("3. Tampilkan Semua Antrian");
                System.out.println("4. Tampilkan Antrian Terdepan");
                System.out.println("5. Tampilkan Antrian Belakang");
                System.out.println("6. Tampilkan Jumlah Mahasiswa dalam Antrian");
                System.out.println("7. Kosongkan Antrian");
                System.out.println("8. Cek Apakah Antrian Kosong");
                System.out.println("9. Cek Apakah Antrian Penuh");
                System.out.println("10. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println("Isi data mahasiswa ");
                        System.out.print("Nama : ");
                        String nama = sc.nextLine();
                        System.out.print("NIM : ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Layanan : ");
                        String layanan = sc.nextLine();
                        TugasMahasiswa mhsBaru = new TugasMahasiswa(nama, nim, layanan);
                        sll.TambahAntrian(mhsBaru);
                        break;
                    case 2:
                        sll.panggilAntrian();
                        break;
                    case 3:
                        sll.tampilkanSemuaAntrian();
                        break;
                    case 4:
                        sll.AntrianDepan();
                        break;
                    case 5:
                        sll.AntrianTerakhir();
                        break;
                    case 6:
                        sll.jumlahAntrian();
                        break;
                    case 7:
                        sll.kosongkanAntrian();
                        break;
                    case 8:
                        System.out.println(sll.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                        break;
                    case 9:
                        System.out.println(sll.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                        break;
                    case 10:
                        System.out.println("Terima kasih! Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 10);
        }
    }
}
