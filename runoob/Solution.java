package runoob;

class Solution {
    public static int strStr(String haystack, String needle) {
        if(haystack == ""){
            return -1;
        }
        if(needle == ""){
            return 0;
        }
        int index = 0;
        int common = 0;

        while(index < haystack.length() - needle.length()){
            if(haystack.charAt(index) == needle.charAt(common)){
                index++;
                common++;
            }
            else{
                index++;
                common = 0;
            }
            if(common == needle.length()){
                return index - needle.length();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int a = strStr(haystack, needle);
        System.out.println(a);
    }
}
// @lc code=end

