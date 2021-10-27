/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        /**
         * 有两种情况
         * 1、当数组并不是全部为9的时候，只需要将最后一个不是9数字 + 1，然后使它后面的所有9都变成0即可
         * 2、当数组全部为9的时候，需要创建一个长为digits.length + 1数组，将这个数组的第一位置为1即可
         * 因为是找最后的数字，所以倒序遍历是最方便的
         */
        //last为最后一个不为9的数字的下标
        //首先默认数组的最后一个数字不为9
        int last = digits.length - 1;
        //如果最后一个数字为9，那么
        while(last >= 0 && digits[last] == 9){
            last--;
        }
        if(last >= 0){
            digits[last++] += 1;
            for(; last < digits.length; last++){
                digits[last] = 0;
            }
        }
        else if(last == -1){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
// @lc code=end

