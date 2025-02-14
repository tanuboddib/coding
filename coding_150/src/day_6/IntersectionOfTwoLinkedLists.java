package day_6;

import common.ListNode;

public class IntersectionOfTwoLinkedLists {
	
	public int getLength(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int diff = Math.abs(len1-len2);
        if(len1 > len2){
            while(diff > 0){
                headA = headA.next;
                diff--;
            }
        }
        else if(len2 > len1){
            while(diff > 0){
                headB = headB.next;
                diff--;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

}
