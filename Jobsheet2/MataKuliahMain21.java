public class MataKuliahMain21 {
    public static void main(String[] args){
        MataKuliah21 matkul1 = new MataKuliah21();
        matkul1.nama = "ALSD";
        matkul1.sks = 3 ;
        matkul1.kodeMK = "001";
        matkul1.jumlahJam = 6;
    
        matkul1.tampilInformasi();
        matkul1.ubahSKS(2);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(10);
        matkul1.tampilInformasi();
    
        MataKuliah21 matkul2 = new MataKuliah21("BING", "002", 2, 4);
        matkul2.tampilInformasi();
            matkul2.ubahSKS(3);
            matkul2.tambahJam(1);
            matkul2.kurangiJam(2);
            matkul2.tampilInformasi();
        
            MataKuliah21 matkul3 = new MataKuliah21("AGAMA", "003", 2, 4);
            matkul3.tampilInformasi();
            matkul3.ubahSKS(3);
            matkul3.tambahJam(1);
            matkul3.kurangiJam(2);
            matkul3.tampilInformasi();
        }
}
