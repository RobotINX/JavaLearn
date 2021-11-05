/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            if(nums[middle] == target){
                index[0] = middle;
                right = middle - 1;
            }else if(nums[middle] > target){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            if(nums[middle] == target){
                index[1] = middle;
                left = middle + 1;
            }else if(nums[middle] > target){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return index;
    }
}
// @lc code=end

