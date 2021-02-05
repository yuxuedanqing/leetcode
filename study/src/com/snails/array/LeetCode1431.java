package com.snails.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * 1431. 拥有最多糖果的孩子
 */
public class LeetCode1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> flagList = new ArrayList<>();
        for (int candy : candies) {
            if (candy>max){
                max = candy;
            }
        }
        for (int candy : candies) {
            int newCandy = candy+extraCandies;
            if (newCandy>=max){
                flagList.add(true);
            }else {
                flagList.add(false);
            }
        }
        return flagList;
    }

    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> booleans = new LeetCode1431().kidsWithCandies(candies, extraCandies);
        for (Boolean aBoolean : booleans) {
            System.out.print(aBoolean+"\t");
        }
    }
}
