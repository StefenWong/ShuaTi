/**
 * 作者： wanglei
 * 创建时间： 2020/8/18 16:42
 * 类描述：
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 *
 *
 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368[1]
 *
 ** 特别指出：第0项是0，第1项是第一个1。
 *
 * 这个数列从第3项开始，每一项都等于前两项之和。
 */
public class Solution {
    //解法1：注意有第0项这个概念
    public int Fibonacci(int n) {
        if (n <=0) {
            return 0;
        }
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            //第n项= n-1 +  n-2
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().Fibonacci(6));
    }
}


//运行时间: 1124ms 占用内存: 9636KB