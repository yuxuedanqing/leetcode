package com.snails.array;

/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 * 1486. 数组异或操作
 */
public class LeetCode1486 {

    public int xorOperation(int n, int start) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2*i;
            sum = sum ^ num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10,start = 5;
        int i = new LeetCode1486().xorOperation(n, start);
        System.out.println(i);
    }
}
