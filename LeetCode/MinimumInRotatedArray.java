public class Solution {
    public int findMin(int[] nums) {
        // O(n) solution:
        // int min = Integer.MAX_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     min = Math.min(nums[i],min);
        // }
        // return min;

        // O(logN) solution:
        if (nums.length == 0 || nums == null) return 0;
        if (nums.length == 1) return nums[0];
        int lo = 0;
        int hi = nums.length - 1;
        int mid;
        int min = Integer.MAX_VALUE;
        while (lo <= hi){
            mid = lo + ((hi - lo) / 2);
            if (nums[lo] <= nums[mid] && nums[mid] <= nums[hi]){
                min = Math.min(min,nums[lo]);
                break;
            }
            else if (nums[mid] <= nums[lo] && nums[mid] <= nums[hi]) {
                min = Math.min(min,nums[mid]);
                hi = mid-1;
            }
            else if (nums[mid] > nums[hi]){
                lo = mid + 1;
            }
        
        }
        return min;
    }
}