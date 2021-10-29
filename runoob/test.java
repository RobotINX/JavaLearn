package runoob;

class test {
    public static int search(int[] nums, int target) {
        int index = -1;

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int middle = (left + right) / 2;
            if(target == nums[middle]){
                return middle;
            }
            else if(target > nums[middle]){
                left = middle + 1;
            }
            else if(target < nums[middle]){
                right = middle - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search(nums, target));
        System.out.println();
    }
}
// @lc code=end

