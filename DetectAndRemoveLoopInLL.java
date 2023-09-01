class HelloWorld {
    
    public static int DetectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;  //1step
            fast=fast.next.next; //2step
            if(fast==slow)
                RemoveLoop(slow,head);  //Meeting point,we can return slow or fast both
                return 1
        }
        return 0;    
    }

  //Giving Node where loop is starting
    public static ListNode StartingNode(ListNode slow,ListNode head){
        ListNode temp=head;
        while(slow!=temp){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }

    //Removing the loop in the cycle
    public static void RemoveLoop(ListNode small,ListNode head){
        ListNode slow=slow;
        ListNode StartingNode=StartingNode;
        while(slow.next!=startingNode){
            slow=slow.next;
        }
        slow.next=null;
    }
}
