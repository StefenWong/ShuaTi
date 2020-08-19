import java.util.ArrayList;
import java.util.Arrays;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/19 14:00
 * 类描述：
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 */
public class Solution {
    //解法1：自解   偷懒调用排序，然后打印前k个
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        //int[] res = Arrays.copyOfRange(input,0,k);
        ArrayList<Integer> resA  = new ArrayList<>();
        if(k <= input.length){
            for (int i = 0; i <k ; i++) {
                resA.add(input[i]);
            }
        } else {
            //return
//            for (int j : input) {
//                resA.add(j);
//            }
            return resA;
        }
        return resA;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().GetLeastNumbers_Solution(new int[] {4,5,1,6,2,7,3,8},5));
    }
}

//运行时间: 13ms 占用内存: 9616KB