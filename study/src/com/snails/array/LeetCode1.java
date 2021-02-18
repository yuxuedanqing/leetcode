package com.snails.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 1.两数之和
 */
public class LeetCode1 {

    public int[] sum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int nextValue = target - value;
            if (map.containsKey(nextValue)){
                int key = map.get(nextValue);
                return new int[]{key,i};
            }else {
                map.put(value,i);
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] sum = new LeetCode1().sum(nums, target);
        for (int i : sum) {
            System.out.print(i+"\t");
        }
    }
}
