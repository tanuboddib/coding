package day_17;
 
class ListNode {
    public int key;
    public int value;
    public ListNode next;

    public ListNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

public class MyHashMap {
    private int SLOTS_SIZE = 4193;
    private ListNode[] entries;

    public MyHashMap() {
        this.entries = new ListNode[this.SLOTS_SIZE];
    }

    private int getIndex(int key) {
        return key % this.SLOTS_SIZE;
    }

    public void put(int key, int value) {
        int entryIdx = this.getIndex(key);
        if(this.entries[entryIdx] == null) {
            this.entries[entryIdx] = new ListNode(key, value);
            return;
        }
        ListNode curr = this.entries[entryIdx];
        ListNode prev = null;
        while(curr != null) {
            if(curr.key == key) {
                curr.value = value;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = new ListNode(key, value);
        return;
    }
    
    public int get(int key) {
        int entryIdx = this.getIndex(key);
        if(this.entries[entryIdx] == null) {
            return -1;
        }
        ListNode curr = this.entries[entryIdx];
        while(curr != null) {
            if(curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        int entryIdx = this.getIndex(key);
        if(this.entries[entryIdx] == null) {
            return;
        }
        ListNode curr = this.entries[entryIdx];
        if(curr.key == key) {
            this.entries[entryIdx] = curr.next;
            return;
        }
        ListNode prev = null;
        while(curr != null) {
            if(curr.key == key) {
                prev.next = curr.next;
                curr.next = null;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
