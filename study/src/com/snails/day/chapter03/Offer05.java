package com.snails.day.chapter03;

/**
 * @author Snails
 * @date 2021/11/15 22:15
 *
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 10000
 */
public class Offer05 {

    /**
     * 题解1
     * @param s s
     * @return string
     */
    public String replaceSpace(String s) {
        return s.length() <= 5000 ? s.replace(" ", "%20") : "";
    }

    /**
     * 题解2
     * @param s s
     * @return string
     */
    public String replaceSpace2(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        String s1 = new Offer05().replaceSpace(s);
        System.out.println(s1);
    }
}
