/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int index = -1;


        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int middle = (left + right) / 2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] < target){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }
        return index;
    }
}
// @lc code=end