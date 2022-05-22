package com.snails.greedy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode11 {
    
    public static void main(String[] args) {
        
    }

    public int maxArea(int[] height) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = height.length;
        for(int i = 0; i < size; i++) {
            map.put(i, height[i]);
        }
        return 0;
    }
}
