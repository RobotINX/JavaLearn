/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1)    return nums.length;
        int slow = 0;
        int fast = 1;
        while(fast < nums.length){
            if(nums[slow] == nums[fast]){
                fast++;
            }else{
                nums[++slow] = nums[fast++];
            }
        }
        return slow + 1;
    }
}
// @lc code=end

