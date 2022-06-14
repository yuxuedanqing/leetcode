package com.snails.top100;

import com.snails.common.ListNode;
import com.snails.common.NodeUtil;

/**
 * <a href="https://leetcode.cn/problems/add-two-numbers/">两数之和</a>
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};
        ListNode first = NodeUtil.createListNode(arr1);
        ListNode second = NodeUtil.createListNode(arr2);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(first, second);
        while (null != listNode) {
            System.out.print(listNode.val + "\t");
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (null != l1 || null != l2) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            // 当 n1 + n2 > 10 需要进位，此时节点值 为 sum % 10
            int sum = n1 + n2 + carry;
            // 构造头节点 当 n1 + n2
            if (null == head) {
                head = tail = new ListNode(sum % 10);
            } else {
                // 子节点
                tail.next = new ListNode( sum % 10);
                tail = tail.next;
            }
            // 进位下一个节点需要
            carry = sum / 10;
            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        }
        // 最终如果 carry > 0 则需要构造一个新节点存放进位
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
