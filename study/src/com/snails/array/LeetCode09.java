package com.snails.array;

/**
 * <a href="https://leetcode.cn/problems/palindrome-number/">回文数</a>
 *
 * @since 2022-05-26
 */
public class LeetCode09 {

    public static void main(String[] args) {
        System.out.println(isNumberOfPalindromes(12321));
    }

    public static boolean isNumberOfPalindromes(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
