package com.snails.day.chapter04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 剑指 Offer 53 - II. 0～n-1 中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [0,1,3]
 * 输出: 2
 * 示例2:
 *
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *
 *
 * 限制：
 *
 * 1 <= 数组长度 <= 10000
 *
 * 相关标签
 *
 * Java
 *
 *
 *
 * 作者：Krahets
 * 链接：<a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/58iqo5/">剑指 Offer 53 - II. 0～n-1 中缺失的数字</a>
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer532 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strList = s.split(" ");
        int[] ints = Arrays.stream(strList).mapToInt(Integer::parseInt).toArray();
        int missingNumber = getMissingNumber(ints);
        System.out.println(missingNumber);
    }

    public static int getMissingNumber(int[] nums) {
        // 思路，二分法
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
