package com.snails.array;

/**
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 * 1512. 好数对的数目
 */
public class LeetCode1512 {

    public int numIdenticalPairs(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j=i+1;j<nums.length;j++){
                int b = nums[j];
                if (a == b){
                    flag++;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int i = new LeetCode1512().numIdenticalPairs(nums);
        System.out.println(i);
    }
}
