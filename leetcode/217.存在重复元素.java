import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int sorted = 0;
        /*
        while(sorted < nums.length){
            int max = 0;
            for(int i = 0; i < nums.length - sorted; i++){
                max = nums[max] < nums[i] ? i : max;
            }
            int tmp = nums[max];
            nums[max] = nums[nums.length - sorted - 1];
            nums[nums.length - sorted - 1] = tmp;
            sorted++;
    
        }
        */


        merge(nums);
        //System.out.println(Arrays.toString(nums));
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }


    public static boolean merge(int[] nums, int left, int right){
        int middle = (left + right) / 2;
        if(right == left){
            return false;
        }
        if(right - left == 1){
            if(nums[right] < nums[left]){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            return false;
        }
        merge(nums, left, middle);
        merge(nums, middle + 1, right);

        int[] tmp = new int[right - left + 1];
        int li = left;
        int ri = middle + 1;
        int index = 0;
        while(li <= middle && ri <= right){
            if(nums[li] < nums[ri]){
                tmp[index++] = nums[li++];
            }else{
                tmp[index++] = nums[ri++];
            }
        }
        while(li <= middle){
            tmp[index++] = nums[li++];
        }
        while(ri <= right){
            tmp[index++] = nums[ri++];
        }
        //System.out.println(Arrays.toString(tmp));
        for(int i = 0; i < tmp.length; i++){
            nums[left + i] = tmp[i];
            
        }
        return false;
    }

    public static boolean merge(int[] nums){
        merge(nums, 0, nums.length - 1);
        return false;
    }
}
// @lc code=end

