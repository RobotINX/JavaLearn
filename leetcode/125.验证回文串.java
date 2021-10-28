/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        //a-z:97-122
        //A-Z:65-90
        String s1 = "";
        String s2 = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c <= 122 && c >= 97) || (c <= 57 && c >= 48)){
                s1 = s1 + c;
                s2 = c + s2;
            }else if(c >= 65 && c <= 90){
                c += 32;
                s1 = s1 + c;
                s2 = c + s2;
            }else{
                continue;
            }
            
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}
// @lc code=end

