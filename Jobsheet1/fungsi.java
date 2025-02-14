import java.util.Scanner;

public class fungsi {

    static int[][] stock = {
        {10, 5, 15, 7},   // 1
        {6, 11, 9, 12},   // 2
        {2, 10, 10, 5},   // 3
        {5, 7, 12, 9}     // 4
    };

    static int[] harga = {75000, 50000, 60000, 10000}; // A,K,A,M

    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        tampilkanPendapatan();
        kurangiStokBungaMati();
        tampilkanStok();
    }

    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = hitungPendapatanCabang(i);
            System.out.println(cabang[i] + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }

    public static int hitungPendapatanCabang(int indexCabang) {
        int total = 0;
        for (int j = 0; j < stock[indexCabang].length; j++) {
            total += stock[indexCabang][j] * harga[j];
        }
        return total;
    }

    public static void kurangiStokBungaMati() {
        int[] bungaMati = {-1, -2, 0, -5}; // A,K,A,M
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] += bungaMati[j]; 
            }
        }
    }

    public static void tampilkanStok() {
        System.out.println("Stok bunga setelah penyesuaian bunga mati:");
        System.out.println("Cabang       Aglonema   Keladi   Alocasia   Mawar");
        for (int i = 0; i < stock.length; i++) {   
            System.out.println(cabang[i] + "   " + stock[i][0] + "        " + stock[i][1] + "        " + stock[i][2] + "        " + stock[i][3]);
        }
    }
}
