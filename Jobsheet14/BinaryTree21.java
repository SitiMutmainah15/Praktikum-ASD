public class BinaryTree21 {
    Node21 root;

    public BinaryTree21() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // Method add non-rekursif
    public void add(Mahasiswa21 mahasiswa) {
        Node21 newNode = new Node21(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node21 current = root;
            Node21 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Method add rekursif
    public void addRekursif(Mahasiswa21 data) {
        root = addRekursif(root, data);
    }

    private Node21 addRekursif(Node21 current, Mahasiswa21 data) {
        if (current == null) {
            return new Node21(data);
        }

        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, data);
        }

        return current;
    }

    // Method untuk mencari IPK
    boolean find(double ipk) {
        boolean result = false;
        Node21 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    // Method traversal
    void traversePreOrder(Node21 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node21 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node21 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // Method untuk menghapus node
    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node21 parent = root;
        Node21 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // Kasus 1: Node leaf
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
            // Kasus 2: Node dengan 1 child (kanan)
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }
            // Kasus 3: Node dengan 1 child (kiri)
            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
            // Kasus 4: Node dengan 2 children
            else {
                Node21 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // Method untuk mencari successor
    Node21 getSuccessor(Node21 del) {
        Node21 successor = del.right;
        Node21 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    // Method untuk mencari IPK terkecil
    public Mahasiswa21 cariMinIPK() {
        if (root == null) {
            return null;
        }
        return cariMinIPK(root);
    }

    private Mahasiswa21 cariMinIPK(Node21 node) {
        return node.left == null ? node.mahasiswa : cariMinIPK(node.left);
    }

    // Method untuk mencari IPK terbesar
    public Mahasiswa21 cariMaxIPK() {
        if (root == null) {
            return null;
        }
        return cariMaxIPK(root);
    }

    private Mahasiswa21 cariMaxIPK(Node21 node) {
        return node.right == null ? node.mahasiswa : cariMaxIPK(node.right);
    }

    // Method untuk menampilkan mahasiswa dengan IPK di atas batas tertentu
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node21 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}