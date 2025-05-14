public class DosenMain21 {
    public static void main(String[] args){
        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "MAF";
        dsn1.nama = "Muhammad Ali Farhan";
        dsn1.statusAktif = true ;
        dsn1.tahunBergabung = 2018;
        dsn1.bidangKeahlian = "Daspro";
    
        dsn1.tampilInformasi();
        dsn1.ubahKeahlian("Sisop");
        dsn1.setStatusAktif(false);
        dsn1.tampilInformasi();
    
        Dosen21 dsn2 = new Dosen21 ("ANS", "Annisa nabila", true, 2015, "CTPS");
        dsn2.tampilInformasi();
        dsn2.ubahKeahlian("BING");
        dsn2.setStatusAktif(false);
        dsn2.tampilInformasi();
    
    
        Dosen21 dsn3 = new Dosen21("CAM", "Cakra Aminudin", true, 2010, "Agama");
        dsn3.tampilInformasi();
        dsn3.setStatusAktif(true);
        dsn3.ubahKeahlian("Alajabar Linier");
        dsn3.tampilInformasi();
        }
}
