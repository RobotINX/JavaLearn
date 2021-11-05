package leetcode;

import labuladong.ListNode;


/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n < 1)   return head;
        ListNode pre = new ListNode(-1);
        ListNode list = pre;
        pre.next = head;
        ListNode successor = pre.next;
        int count = 0;
        while(successor != null){
            if(count == n){
                successor = successor.next;
                pre = pre.next;
            }else{
                successor = successor.next;
                count++;
            }
        }
        pre.next = pre.next.next;
        return list.next;
    }
}
// @lc code=end

