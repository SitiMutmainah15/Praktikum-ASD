import java.util.Scanner;
public class MahasiswaDemo21 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pilih;

    StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);

    do {
        System.out.println("\nMenu: ");
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas");
        System.out.println("3. Melihat Tugas Teratas");
        System.out.println("4. Melihat Daftar Tugas");
        System.out.println("5. Lihat tugas terbawah");
        System.out.println("6. Jumlah tugas yang dikumpulkan");
        System.out.print("Pilih: ");
        pilih = scan.nextInt();
        scan.nextLine();
        switch (pilih) {
        case 1:
            System.out.print("Nama: ");
            String nama = scan.nextLine();
            System.out.print("NIM: ");
            String nim = scan.nextLine();
            System.out.print("Kelas: ");
            String kelas = scan.nextLine();
            Mahasiswa21 mhs = new Mahasiswa21(nama, nim, kelas);
            stack.push(mhs);
            System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
            break;
        case 2:
            Mahasiswa21 dinilai = stack.pop();
            if (dinilai != null) {
                System.out.println("Menilai tugas dari " +dinilai.nama);
                System.out.print("Masukkan nilai (0-100): ");
                int nilai = scan.nextInt();
                dinilai.tugasDinilai(nilai);
                 System.out.printf("Tugas %s adalah %d\n", dinilai.nama, nilai);
            }
            break;
        case 3:
            Mahasiswa21 lihat = stack.peek();
            if (lihat != null){
                System.out.println("Tugas Terakhir dikumpulkan oleh "+lihat.nama);
            }
            break;
        case 4:
            System.out.println("Daftar semua tugas");
            System.out.println("Nama\tNIM\tKelas");
            stack.print();
            break;
        case 5:
            Mahasiswa21 TugasTerbawah = stack.TugasTerbawah();
            if (TugasTerbawah != null) {
            System.out.println("Tugas terbawah adalah " + TugasTerbawah.nama);
            }
            break;
        case 6:
        int Jumlah = stack.JumlahTugas();
        System.out.println("Jumlah tugas yang dikumpulkan " + Jumlah);
        break;

        default: 
        System.out.println("Pilihan tidak valid");
        }
    } while (pilih >= 1 && pilih <= 4);
}
}
