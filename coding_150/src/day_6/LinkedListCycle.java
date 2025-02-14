package day_6;

import common.ListNode;

public class LinkedListCycle {
	
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(slow != fast && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }

}
