
public static Node reverseDLL(Node  head)
{
    // Swap prev and next of each node
    Node curr=head;
    if(curr==null || curr.next==null){
        return head;
    }
    //Reach at the tail of the LL
    while(curr.next!=null){
        curr=curr.next;
    }
    head=curr; //Now tail is the new head of LL
    curr.next=curr.prev;
    curr.prev=null;
    curr=curr.next;
    
    //Traverse till the old head
    while(curr.prev!=null){
        Node temp=curr.next;  //Swapping of prev and next
        curr.next=curr.prev;
        curr.prev=temp;
        curr=curr.next;
    }
    curr.prev=curr.next;    //This happened only at 1st and last node of LL
    curr.next=null;
    return head;
}
