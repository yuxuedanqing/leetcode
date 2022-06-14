package com.snails.day.chapter02;

import com.snails.common.ListNode;

/**
 * @author Snails
 * @date 2021/11/17 20:05
 *
 * 剑指 Offer 24. 反转链表
 *
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 5000
 */
public class Offer24 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (null != cur) {
            ListNode tmp = cur.next;    // 暂存后继节点 cur.next
            cur.next = pre;             // 修改 next 引用指向
            pre = cur;                  // pre 暂存 cur
            cur = tmp;                  // cur 访问下一节点
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        Offer24 offer24 = new Offer24();
        ListNode listNode1 = offer24.createListNode(listNode, 5);
        ListNode listNode2 = offer24.reverseList(listNode1);
        System.out.println(listNode2);
    }

    public ListNode createListNode(ListNode node, int i) {
        if (i <= 0) {
            return null;
        }
        i--;
        node.next = createListNode(new ListNode(i), i);
        return node;
    }
}
