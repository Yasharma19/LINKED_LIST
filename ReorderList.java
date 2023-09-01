class Solution {
  
    //to reverse second LL
    public ListNode Reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    //Slow-1 step, Fast-2 Steps
    public void reorderList(ListNode head) {
        ListNode slow=head;     //Slow become middle and point of Division of LLs
        ListNode fast=head.next;

        //To get the middle
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //slow is the node from which we divide 2 LL
        //head of 2nd LL is slow.next
        //we have to reverse 2nd LL

        ListNode second=Reverse(slow.next);
        slow.next=null;            //to divide the connection from 2nd LL
        ListNode first=head;

        //Merging Two linkedlists
        //Because second LL will be always smaller or equal to first LL
        while(second!=null){
            ListNode temp1=first.next;   // to store the next pointer of a node
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;        //iterating over the LL
            second=temp2;
        }
    }
}
