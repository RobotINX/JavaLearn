import javax.lang.model.element.Element;

/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left = 1;
        long right = n;
        while(left <= right){
            int middle = (int) ((left + right) / 2);
            int guess = guess(middle);
            if(guess == 0)  return (middle);
            else if(guess == 1) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }
}
// @lc code=end

