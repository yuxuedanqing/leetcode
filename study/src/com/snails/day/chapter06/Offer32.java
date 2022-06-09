package com.snails.day.chapter06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 *
 *
 * 例如:
 * 给定二叉树:[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [3,9,20,15,7]
 *
 *
 * 提示：
 *
 * 节点总数 <= 1000
 *
 * 作者：Krahets
 * 链接：<a href="https://leetcode.cn/leetbook/read/illustration-of-algorithm/9ackoe/">...</a>
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer32 {

    public static void main(String[] args) {
        List<TreeNode> list = new ArrayList<>();
        createTree(list);
        int[] ints = printBinaryTree(list.get(0));
        for (int anInt : ints) {
            System.out.print(anInt + "\t");
        }
    }

    public static int[] printBinaryTree(TreeNode root) {
        if(root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root); }};
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void createTree(List<TreeNode> list) {
        Integer[] array = new Integer[]{3,9,20,null,null,15,7};
        for (Integer value : array) {
            list.add(new TreeNode(null == value ? -1 : value));
        }
        for (int i = 0; i < array.length / 2 - 1; i++) {       // i表示的是根节点的索引，从0开始
            if (list.get(2 * i + 1) != null) {
                // 左结点
                list.get(i).left = list.get(2 * i + 1);
            }
            if (list.get(2 * i + 2) != null) {
                // 右结点
                list.get(i).right = list.get(2 * i + 2);
            }
        }
        // 判断最后一个根结点：因为最后一个根结点可能没有右结点，所以单独拿出来处理
        int lastIndex = array.length / 2 - 1;
        // 左结点
        list.get(lastIndex).left = list.get(lastIndex * 2 + 1);
        // 右结点，如果数组的长度为奇数才有右结点
        if (array.length % 2 == 1) {
            list.get(lastIndex).right = list.get(lastIndex * 2 + 2);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
