package com.snails.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/fair-candy-swap/
 * 公平的糖果棒交换
 * 条件：
 * 1.两者某个元素交换后数组总和必须相等
 * 2.如果有多种交换方案，选择一种
 */
public class LeetCode888 {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int diff = (sumA-sumB)/2;
        Set<Integer> rec = new HashSet<>();
        for (int num : A) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : B) {
            int x = y + diff;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,5};
        int[] B = {2,4};
        LeetCode888 leetCode888 = new LeetCode888();
        int[] ints = leetCode888.fairCandySwap(A, B);
        for (int i : ints) {
            System.out.println(i);
        }
    }

}
