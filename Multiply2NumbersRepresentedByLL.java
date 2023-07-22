static int MultiplyLL(Node first,Node second){
    int n1=0;
    int n2=0;
    
    while(first!=null){
        n1=n1*10+first.val;
        first=first.next;
    }
    while(second!=null){
        n2=n2*10+second.val;
        second=second.next;
    }
    return n1*n2;
}
