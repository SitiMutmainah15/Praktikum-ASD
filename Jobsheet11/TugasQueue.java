public class TugasQueue {
    TugasNode head, tail;
    int size = 0;

    boolean isEmpty() {
        return (head == null);
    }

    boolean isFull() {
        return !isEmpty();
    }

    public void print() {
        if (!isEmpty()) {
            TugasNode tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void kosongkanAntrian() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }
        System.out.println("daftar mahasiswa dalam antrian: ");
        TugasNode tmp = head;

        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        System.out.println("-------------------------------");
    }

    public void TambahAntrian(TugasMahasiswa input) {
        TugasNode ndInput = new TugasNode(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println("Data masuk dalam antrian");
    }

    public TugasMahasiswa panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return null;
        }
        TugasMahasiswa pglmhs = head.data;
        head = head.next;
        size--;
        if (head == null)
            tail = null;
        System.out.println("Antrian berikut adalah:");
        pglmhs.tampilInformasi();
        return pglmhs;
    }

    public TugasMahasiswa AntrianDepan() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return null;
        }
        System.out.println("Antrian terdepan adalah : ");
        head.data.tampilInformasi();
        return head.data;
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public TugasMahasiswa AntrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return null;
        }
        System.out.println("Antrin terakhir adalah : ");
        tail.data.tampilInformasi();
        return tail.data;
    }

}
