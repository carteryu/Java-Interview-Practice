//326. Power of Three
//Given an integer, write a function to determine if it is a power of three.
//Difficulty: Easy

public class Solution {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; Math.pow(3,i) <= n; i++){
            if (Math.pow(3,i) == n) return true;
        }
        return false;
    }
}