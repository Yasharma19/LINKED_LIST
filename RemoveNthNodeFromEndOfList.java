class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if(size==n){
            head=head.next;
            return head;
        }
        size=size-n-1;
        int a=0;
        temp=head;
        while(a!=size){
            temp=temp.next;
            a++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
