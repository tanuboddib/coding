package day_5;

import common.ListNode;

public class MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){
            return slow;
        }
        return slow.next;
    }
	
}
