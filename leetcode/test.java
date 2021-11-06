class test{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0;
        int i1 = 0;
        int i2 = 0;
        System.out.println(nums1.length);
        System.out.println(nums2.length);
        while(i1 < nums1.length && i2 < nums2.length){
            System.out.println(i1 + " " + i2);
            if(nums1[i1] < nums2[i2]){
                nums[index++] = nums1[i1++];
            }else{
                nums[index++] = nums2[i2++];
            }
        }
        while(i1 < nums1.length){
            nums[index++] = nums1[i1++];
        }
        while(i2 < nums2.length){
            nums[index++] = nums2[i2++];
        }
        if(nums.length % 2 == 0){
            return ((nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2);
        }else{
            return nums[nums.length / 2 + 1];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}