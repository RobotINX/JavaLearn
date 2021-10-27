import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        if(s.length() % 2 != 0){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
        Queue<Character> small = new LinkedList<Character>();
        Queue<Character> middle = new LinkedList<Character>();
        Queue<Character> large = new LinkedList<Character>();
        
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                small.offer(s.charAt(i));
            }
            else if(s.charAt(i) == '['){
                middle.offer(s.charAt(i));
            }
            else if(s.charAt(i) == '{'){
                large.offer(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                small.poll();
            }
            else if(s.charAt(i) == ']'){
                middle.poll();
            }
            else if(s.charAt(i) == '}'){
                large.poll();
            }
        }
        if(small.isEmpty() & middle.isEmpty() & large.isEmpty()){
            return true;
        }
        return result;
    }
}
// @lc code=end

