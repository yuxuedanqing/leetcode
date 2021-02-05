package com.snails;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 * 1160. 拼写单词
 */
public class LeetCode1160 {

    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> characters = new HashMap<>();
        char[] chars1 = chars.toCharArray();
        int sum = 0;
        for (char c : chars1) {
            if (characters.containsKey(c)){
                characters.put(c,characters.get(c)+1);
            }else {
                characters.put(c,1);
            }
        }

        for (String word : words) {
            Map<Character, Integer> charMap = new HashMap<>(characters);
            char[] chars2 = word.toCharArray();
            int chartsLength = chars2.length;
            boolean flag = true;
            int count = 0;
            for (char c : chars2) {
                if (charMap.containsKey(c)) {
                    count++;
                    int num = charMap.get(c) - 1;
                    if (num < 0) {
                        flag = false;
                    }
                    charMap.put(c, num);
                }
            }
            if (flag && count==chartsLength) {
                sum += chartsLength;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int i = new LeetCode1160().countCharacters(words, chars);
        System.out.println(i);
    }
}
