package com.snails.od;

import java.util.Scanner;

/**
 * 幸运数问题，定义一个数，若k能被x，y，z任意一个数整除，则可以认为k是一个幸运数，计算1-n之间共有多少幸运数
 * 1<=n<=100
 * eg: 10 3 5 7，输出6
 * eg: 65489 15 64 99 输出 5841
 */
public class LuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] s = nextLine.split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        int y = Integer.parseInt(s[2]);
        int z = Integer.parseInt(s[3]);
        getLuckyNumber(n, x, y, z);
    }

    public static void getLuckyNumber(int n, int x, int y, int z) {
        // 思路：容斥定理  最大公约数   最小公倍数
        int xy = LCM(x, y);
        int yz = LCM(y, z);
        int zx = LCM(z, x);
        int ans = n / x + n / y + n / z - n/xy - n/yz - n/zx + n / LCM(xy, LCM(yz, zx));
        System.out.println(ans);
    }

    /**
     * 最大公约数
     *
     * @param a a
     * @param b b
     * @return int
     */
    public static int GCD(int a, int b) {
        return b == 0 ?  a : GCD(b, a % b);
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
