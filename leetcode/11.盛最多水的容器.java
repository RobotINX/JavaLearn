/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left != right){
            int area = min(height[left], height[right]) * (right - left);
            max = max > area ? max : area;
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    public int area(int a, int b){
        return a * b;
    }
    public int max(int a, int b){
        return a > b ? a : b;
    }
    public int min(int a, int b){
        return a < b ? a : b;
    }
}
// @lc code=end

