import labuladong.ListNode;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)   return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        // ListNode tmp = head;
        // while(tmp != null){
        //     System.out.print(tmp.val + " ");
        //     tmp = tmp.next;
        // }
        // System.out.println();
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
// @lc code=end

