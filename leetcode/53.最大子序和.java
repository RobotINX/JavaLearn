import javax.naming.spi.DirStateFactory.Result;

/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        //贪心算法
        //若当前指针所指元素之前的和小于0，则丢弃当前元素之前的数列
        int maxSum = nums[0];
        int preSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            preSum = preSum < 0 ? nums[i] : preSum + nums[i];
            maxSum = maxSum < preSum ? preSum : maxSum;
        }
        return maxSum;

/* 
        //动态规划
        //若前一个元素大于0，则将其加到当前元素上
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > 0){
                nums[i] = nums[i] + nums[i - 1];

            }
            if(maxSum < nums[i]){
                maxSum = nums[i];
            }
        }
        return maxSum;
         */
    }
}
// @lc code=end

