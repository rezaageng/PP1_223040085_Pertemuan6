public class ListStructure {
    // variabel head bertipe Node untuk menampung elemen pertama
    private Node head;

    // Method untuk menambahkan elemen di akhir list
    void addTail(double data) {
        Node curNode;
        Node posNode = null;
        Node newNode = new Node(data);

        // jika elemen pertama belum ada maka elemen baru menjadi elemen pertama, jika tidak maka elemen baru ditambahkan di akhir list
        if (head == null) {
            head = newNode;
        } else {
            // iterasi untuk mencari elemen terakhir
            curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }

    }

    // Method untuk menambahkan elemen di awal list
    void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Method untuk menambahkan elemen di posisi tertentu
    void addMid(double data, int position) {
        Node curNode = null;
        Node posNode = null;
        int i;

        Node newNode = new Node(data);

        // jika elemen pertama belum ada maka elemen baru menjadi elemen pertama, jika tidak maka elemen baru ditambahkan di posisi tertentu
        if (head == null) {
            head = newNode;
        } else {
            curNode = head;

            // jika posisi yang dimasukkan adalah 1 maka elemen baru menjadi elemen pertama
            if (position == 1) {
                newNode.setNext(curNode);
                head = newNode;
            } else {

                // iterasi untuk mencari posisi yang dimasukkan
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    // Method untuk menghapus elemen pertama
    void removeHead() {
        // jika list tidak kosong maka elemen pertama dihapus
        if (head != null) {
            head = head.getNext();
        } else {
            System.out.println("List is empty");
        }
    }

    // Method untuk menghapus elemen terakhir
    void removeTail() {
        Node preNode = null;
        Node lastNode;

        // jika head tidak kosong maka elemen terakhir dihapus
        if (head != null) {
            // jika elemen pertama adalah elemen terakhir maka elemen pertama dihapus
            if (head.getNext() == null) {
                head = null;
            } else {
                // iterasi untuk mencari elemen terakhir
                lastNode = head;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                // elemen terakhir dihapus
                preNode.setNext(null);
                lastNode.setNext(null);
                lastNode = null;
            }
        }
    }


    // Method untuk menghapus elemen di posisi tertentu
    void removeMid(double element) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean found;

        // jika head tidak kosong maka elemen di posisi tertentu dihapus
        if (head != null) {
            found = false;
            i = 1;
            tempNode = head;

            // iterasi untuk mencari elemen yang akan dihapus
            while (tempNode.getNext() != null && !found) {
                // jika elemen ditemukan variabel found menjadi true
                if (tempNode.getData() == element) {
                    found = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            // jika elemen ditemukan maka elemen dihapus
            if (found) {
                if (i == 1) {
                    head = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    tempNode.setNext(null);
                    tempNode = null;
                }
            }
        } else {
            System.out.println("List is empty");
        }
    }

    // Method untuk mencari elemen tertentu
    boolean find(double number) {
        Node curNode = head;

        // iterasi untuk mencari elemen tertentu
        while (curNode != null) {
            // jika elemen ditemukan maka method mengembalikan nilai true
            if (curNode.getData() == number) {
                return true;
            }
            curNode = curNode.getNext();
        }

        return false;
    }

    // Method untuk menghitung jumlah elemen
    int size() {
        Node curNode = head;
        int size = 0;

        // iterasi untuk menghitung jumlah elemen
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }

        return size;
    }

    void removeAll() {
        head = null;
    }

    // Method untuk menampilkan elemen-elemen list
    void displayElements() {
        // iterasi untuk menampilkan elemen-elemen list
        Node curNode = head;

        if (curNode == null) {
            System.out.println("List is empty");
        }

        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

}
