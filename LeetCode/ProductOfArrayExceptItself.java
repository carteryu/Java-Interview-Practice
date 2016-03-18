/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].
*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int prod = 1;
        for (int i = 0; i < nums.length; i ++){
            ret[i] = prod; 
            prod *= nums[i];
        }
        //ret[0] = 1;
        //prod = 1 * 1 = 1;
        //ret[1] = 1;
        //prod = 1 * 2;
        //ret[2] = 2;
        //prod = 2 * 3;
        //ret[3] = 6;
        //prod = 6 * 3;
        prod = 1;
        for (int i = nums.length-1; i>=0; i--){
            ret[i] *= prod;
            prod *= nums[i];
        }
        //ret[3] = 6 * 1;
        //prod = 1 * 4;
        //ret[2] = 2 * 4;
        //prod = 4 * 3;
        //ret[1] = 1 * 12;
        //prod = 12 * 2;
        //ret[0] = 24 * 1;
        //prod = 24 * 1;
        
        return ret;
    }
}