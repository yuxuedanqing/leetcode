package com.snails.array;

/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 * 303. 区域和检索 - 数组不可变
 */
public class LeetCode303 {

    public int[] m;

    public LeetCode303(int[] nums){
        m = nums;
    }

    public int sumRange(int i, int j){
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += m[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = {-2,0,3,-5,2,-1};
        LeetCode303 leetCode303 = new LeetCode303(num);
        int i = leetCode303.sumRange(0, 5);
        System.out.println(i);
    }
}
