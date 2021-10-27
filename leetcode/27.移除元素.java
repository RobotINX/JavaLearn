/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        if(nums.length == 0){
            return 0;
        }
        else if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
            else{
                return 1;
            }
        }
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[fast] == val){
            }
            else{
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        return slow;
    }
}
// @lc code=end

