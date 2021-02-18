package com.snails.array;

/**
 * https://leetcode-cn.com/problems/shuffle-the-array/
 * 1470. 重新排列数组
 */
public class LeetCode1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] new_nums = new int[2*n];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // 都是x
            if (i<n){
                new_nums[2*i] = nums[i];
            }else {
                // 都是y
                count++;
                new_nums[i-n+count] = nums[i];
            }
        }
        return new_nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffle = new LeetCode1470().shuffle(nums, n);
        for (int i : shuffle) {
            System.out.print(i+"\t");
        }
    }
}
