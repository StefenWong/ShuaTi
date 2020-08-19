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
public class Solution2 {
    //解法2：解法1效率太低（log 2^n）  对于这种递归问题，第三项和前两项相关问题采取“指针”方法（看代码方法即可了解）
    // 可以这么理解：由于第三项的值前两项的结果相关，所以，每次向前移动一格，第一个和第二个和为第三个，移动后，第二个变威第一个，第三个变威第二个，再次计算第三个
    public int Fibonacci(int n) {
        if (n <=0){
            return 0;
        } else if (n ==1 || n==2 ){
            return 1;
        } else {
            int temp=0;
            int pre = 1;
            int now = 1;
            for (int i = 3; i <=n ; i++) {
                temp = now;
                now = now + pre;
                pre = temp;
            }
            return now;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().Fibonacci(6));
    }
}


