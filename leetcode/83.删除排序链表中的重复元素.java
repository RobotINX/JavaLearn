package leetcode;

import labuladong.ListNode;

/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null){
            if(slow.val == fast.val){
                if(fast.next != null)   fast = fast.next;
                else{ slow.next = null; fast = fast.next;}
            }else{
                slow.next = fast;
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;
    }
}
// @lc code=end

