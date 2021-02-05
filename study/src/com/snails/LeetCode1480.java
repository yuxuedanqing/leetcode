package com.snails;

/**
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * 1480. 一维数组的动态和
 */
public class LeetCode1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ints = new LeetCode1480().runningSum(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
