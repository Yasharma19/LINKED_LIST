/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //take slow and fast pointer.
        //slow move by 1 step and fast move by 2 step
        //they will at sometime if cycle is present there.
        //and if Fast pointer reaches null then it has no cycle.
        //they will meet if there is a cycle in the linked list.

        if(head==null || head.next==null){
            return false;
        }

        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;  //1step
            fast=fast.next.next; //2step
            if(fast==slow)
                return true;
        }
        return false;

    }
}
