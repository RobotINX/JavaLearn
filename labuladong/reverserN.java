package labuladong;

public class reverserN{
    ListNode successor = null;
    ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode head = new ListNode(nums);
        head.listNodePrint(head);
        
    }
}