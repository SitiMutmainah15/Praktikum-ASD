import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[n], hariKuliah = new String[n];
        int[] sks = new int[n], semester = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata kuliah ke-" + (i + 1));
            System.out.print("Nama: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Tampilkan berdasarkan hari");
            System.out.println("3. Tampilkan berdasarkan semester");
            System.out.println("4. Cari berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                tampilkanSemuaJadwal(namaMK, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari: ");
                tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah, sc.nextLine());
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah, sc.nextInt());
                sc.nextLine();
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                tampilkanJadwalBerdasarkanNama(namaMK, sks, semester, hariKuliah, sc.nextLine());
            } else if (pilihan == 5) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tampilkanSemuaJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String cariHari) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(cariHari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Jadwal untuk hari " + cariHari + " tidak ditemukan.");
        }
    }

    static void tampilkanJadwalBerdasarkanSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int cariSemester) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Jadwal untuk semester " + cariSemester + " tidak ditemukan.");
        }
    }

    static void tampilkanJadwalBerdasarkanNama(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String cariNama) {
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(cariNama)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama " + cariNama + " tidak ditemukan.");
        }
    }
}
