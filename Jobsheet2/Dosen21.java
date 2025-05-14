public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println ("Nama Dosen: " + nama);
        System.out.println ("Id Dosen: " + idDosen);
        System.out.println ("Status Dosen: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println ("Tahun Bergabung Dosen: " + tahunBergabung);
        System.out.println("Masa kerja dosen: " + hitungMasaKerja(2025) + " tahun");
        System.out.println ("Bidang Keahlian Dosen: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
    public Dosen21 () {
    }

        public Dosen21 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
            this.idDosen = idDosen;
            this.nama = nama;
            this.statusAktif = statusAktif;
            this.tahunBergabung = tahunBergabung;
            this.bidangKeahlian = bidangKeahlian;
        }
    
}
