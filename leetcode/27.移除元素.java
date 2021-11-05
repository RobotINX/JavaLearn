/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)    return 0;
        if(nums.length == 1 && nums[0] == val)  return 0;
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[fast] == val){
                fast++;
            }else{
                nums[slow++] = nums[fast++];
            }
        }
        return slow;
    }
}
// @lc code=end

