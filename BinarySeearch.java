package stack;

public class BinarySeearch {
    public static int iterativeBinarySearch(int[] nums, int value){
        int start = 0;
        int end = nums.length;
        while (start<end){
            int mid = (start+end)/2;
            if (nums[mid]==value){
                return mid;
            }
            else if (nums[mid]<value){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,8,12,16,23,38,56,72,91};
        System.out.println(iterativeBinarySearch(nums,911));
    }
}
