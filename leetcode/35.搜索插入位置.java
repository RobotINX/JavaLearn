/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length;
        if(nums[0] > target){
            return 0;
        }
        if(nums[nums.length - 1] < target){
            return nums.length;
        }
        while(head < tail){
            int middle = (head + tail) / 2;
            if(nums[middle] == target){
                return middle;
            }
            else if(target > nums[middle] && target < nums[middle + 1]){
                return middle + 1;
            }
            else if(target < nums[middle] && target > nums[middle - 1]){
                return middle;
            }
            else if(target < nums[middle]){
                tail = middle;
            }
            else if(target > nums[middle]){
                head = middle;
            }
        }
        return -1;
    }
}
// @lc code=end

