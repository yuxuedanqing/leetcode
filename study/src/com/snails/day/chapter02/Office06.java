package com.snails.day.chapter02;

import com.snails.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Snails
 * @date 2021/11/17 18:22
 *
 * 剑指 Offer 06. 从尾到头打印链表
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。\
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 *
 * 限制：
 *
 * 0 <= 链表长度 <= 10000
 */
public class Office06 {

    private final List<Integer> arr = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        each(head);
        int[] a = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }
        return a;
    }

    public void each(ListNode node) {
        if (null == node) {
            return;
        }
        each(node.next);
        arr.add(node.val);
    }

    public static void main(String[] args) {

        Office06 office06 = new Office06();
        ListNode listNode = office06.createListNode();
        int[] ints = office06.reversePrint(listNode);
        for (int i : ints) {
            System.out.print(i+"\t");
        }
    }


    public ListNode createListNode() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(2);
        one.next = two;
        two.next = three;
        return one;
    }
}
