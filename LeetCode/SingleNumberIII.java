/*
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
*/

public class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (int key : map.keySet()){
            if (map.get(key) == 1) list.add(key);
        }
        for (int i = 0 ; i< list.size(); i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}