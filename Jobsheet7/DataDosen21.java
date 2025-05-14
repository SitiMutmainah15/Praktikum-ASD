public class DataDosen21 {
    Dosen21[] dataDosen = new Dosen21[10];
    int idx = 0;

    public static void main(String[] args) {}

    void tambah(Dosen21 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen21 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen telah diurutkan secara ASCENDING berdasarkan usia");
        tampil();
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen21 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data dosen telah diurutkan secara DESCENDING berdasarkan usia");
        tampil();
    }

    // a. Pencarian Sequential berdasarkan nama
    void PencarianDataSequential21(String nama) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahDitemukan++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama tersebut!");
        }
    }

    // b. Pencarian Binary berdasarkan usia
    void PencarianDataBinary21(int usia) { 

        int awal = 0, akhir = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;

        while (awal <= akhir) {
            int tengah = (awal + akhir) / 2;
            if (dataDosen[tengah].usia == usia) {
                int kiri = tengah, kanan = tengah;

                while (kiri >= 0 && dataDosen[kiri].usia == usia) {
                    dataDosen[kiri].tampil();
                    jumlahDitemukan++;
                    kiri--;
                }
                while (kanan < idx && dataDosen[kanan].usia == usia) {
                    if (kanan != tengah) {
                        dataDosen[kanan].tampil();
                        jumlahDitemukan++;
                    }
                    kanan++;
                }

                ditemukan = true;
                break;
            } else if (dataDosen[tengah].usia < usia) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia tersebut!");
        }
    }
}
