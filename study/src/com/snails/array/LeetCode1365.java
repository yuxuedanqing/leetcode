package com.snails.array;

/**
 * https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * 1365. 有多少小于当前数字的数字
 */
public class LeetCode1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                if (j!=i && nums[i]>nums[j]){
                    sum += 1;
                }
            }
            newArr[i] = sum;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ints = new LeetCode1365().smallerNumbersThanCurrent(nums);
        for (int anInt : ints) {
            System.out.print(anInt+"\t");
        }
    }
}
