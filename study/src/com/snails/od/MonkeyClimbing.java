package com.snails.od;

import java.util.Scanner;

/**
 * 1.猴子登山：有N个台阶，0<N<=50, 猴子每次只跳1个或者3个台阶，输入N， 输出猴子有多少种方式到达台阶终点
 *
 * @author Lenovo
 * @since 2022-05-22
 */
public class MonkeyClimbing {

    public static void main(String[] args) {
        // 思路：F(n)=f(n-1)+f(n-3) 递推公式
        System.out.println(climbStairs(40));
    }

    public static int climbStairs(int steps) {
        if (steps < 3) {
            return 1;
        } else {
            return climbStairs(steps - 1) + climbStairs(steps - 3);
        }
    }
}
