package com.snails;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 * 509. 斐波那契数
 */
public class LeetCode509 {

    public int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int fib = new LeetCode509().fib(5);
        System.out.println(fib);
    }
}
