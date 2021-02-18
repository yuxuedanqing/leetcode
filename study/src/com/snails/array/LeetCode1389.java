package com.snails.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 * 1389. 按既定顺序创建目标数组
 */
public class LeetCode1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            list.add(index[i], nums[i]);
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] targetArray = new LeetCode1389().createTargetArray(nums, index);
        for (int i : targetArray) {
            System.out.print(i+"\t");
        }
    }
}
