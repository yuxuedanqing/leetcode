package com.snails.array;

/**
 * https://leetcode.cn/problems/climbing-stairs/
 *
 * @author Lenovo
 * @since 2022-05-24
 */
public class LeetCode70 {

    public static void main(String[] args) {
        System.out.println(new LeetCode70().climbStairs(2));
    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
