/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        //-2147483648,2147483648
        //结果
        int result = 0;
        //长度
        int length = 0;
        //绝对值
        int num = Math.abs(x);
        //正序数字
        int[] ArrayResult = new int[11];

        do{
            ArrayResult[length] = num % 10;
            num = num / 10;
            length += 1;
        }while(num >= 1 || num <= -1);
        num = Math.abs(x);


        for(int i = 0; i < length; i++){
            result = result * 10 + ArrayResult[i];
        }

        int resultCheck = result;
        for(int i = 0; i < length / 2; i++){
            int numCheck = resultCheck % 10;
            if(numCheck != ArrayResult[length - i - 1]){
                result = 0;
                break;
            }
            resultCheck /= 10;
        }
        
        if(x < 1){
            result = - result;
        }
        return result;
    }
}

// @lc code=end

