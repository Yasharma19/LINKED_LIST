//VERY VERY VERY IMPORTANT FOR INTERVIEW

class Solution {
    public void deleteNode(ListNode node) {
        ListNode next=node.next;
        node.val=next.val;
        node.next=node.next.next;        
    }
}
