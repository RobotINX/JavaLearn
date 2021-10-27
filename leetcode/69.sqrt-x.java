/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    



    /* 
    public int mySqrt(int x) {
        int left = 0;
        int right = x  > 46340 ? 46340 : x;
        int result = -1;
        int middle = 0;
        while(left <= right){
            middle = (left + right) / 2;
            int tmp = middle * middle;
            if(tmp <= x){
                result = middle;
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        return result;
    }
 */
}

/*
class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
*/
// @lc code=end

