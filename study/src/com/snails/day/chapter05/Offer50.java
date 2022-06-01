package com.snails.day.chapter05;

import java.util.HashMap;

public class Offer50 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';
    }
}
