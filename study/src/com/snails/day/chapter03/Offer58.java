package com.snails.day.chapter03;

/**
 * @author Snails
 * @date 2021/11/18 21:13
 *
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出:"cdefgab"
 * 示例 2：
 *
 * 输入: s = "lrloseumgh", k = 6
 * 输出:"umghlrlose"
 *
 *
 * 限制：
 *
 * 1 <= k < s.length <= 10000
 *
 */
public class Offer58 {

    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder cur = new StringBuilder();
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            if (i < n) {
                sb.append(chars[i]);
            } else {
                cur.append(chars[i]);
            }
        }
        cur.append(sb);
        return cur.toString();
    }

    public static void main(String[] args) {
        Offer58 offer58 = new Offer58();
        String abcdefg = offer58.reverseLeftWords("lrloseumgh", 6);
        System.out.println(abcdefg);
    }
}
