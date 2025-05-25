import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS21 antrian = new AntrianKRS21(10);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Tampilkan Jumlah Antrian");
            System.out.println("10. Tampilkan Jumlah Mahasiswa Sudah Diproses");
            System.out.println("11. Tampilkan Jumlah Mahasiswa Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (!antrian.IsFull()) {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Jurusan: ");
                        String prodi = sc.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = sc.nextLine();
                        antrian.Enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    } else {
                        System.out.println("Antrian sudah penuh.");
                    }
                    break;
                case 2:
                    antrian.layaniKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println(antrian.IsEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    System.out.println(antrian.IsFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa yang sudah diproses: " + antrian.jumlahDiproses());
                    break;
                case 11:
                    System.out.println("Jumlah mahasiswa yang belum diproses: " + antrian.jumlahBelumDiproses());
                    break;
                case 12:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
