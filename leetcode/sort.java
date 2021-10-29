package leetcode;

class sort{
    public static void exchange(int[] nums, int index1, int index2){
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
    public static void select(int[] nums) {
        int sorted = 0;
        while(sorted < nums.length){
            int max = 0;
            for(int i = 0; i < nums.length - sorted; i++){
                max = nums[max] < nums[i] ? i : max;
            }
            exchange(nums, max, nums.length - sorted - 1);
            sorted++;
        }
    }
    public static void buble(int[] nums){
        for(int i = nums.length; i >= 0; i--){
            for(int j = 0; j < i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    exchange(nums, j, j + 1);
                }
            }
        }
    }
    public static void insert(int[] nums){
        for(int i = 1; i < nums.length; i++){
            for(int j = i; j > 0; j--){
                if(nums[j] < nums[j - 1]){
                    exchange(nums, j, j - 1);
                }
            }
        }
    }
    public static void merge(int[] nums, int left, int right){
        int mid = (left + right) / 2;
        if(left < right){
            merge(nums, left, mid);
            merge(nums, mid + 1, right);
            sort2(nums, left, mid, right);
        }
    }
    public static void merge(int[] nums){
        merge(nums, 0, nums.length - 1);
    }
    public static void sort2(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int li = left;
        int ri = mid + 1;
        int index = 0;
        while(li <= mid && ri <= right){
            if(nums[li] < nums[ri]){
                temp[index++] = nums[li++];
            }
            else{
                temp[index++] = nums[ri++];
            }
        }
        while(li <= mid){
            temp[index++] = nums[li++];
        }
        while(ri <= right){
            temp[index++] = nums[ri++];
        }
        for(int i = 0; i < temp.length; i++){
            nums[left + i] = temp[i];
        }
    }
    public static void random(int[] nums){

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println("2 3 4 5 15 19 26 27 36 38 44 46 47 48 50");
        merge(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}