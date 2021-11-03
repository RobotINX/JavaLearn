package leetcode;

/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            result = s1.length() > result.length() ? s1 : result;
            result = s2.length() > result.length() ? s2 : result;
        }
        return result;
    }
    public String palindrome(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}
// @lc code=end

