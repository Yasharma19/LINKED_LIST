class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs=new HashSet<>();  //To remove duplicates
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            int currdata=curr.data;
            if(hs.contains(currdata)){
                prev.next=curr.next;   //Skipping that node
            }
            else{
                hs.add(currdata);
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}
