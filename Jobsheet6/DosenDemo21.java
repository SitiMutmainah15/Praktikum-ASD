import java.util.Scanner;
public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen21 data = new DataDosen21();

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.print("Pilih menu: ");
            
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = input.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia = input.nextInt();
                    input.nextLine(); 
                    data.tambah(new Dosen21(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    break;
                case 4:
                    data.sortingDSC();
                    break;
            }
        }
    }
}