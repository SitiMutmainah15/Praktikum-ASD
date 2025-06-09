import java.util.Scanner;

import javax.sound.sampled.Line;

public class DLLMain21 {
    public static void main(String[] args) {
        DoubleLinkedList21 list = new DoubleLinkedList21();
        System.out.println("Jumlah data dalam linked list: " + list.size());
        list.print();
        
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa21 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa21 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node21 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNIM = scan.nextLine();
                    System.out.print("Masukkan NIM baru: ");
                    String nimBaru = scan.nextLine();
                    System.out.print("Masukkan nama: ");
                    String namaBaru = scan.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelasBaru = scan.nextLine();
                    System.out.print("Masukkan ipk: ");
                    double ipkBaru = scan.nextDouble();
                    Mahasiswa21 mhsBaru = new Mahasiswa21(nimBaru, namaBaru, kelasBaru, ipkBaru);
                    list.insertAfter(cariNIM, mhsBaru);
                }
                case 0 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa21 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa21(nim, nama, kelas, ipk);
    }
}
