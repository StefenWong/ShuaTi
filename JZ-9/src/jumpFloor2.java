/**
 * 作者： wanglei
 * 创建时间： 2020/8/18 16:18
 * 类描述：
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class jumpFloor2 {
    public int JumpFloorII(int target) {
        //解法1 ：
        int rel = 0;
        if (target <0 ){
            return 0;
        } else if (target == 0) {
            return 1;
        } else if(target ==1) {
            return 1;
        } else {
            for (int i = 0; i <target  ; i++) {
                rel += JumpFloorII(i);
            }
        }
        return rel;
        }

    public static void main(String[] args) {
        System.out.println(new jumpFloor2().JumpFloorII(3));
    }

    //运行时间: 14ms 占用内存: 9484KB
}
