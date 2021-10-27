/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public static String addBinary(String a, String b) {
        //确保字符串a是两个字符串中较长的一个
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }
        char[] result = new char[a.length() + 1];
        int indexa = a.length() - 1;
        int indexb = b.length() - 1;
        int x = 48;
        //ASCII 1:49
        //ASCII 0:48
        System.out.println("a\tb\tx\ttmp");
        while(indexa >= -1 || indexb >= 0){
            int asciia, asciib, tmp;
            asciia = indexa < 0 ? 48 : a.charAt(indexa);
            asciib = indexb < 0 ? 48 : b.charAt(indexb);
            tmp = asciia + asciib + x - 48 * 3;
            if(tmp == 0){
                x = 48;
                result[indexa + 1] = 48;
            }
            else if(tmp == 1){
                x = 48;
                result[indexa + 1] = 49;
            }
            else if(tmp == 2){
                x = 49;
                result[indexa] = 49;
                result[indexa + 1] = 48;
            }
            else if(tmp == 3){
                x = 49;
                result[indexa] = 49;
                result[indexa + 1] = 49;
            }
            indexa--;
            indexb--;
        }
        if(result[0] == '0'){
            return String.valueOf(result, 1, result.length - 1);
        }
        else{
            return String.valueOf(result);
        }
    }
}
// @lc code=end

