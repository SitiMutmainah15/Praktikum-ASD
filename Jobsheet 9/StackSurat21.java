public class StackSurat21 {
    int size;
    int top;
    Surat21[] stack;

    public StackSurat21(int size) {
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }

    public void pushSurat21(Surat21 surat) {
        if (top == size - 1) {
            System.out.println("Stack penuh!");
        } else {
            stack[++top] = surat;
        }
    }

    public Surat21 popSurat21() {
        if (top == -1) {
            System.out.println("Stack kosong!");
            return null;
        } else {
            return stack[top--];
        }
    }

    public Surat21 peekSurat21() {
        if (top == -1) {
            System.out.println("Stack kosong!");
            return null;
        } else {
            return stack[top];
        }
    }

    public boolean cariSurat21(String nama) {
    for (int i = 0; i <= top; i++) {
        if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            return true;
        }
    }
    return false;
}
}
