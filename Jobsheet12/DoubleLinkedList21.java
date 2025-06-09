public class DoubleLinkedList21 {
    Node21 head;
    Node21 tail;
    int size;

    public DoubleLinkedList21() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;  // Update size
        System.out.println("Data berhasil ditambahkan di awal.");
    }

    public void addLast(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;  // Update size
    }

    public void add(int index, Mahasiswa21 data) {
        if (index < 0) {
            System.out.println("Index tidak boleh negatif.");
            return;
        }

        Node21 newNode = new Node21(data);

        if (isEmpty()) {
            if (index == 0) {
                head = tail = newNode;
                size++; // Update size
                System.out.println("Data berhasil ditambahkan pada indeks " + index);
            } else {
                System.out.println("Index out of bounds.");
            }
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index > size) {
            System.out.println("Index out of bounds.");
            return;
        }

        if (index == size) {
            addLast(data);
            System.out.println("Data berhasil ditambahkan pada indeks " + index);
            return;
        }

        Node21 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node21 prevNode = current.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = current;
        current.prev = newNode;

        size++;  // Update size
        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void insertAfter(String keyNim, Mahasiswa21 data) {
        Node21 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node21 newNode = new Node21(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        size++; // Update size
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked list kosong. Tidak ada yang dihapus.");
            return;
        }

        Node21 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " untuk dihapus.");
            return;
        }
        Node21 nodeToRemove = current.next;

        current.next = nodeToRemove.next;
        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = current;
        } else {
            tail = current;
        }

        size--; // Update size
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. Data yang dihapus: " + nodeToRemove.data);
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node21 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public Node21 search(String nim) {
        Node21 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Linked list kosong. Tidak bisa dihapus");
        } else {
            Mahasiswa21 dataTerhapus = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--; // Update size
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + dataTerhapus);
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("Linked list kosong. Tidak bisa dihapus");
        } else {
            Mahasiswa21 dataTerhapus = tail.data;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--; // Update size
            System.out.println("Data sudah berhasil dihapus dari belakang. Data yang terhapus adalah: " + dataTerhapus);
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong. Tidak bisa dihapus.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node21 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;  // Update size
        System.out.println("Node pada indeks " + index + " berhasil dihapus. Data yang dihapus: " + current.data);
    }

    public Mahasiswa21 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return null;
        }
        return head.data;
    }

    public Mahasiswa21 getLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa21 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return null;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return null;
        }

        Node21 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }
}
