package labuladong;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode(int[] nums){
        
    }




    public void listNodePrint(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}