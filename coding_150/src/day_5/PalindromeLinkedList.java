package day_5;

import common.ListNode;

public class PalindromeLinkedList {
	
	public ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode mid = midNode(head); 
        ListNode secHead = mid.next;
        
        mid.next = null;
        secHead = reverse(secHead);

        while(head != null && secHead != null){
            if(head.val != secHead.val){
                return false;
            }
            head= head.next;
            secHead= secHead.next;
        }
        return true;
    }

}
