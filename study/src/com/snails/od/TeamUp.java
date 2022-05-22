package com.snails.od;

/**
 * 作者：trumpetvine
 * 链接：https://www.nowcoder.com/discuss/610559?type=2
 * 来源：牛客网
 *
 * 组队问题：第一行输入一个数字n，表示第二行数字的个数，第二行输入n个正整数，第三行输入一个整数，
 * 要示输出是：第二行中，可以是1个数，也可以是2个数字之和，要大于等于第三行的数，找出最大的组合数量。第二行中每个数最多只能组合一次
 * 例：
 * 输入
 * 5
 * 3 1 5 7 9
 * 8
 * 输出
 * 3
 *
 * @author Lenovo
 * @since 2022-05-22
 */
public class TeamUp {

    public static void main(String[] args) {
        int maxTeamUpNumber = getMaxTeamUpNumber(5, new int[]{1, 3, 9, 5, 7, 3, 4}, 5);
        System.out.println(maxTeamUpNumber);
    }

    public static int getMaxTeamUpNumber(int number,int[] arr, int target) {
        // 思路：先排序，然后使用双指针遍历
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // 有元素交换，所以不是有序，标记变为false
                    flag = false;
                }
            }
            // 说明上面内层for循环中，没有交换任何元素，直接跳出外层循环
            if (flag) {
                break;
            }
        }
        int count  = 0;
        int left;
        int right;
        int newSize = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] >= target) {
                newSize = i;
                break;
            }
        }
        if (newSize > -1) {
            if (newSize == 0) {
                return size;
            }
            count += size - newSize;
        }
        left = 0;
        right = newSize - 1;
        while (right - left > 0) {
            if (arr[left] + arr[right] >= target) {
                left++;
                right--;
                count++;
            } else {
                left++;
            }
        }
        return count;
    }
}
