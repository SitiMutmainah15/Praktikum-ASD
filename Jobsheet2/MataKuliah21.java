public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println ("Nama Mata Kuliah: " + nama);
        System.out.println ("Kode Mata Kuliah: " + kodeMK);
        System.out.println ("SKS Mata Kuliah: " + sks);
        System.out.println ("Jumlah jam Mata Kuliah: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan jumlah jam kurang.");
        } else if (jam > 0) { 
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangkan");
        } else {
            System.out.println("Jumlah jam yang dikurangi harus lebih dari 0.");
        }
    } public MataKuliah21 () {
    }

        public MataKuliah21 (String nama, String kodeMK, int sks, int jumlahJam) {
            this.nama = nama;
            this.kodeMK = kodeMK;
            this.sks = sks;
            this.jumlahJam= jumlahJam;
        }
    
}
