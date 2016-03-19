/*Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
*/

public class Solution {
    public boolean isUgly(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        int[] divisors = {2, 3, 5};
        for (int div : divisors) {
            while(num % div == 0) {
                num /= div;
            }
        }
        return (num == 1);
    }
}