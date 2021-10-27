/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        /*
        int index = 0;
        int correct = 1;
        while(index + correct < nums.length){
            if(nums[index] == nums[index + correct]){
                correct++;
                newLength--;
            }
            else{
                nums[index + 1] = nums[index + correct];
                index++;
            }
        }
        return newLength;
        */
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
// @lc code=end

