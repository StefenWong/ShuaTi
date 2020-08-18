/**
 * 作者： wanglei
 * 创建时间： 2020/8/18 14:35
 * 类描述：
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    //解法1：自己解答   假设是最后一步了，再走一次就可以到。此时可以从倒数第二节走两个台阶到，也可以从倒数第一节走一个台阶到，
    // 递归思想就是f(n) = f(n-1 )+ f(n-2)
    public int JumpFloors(int target) {
        int result;
        if (target <=0) {
            return 1;
        } else if (target == 1){
            return 1;
        } else {
            result = JumpFloors(target -2) + JumpFloors(target -1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new JumpFloor().JumpFloors(3));
    }
}


//运行时间：509ms
//
//占用内存：9344k
