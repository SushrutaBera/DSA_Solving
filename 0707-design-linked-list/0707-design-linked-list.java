class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public int getLen() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }
    
    public int get(int index) {
        if (index < 0) return -1;

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                return temp.val;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        int len = getLen();
        if (index < 0 || index > len) { 
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        int len = getLen();
        if (index < 0 || index >= len) { 
            return;
        }
        if (index == 0) { 
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */