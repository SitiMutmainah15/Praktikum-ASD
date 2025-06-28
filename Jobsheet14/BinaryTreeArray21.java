public class BinaryTreeArray21 {
    Mahasiswa21[] data;
    int size;
    int idxLast;

    public BinaryTreeArray21() {
        this.data = new Mahasiswa21[10];
        this.size = 0;
        this.idxLast = -1;
    }

    public void add(Mahasiswa21 mahasiswa) {
        if (size == 0) {
            data[0] = mahasiswa;
            size++;
            idxLast = 0;
        } else {
            add(0, mahasiswa);
        }
    }

    private void add(int idx, Mahasiswa21 mahasiswa) {
        if (data[idx] == null) {
            data[idx] = mahasiswa;
            size++;
            if (idx > idxLast) {
                idxLast = idx;
            }
        } else {
            if (mahasiswa.ipk < data[idx].ipk) {
                add(2 * idx + 1, mahasiswa); 
            } else {
                add(2 * idx + 2, mahasiswa); 
            }
        }
    }

    public void traversePreOrder() {
        traversePreOrder(0);
    }

    private void traversePreOrder(int idx) {
        if (idx >= data.length || data[idx] == null) {
            return;
        }
        data[idx].tampilInformasi(); 
        traversePreOrder(2 * idx + 1); 
        traversePreOrder(2 * idx + 2);
    }

    public void traverseInOrder() {
        traverseInOrder(0);
    }

    private void traverseInOrder(int idx) {
        if (idx >= data.length || data[idx] == null) {
            return;
        }
        traverseInOrder(2 * idx + 1); 
        data[idx].tampilInformasi(); 
        traverseInOrder(2 * idx + 2); 
    }

    public void populateData(Mahasiswa21[] dataMhs, int idxLast) {
        this.data = dataMhs;
        this.idxLast = idxLast;
        this.size = idxLast + 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}