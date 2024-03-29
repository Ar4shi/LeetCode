package com.interview.medium;

/**
 * 递归乘法。 写一个递归函数，不使用 * 运算符， 实现两个正整数的相乘。可以使用加号、减号、位移，但要吝啬一些。
 * <p>
 * 示例1:
 * 输入：A = 1, B = 10
 * 输出：10
 * <p>
 * 示例2:
 * 输入：A = 3, B = 4
 * 输出：12
 * <p>
 * 提示:
 * 保证乘法范围不会溢出
 */
public class RecursiveMulitply {

    int result = 0;

    public int multiply(int A, int B) {
        calculate(A, B);
        return result;
    }

    private int calculate(int A, int B) {
        if (B == 0) {
            return 0;
        }
        result = result + A;
        return calculate(A, B - 1);
    }
}
