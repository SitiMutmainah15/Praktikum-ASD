import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        int n, i;
        //input
        System.out.print("Masukkan NIM :");
        nim = input.nextLong(); 
        System.out.println("=============================");

        //2 digit terakhir
        n = (int) (nim % 100);
        //bila n<10 maka tambah 10
        if (n < 10) {
            n += 10;
        }
        //tampil n
        System.out.println("n : " + n);
        System.out.println();
        //tampil angka kecuali angka 6,10,ganjil cetak "*"
        for (i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) { 
                System.out.print("* ");
            } else { 
                System.out.print(i + " ");
            }
        }
    }
}
