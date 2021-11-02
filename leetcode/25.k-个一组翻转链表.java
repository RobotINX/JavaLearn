/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return head;
    }
    ListNode successor = null;
    public ListNode reverseN(ListNode head, int n) {
        if(n == 1){
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == 1){
            return reverseN(head, n);
        }
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }
    /** 反转区间 [a, b) 的元素，注意是左闭右开 */
    ListNode reverse(ListNode a, ListNode b) {
        ListNode pre, cur, nxt;
        pre = null; cur = a; nxt = a;
        // while 终止的条件改一下就行了
        while (cur != b) {
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        // 返回反转后的头结点
        return pre;
    }
    // ListNode reverseKGroup(ListNode head, int k) {
    //     if (head == null) return null;
    //     // 区间 [a, b) 包含 k 个待反转元素
    //     ListNode a, b;
    //     a = b = head;
    //     for (int i = 0; i < k; i++) {
    //         // 不足 k 个，不需要反转，base case
    //         if (b == null) return head;
    //         b = b.next;
    //     }
    //     // 反转前 k 个元素
    //     ListNode newHead = reverse(a, b);
    //     // 递归反转后续链表并连接起来
    //     a.next = reverseKGroup(b, k);
    //     return newHead;
    // }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode pre = head;
        ListNode node = head.next;
        for(int i = 1; i < k; i++){
            if(node == null)    return head;
            pre = node;
            node = node.next;
        }
        pre.next = reverseKGroup(node, k);
        ListNode last = reverseN(head, k);
        return last;


    }
}
// @lc code=end

