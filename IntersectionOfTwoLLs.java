/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int Length(ListNode head){
        int s=0;
        while(head!=null){
            s++;
            head=head.next;
        }
        return s;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=Length(headA);
        int l2=Length(headB);
        int d=0;
        ListNode ptr1;
        ListNode ptr2;
        if(l1>l2){            //Taking ptr1 as head of larger LL and ptr2 as head of Smaller LL
            ptr1=headA;
            d=l1-l2;
            ptr2=headB;
        }
        else{
            ptr1=headB;  
            d=l2=l1;
            ptr2=headA;
        }
        
        while(d>0){                //To reach at the same distance form the intersection point
            ptr1=ptr1.next;
            if(ptr1==null){
                return null;
            }
            d--;
        }
      
        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                return ptr2;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return null;

    }
}
