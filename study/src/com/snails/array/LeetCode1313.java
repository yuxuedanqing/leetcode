package com.snails.array;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * 1313. 解压缩编码列表
 */
public class LeetCode1313 {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                arrList.add(nums[i+1]);
            }
        }
        int length = arrList.size();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = arrList.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        int[] ints = new LeetCode1313().decompressRLElist(nums);
        for (int anInt : ints) {
            System.out.print(anInt+"\t");
        }
    }
}
