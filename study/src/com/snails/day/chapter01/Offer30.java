package com.snails.day.chapter01;

import java.util.Stack;

/**
 * @author Snails
 * @date 2021/11/16 21:37
 *
 * 剑指 Offer 30. 包含 min 函数的栈
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 *
 * 提示：
 *
 * 各函数的调用总次数不超过 20000 次
 */
public class Offer30 {

    Stack<Integer> A;
    Stack<Integer> B;


    public Offer30() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.isEmpty() || B.peek() >= x) {
            B.add(x);
        }
    }

    public void pop() {
        if (A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }

    public static void main(String[] args) {
        Offer30 offer30 = new Offer30();
        offer30.push(9);
        offer30.push(10);
        offer30.push(7);
        offer30.push(3);
        offer30.push(5);
        System.out.println(offer30.min());
        offer30.pop();
        System.out.println(offer30.top());
        System.out.println(offer30.min());
    }
}
