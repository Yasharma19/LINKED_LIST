ListNode Sort(ListNode head){
    int zero=0;
    int one=0;
    int two=0;
    ListNode temp=head;
    while(temp!=null){
        if(temp.val==0)
            zero++;
        if(temp.val==1)
            one++;
        if(temp.val==2)
            two++;    
        temp=temp.next;    
    }
    
    temp=head;  //Because temp reached at the end of the LL in the above loop.
    while(temp!=null){
        if(zero!=0){
            temp.val=0;
            zero--;  
        }
        if(one!=0){
            temp.val=1;
            one--;  
        }
        if(two!=0){
            temp.val=2;
            two--;  
        }
        temp=temp.next;
    }
    retun head;
}
