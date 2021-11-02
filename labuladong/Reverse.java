package labuladong;

public class Reverse {

    static ListNode reverseAll(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverseAll(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    static ListNode successor = null;
    static ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    static ListNode reverseBetweent(ListNode head, int m, int n){
        if(m == 1){
            return reverseN(head, n);
        }
        head.next = reverseBetweent(head.next, m - 1, n - 1);
        return head;
    }
}

