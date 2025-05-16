import java.util.Scanner;
public class SuratDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat21 stack = new StackSurat21(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari surat berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = input.next().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt();
                    input.nextLine(); 

                    Surat21 suratBaru = new Surat21(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.pushSurat21(suratBaru);
                    break;

                case 2:
                    Surat21 suratProses = stack.popSurat21();
                    if (suratProses != null) {
                        System.out.println("Memproses surat milik: " + suratProses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat21 suratTop = stack.peekSurat21();
                    if (suratTop != null) {
                        System.out.println("Surat Terakhir dari: " + suratTop.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = input.nextLine();
                    boolean ditemukan = stack.cariSurat21(cariNama);
                    if (ditemukan) {
                        System.out.println("Surat ditemukan untuk " + cariNama);
                    } else {
                        System.out.println("Surat tidak ditemukan untuk " + cariNama);
                    }
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}