package net.manishgiri.primitives.numberPalindrome;

 class Solution {

     static boolean isPalindrome(int x) {
        // negative num is not a palindrome
        if (x < 0) return false;
        // find log (in integer)
        int log = (int) Math.log10(x);
        // find num of digits in x
        int digits = log + 1;
        // calculate mask (to the power of 10)
        int mask = (int) Math.pow(10, log);

        // iterate through middle half of the number
        for (int i = 0; i < digits / 2; i++) {
            // 1. get first digit
            // 2. get last digit
            // 3. calculate number based on mask and divide (chop off 1st and last digit)
            // 4. repeat

            int first = x / mask;
            int last = x % 10;
            if (first != last) return false;

            // chop off first digit
            x = x % mask;

            // chop off last digit
            x = x / 10;

            // reset mask
            log = (int) Math.log10(x);
            mask = (int) Math.pow(10, log);

        }

        return true;
    }
    
}
