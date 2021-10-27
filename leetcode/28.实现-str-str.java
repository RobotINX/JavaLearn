/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0){
            return -1;
        }
        int index = 0;
        int common = 0;
            while(index + common < haystack.length()){
                if(needle.charAt(common) == haystack.charAt(index + common)){
                    
                    if(common == needle.length() - 1){
                        return index;
                    }
                    common++;
                }
                else{
                    common = 0;
                    index ++;
                }
            }
        return -1;
    }
}
// @lc code=end

