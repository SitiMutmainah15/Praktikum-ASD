import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[] kota = {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", 
                         "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"};

        System.out.print("Masukkan kode plat: ");
        String userInput = input.next();

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (userInput.equalsIgnoreCase(kode[i])) { 
                System.out.println("Kode " + kode[i] + " adalah plat kota: " + kota[i]);
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
