package day_5;

import common.ListNode;

public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode();
        ListNode curr = h;
        while(head != null){
            if(head.val != val){
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next = null;
        return h.next;
    }

}
