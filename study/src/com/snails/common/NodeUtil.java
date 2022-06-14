package com.snails.common;

import java.util.ArrayList;
import java.util.List;

public class NodeUtil {

    public static ListNode createListNode(int[] arr) {
        List<ListNode> nodeList = new ArrayList<>();
        for (int j : arr) {
            ListNode listNode = new ListNode(j);
            nodeList.add(listNode);
        }
        for (int i = 0; i < arr.length; i++) {
            ListNode node = nodeList.get(i);
            if (i + 1 < arr.length) {
                node.next = nodeList.get(i + 1);
            }
        }
        return nodeList.get(0);
    }
}
