public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Mahasiswa21[] arrayOfMahasiswa = new Mahasiswa21[3];
        arrayOfMahasiswa[0] = new Mahasiswa21();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk= (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa21();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk= (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa21();
        arrayOfMahasiswa[2].nim = "244107060033";
        arrayOfMahasiswa[2].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[2].kelas = "SIB-1E";
        arrayOfMahasiswa[2].ipk= (float) 3.75;

        System.out.println("NIM      : "+ arrayOfMahasiswa[0].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa[0].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa[0].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa[0].ipk);
        System.out.println("--------------------------------");

        System.out.println("NIM      : "+ arrayOfMahasiswa[1].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa[1].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa[1].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa[1].ipk);
        System.out.println("--------------------------------");

        System.out.println("NIM      : "+ arrayOfMahasiswa[2].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa[2].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa[2].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa[2].ipk);
        System.out.println("--------------------------------");
    }
}