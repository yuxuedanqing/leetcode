package com.snails.day.chapter05;

/**
 * 剑指 Offer 04. 二维数组中的查找
 *
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *  
 *
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target=5，返回true。
 *
 * 给定target=20，返回false。
 *
 *
 *
 * 限制：
 *
 * 0 <= n <= 1000
 *
 * 0 <= m <= 1000
 *
 *
 *
 * 注意：本题与主站 240 题相同：<a href="https://leetcode-cn.com/problems/search-a-2d-matrix-ii/">...</a>
 *
 * 作者：Krahets
 * 链接：<a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/5v76yi/">...</a>
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer04 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findNumberIn2DArray2(arr, 5));
    }

    /**
     * 二分查找
     *
     * @param matrix matrix
     * @param target target
     * @return true or false
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] second : matrix) {
            int left = 0;
            int secondLength = second.length;
            int right = secondLength - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (target > second[mid]) {
                    // 在右边
                    left = mid + 1;
                } else if (target < second[mid]) {
                    // 在左边
                    right = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 转化为图的思想
     *
     * @param matrix matrix
     * @param target target
     * @return true or false
     */
    public static boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
