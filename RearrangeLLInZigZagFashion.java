class HelloWorld {
    public static ListNode ZigZag(ListNode head){
        //in the form of a<b>c<d>e
        if(heafd==null || head.next==null){
            return head;
        }
        
        ListNode temp=head;
        boolean flag=true;
        while(temp.next!=null){  //till 2nd last node
            if(flag){
                if(temp.data>temp.next.data){
                    int t=temp.data;
                    temp.data=temp.next.data;
                    temp.next.data=t;
                }
                flag=!flag;
            }
            else{
                if(temp.data<temp.next.data){
                    int t=temp.data;
                    temp.data=temp.next.data;
                    temp.next.data=t;
                }
                flag=!flag;
            }
            temp=temp.next;
        }
        return head;
    }
}
