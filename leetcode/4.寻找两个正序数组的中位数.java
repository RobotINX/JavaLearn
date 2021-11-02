/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0;
        int i1 = 0;
        int i2 = 0;
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] < nums2[i2]){
                nums[index++] = nums1[i1++];
            }else{
                nums[index++] = nums2[i2++];
            }
        }
        while(i1 < nums1.length){
            nums[index++] = nums1[i1++];
        }
        while(i2 < nums2.length){
            nums[index++] = nums2[i2++];
        }
        if(nums.length % 2 == 0){
            double result = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
            return result;
        }else{
            return nums[(nums.length - 1) / 2];
        }
    }
}
// @lc code=end

