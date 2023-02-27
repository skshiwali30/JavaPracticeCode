class MyLinkedList {

    private LinkedList head;
    private int length;
    class LinkedList {
        int val;
        LinkedList next;
        public LinkedList(int val) {
            this.val = val;
        }
    }
    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) {
        if(index >= length)
            return -1;
        LinkedList ptr = head;
        for(int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return ptr.val;
    }
    
    public void addAtHead(int val) {
        LinkedList ptr = new LinkedList(val);
        length++;
        if(head != null)
            ptr.next = head;
        head = ptr;
    }
    
    public void addAtTail(int val) {
        LinkedList ptr = new LinkedList(val);
        length++;
        if(head == null)
            head = ptr;
        else {
            LinkedList ptr1 = head;
            while(ptr1.next != null) {
                ptr1 = ptr1.next;
            }
            ptr1.next = ptr;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > length)
            return;
        if(index == 0)
            addAtHead(val);
        else {
            LinkedList ptr = new LinkedList(val);
            length++;
            LinkedList ptr1 = head;
            for(int i = 0; i < index - 1; i++) {
                ptr1 = ptr1.next;
            }
            ptr.next = ptr1.next;
            ptr1.next = ptr;
        }
    }
    
    public void deleteAtIndex(int index) {
        LinkedList ptr = head;
        if(index >= length)
            return;
        if(index == 0)
            head = ptr.next;
        else {
            LinkedList prev = null;
            for(int i = 0; i < index; i++) {
                prev = ptr;
                ptr = ptr.next;
            }
            prev.next = ptr.next;
        }
        length--;
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