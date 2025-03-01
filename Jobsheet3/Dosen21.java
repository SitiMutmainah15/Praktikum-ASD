import java.util.Scanner;

public class Dosen21 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;
    
    public Dosen21(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }


    public void tampilkanData() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
        System.out.println("-----------------------------");
    }
}