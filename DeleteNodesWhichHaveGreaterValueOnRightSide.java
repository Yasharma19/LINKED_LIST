
class Solution {
    public ListNode ReverseLL(ListNode head){
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

    public ListNode removeNodes(ListNode head) {
        //Reverse LL to solve by taking a Max and comparing it with each node one by one if it
        //is greater than max than remove it and finally reverse the LL at the end and return the head.

        head=ReverseLL(head);
        int maxx=head.val;
        ListNode curr=head;
        ListNode prev=head;  //To store the value of prev pointer
        head=head.next;
        while(head!=null){
            if(maxx<=head.val){
                //Include this node;
                maxx=head.val;
                prev=head;
                head=head.next;
            }
            else{
                //Skip this node
                prev.next=head.next;
                head=head.next;
            }
        }
        head=ReverseLL(curr);   //Final head after reversing the LL
        return head;
    }
}
