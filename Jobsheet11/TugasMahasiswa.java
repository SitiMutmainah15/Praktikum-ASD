public class TugasMahasiswa {
    String nim;
    String nama;
    String layanan;

    public TugasMahasiswa(String name, String nim, String layanan){
        this.nim = nim;
        this.nama = name;
        this.layanan = layanan;
    }

    public void tampilInformasi() {
        System.out.println(nama + " - " + nim + " - " + layanan);
    }
}
