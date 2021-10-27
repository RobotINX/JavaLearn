public class test {
    public static void main(String[] args) {
        int[] nums = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println("2 3 4 5 15 19 26 27 36 38 44 46 47 48 50");
        merge(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    public static void merge(int[] nums){
        merge(nums, 0, nums.length - 1);
    }

    public static void merge(int[] nums, int left, int right){
        int middle = (left + right) / 2;;
        if(left < right){
            merge(nums, left, middle);
            merge(nums, middle + 1, right);
            sort(nums, left, middle, right);
        }
    }
    public static void sort(int[] nums, int left, int middle, int right){
        int li = left;
        int ri = middle + 1;
        int ti = 0;
        int[] tmp = new int[right - left + 1];
        while(li <= middle && ri <= right){
            if(nums[li] > nums[ri]){
                tmp[ti++] = nums[ri++];
            }else{
                tmp[ti++] = nums[li++];
            }
        }
        while(li <= middle){
            tmp[ti++] = nums[li++];
        }
        while(ri <= right){
            tmp[ti++] = nums[ri++];
        }
        for(int i = 0; i < tmp.length; i++){
            nums[i + left] = tmp[i];
        }
    }
}
