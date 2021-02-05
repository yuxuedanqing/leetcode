package com.snails.array;

/**
 * https://leetcode-cn.com/problems/maximum-average-subarray-i/
 * 643. 子数组最大平均数 I
 */
public class LeetCode643 {

    public double findMaxAverage(int[] nums, int k) {
        int numLength = nums.length;
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        int maxSum = max;
        for (int i = 1; i < numLength-k+1; i++) {
            max = max - nums[i-1] + nums[i+k-1] ;
            if (max>maxSum){
                maxSum = max;
            }
        }
        return 1.0 * maxSum / k;
    }

    public double findMaxAverage2(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double maxAverage = new LeetCode643().findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }
}
