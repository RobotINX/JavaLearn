/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int sorted = 0;
        
        while(sorted < nums.length){
            int max = 0;
            for(int i = 0; i < nums.length - sorted; i++){
                max = nums[max] < nums[i] ? i : max;
            }
            int tmp = nums[max];
            nums[max] = nums[nums.length - sorted - 1];
            nums[nums.length - sorted - 1] = tmp;
            sorted++;
    
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

