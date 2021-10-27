/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
    /*
        int length = 0;
        int index = 0;
        for(int i = 0; i < strs.length; i++){
            if(strs[index].length() >= strs[i].length()){
                length = strs[i].length();
                index = i;
            }
        }
        System.out.println("length = " + length);
        
        int com = 0;
        String result = "";
        //i 为数组中最短字符串的长度
        //j 为数组中字符串的个数
        
        loop:for(int i = 0; i < length; i++){
            System.out.println(com);
            for(int j = 0; j < strs.length; j++){
                if(!strs[0].substring(0, com).equals(strs[j].substring(0, com))){
                    System.out.println("break");
                    System.out.println(i + " " + j + " " + com);
                    break loop;
                }
                if(j == strs.length - 1){
                    com += 1;
                }
            }
        }
        result = strs[0].substring(0, com);
        return result;
    */

    String result = "";
    //如果字符串数组为空，直接返回空值
    if(strs.length == 0){
        return result;
    }
    //否则将第一个字符串暂时设置成最长公共前缀
    else{
        result = strs[0];
    }
    //如果字符串数组为1，直接返回该字符串
    if(strs.length == 1){
        return result;
    }
    //从第二个字符串开始
    for(int i = 1; i < strs.length; i++){
        //如果有字符串为空，那么最长公共前缀为空
        if(strs[i].isEmpty()){
            result = strs[i];
            break;
        }
        //两两比较找出最长公共前缀
        int j = 0;
        for(; j < result.length() && j < strs[i].length(); j++){
            if(result.charAt(j) != strs[i].charAt(j)){
                break;
            }
        }
        result = result.substring(0, j);
        if(result == ""){
            return result;
        }
    }
    return result;
    }
}
// @lc code=end

