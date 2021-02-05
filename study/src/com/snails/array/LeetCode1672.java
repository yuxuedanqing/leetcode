package com.snails.array;

/**
 * https://leetcode-cn.com/problems/richest-customer-wealth/
 * 1672. 最富有客户的资产总量
 */
public class LeetCode1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,5},{7,3},{3,5}};
        int i = new LeetCode1672().maximumWealth(accounts);
        System.out.println(i);
    }
}
