public class DataDosen21 {
        Dosen21[] dataDosen = new Dosen21[10];
        int idx = 0;

        public static void main(String[] args){}
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
    }
    
