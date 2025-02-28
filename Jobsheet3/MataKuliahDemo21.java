import java.util.Scanner;
public class MataKuliahDemo21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MataKuliah21[] arrayOfMataKuliah21 = new MataKuliah21[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMataKuliah21[i] = new MataKuliah21(kode, nama, sks, jumlahJam);
        }   
        for (int i=0; i < 3; i++){
            System.out.println("DATA MATAKULIAH KE-" + (i+1));
            System.out.println("Kode        : "+ arrayOfMataKuliah21[i].kode);
            System.out.println("Nama        : "+ arrayOfMataKuliah21[i].nama);
            System.out.println("SKS         : "+ arrayOfMataKuliah21[i].sks);
            System.out.println("Jumlah Jam  : "+ arrayOfMataKuliah21[i].jumlahJam);
            System.out.println("-------------------");
        }
     }
}
