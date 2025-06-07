public class DoubleLinkedList21 {
    Node21 head;
    Node21 tail;

    public DoubleLinkedList21(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
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
        System.out.println("Data berhasil ditambahkan di awal.");
    }
    
    public void addLast (Mahasiswa21 data){
        Node21 newNode = new Node21(data);
        if (isEmpty()){
            head = tail = newNode;
        } else {
            tail.next= newNode;
            newNode.prev= tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa21 data){
        Node21 current = head;

        while (current != null && !current.data.nim.equals(keyNim)){
            current = current.next;
        }

        if (current == null){
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan. ");
            return;
        }
        
        Node21 newNode = new Node21(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }else {
            newNode.next=current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print(){
        Node21 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
            
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
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (head == tail) {
            System.out.println("Menghapus: " + head.data.nim);
            head = tail = null;
        } else {
            System.out.println("Menghapus: " + head.data.nim);
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else if (head == tail) {
            System.out.println("Menghapus: " + tail.data.nim);
            head = tail = null;
        } else {
            System.out.println("Menghapus: " + tail.data.nim);
            tail = tail.prev;
            tail.next = null;
        }
    }

}
