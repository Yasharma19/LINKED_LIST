class Solution{
    Node divide(int N, Node head){
        Node Even=null;
        Node Odd=null;
        Node o=null;
        Node e=null;
        
        while(head!=null){
            if(head.data%2==0){
                if(Even==null){   //For first time
                    Even=head;
                    e=head;
                }
                else{
                    //EVEN
                    e.next=head;
                    e=e.next;
                }
            }
            else{
                if(Odd==null){   //For first time
                    Odd=head;
                    o=head;
                }
                else{
                    //ODD
                    o.next=head;
                    o=o.next;
                }
            }
            head=head.next;
        }
        if(e!=null){
                e.next=Odd;   //join end of Even to start of ODD
        }
        if(o!=null){
            o.next=null;    //End of LL i.e. end of ODD 
        }
        if(Even!=null){
            return Even;
        }
        return Odd;
    }
}
