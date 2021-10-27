/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < m && index2 < n){
            if(nums1[index1] > nums2[index2]){
                nums3[index++] = nums2[index2++];
            }
            else{
                nums3[index++] = nums1[index1++];
            }
        }
        while(index1 < m){
            nums3[index++] = nums1[index1++];
        }
        while(index2 < n){
            nums3[index++] = nums2[index2++];
        }
        for(int i = 0; i < nums3.length; i++){
            nums1[i] = nums3[i];
        }
    }
}
// @lc code=end

