package com.snails.day.chapter05;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *
 * 给你一个可能存在重复元素值的数组numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为 1。
 *
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：numbers = [3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：numbers = [2,2,2,0,1]
 * 输出：0
 *
 *
 * 提示：
 *
 * n == numbers.length
 * 1 <= n <= 5000
 * -5000 <= numbers[i] <= 5000
 * numbers 原来是一个升序排序的数组，并进行了 1 至 n 次旋转
 * 注意：本题与主站 154 题相同：<a href="https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/">...</a>
 *
 * 作者：Krahets
 * 链接：<a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/50xofm/">...</a>
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer11 {

    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(minArray(arr));
    }

    /**
     * 双指针法
     *
     * @param numbers numbers
     * @return int
     */
    public static int minArray(int[] numbers) {
        int size = numbers.length;
        int left = 0;
        int right = size - 1;
        if (numbers[left] < numbers[right] || size == 1) {
            return numbers[left];
        }
        while (left < right) {
            if (numbers[left] >= numbers[right]) {
                left++;
            } else {
                return numbers[left];
            }
        }
        return numbers[left];
    }

    // 遍历一遍找突变点即找到了最小值，如果找不到突变点，则第一个元素即为最小值
    public int minArray2(int[] numbers) {
        for(int i = 0;i < numbers.length - 1;i++) {
            if(numbers[i] > numbers[i + 1]) {
                return numbers[i +1];
            }
        }
        return numbers[0];
    }
}
