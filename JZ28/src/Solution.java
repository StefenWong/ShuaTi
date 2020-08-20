import java.util.HashMap;
import java.util.Map;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/20 16:06
 * 类描述：
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution {
    //自解法1： 本方法有点投机，没有用真正的考点
    public int MoreThanHalfNum_Solution(int [] array) {
        //先获取数组长度
        int length = array.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <length ; i++) {
            //map.put(array[i],null);
            if (!map.containsKey(array[i])) {
                map.put(array[i],1);
            } else {
                map.put(array[i],map.get(array[i])+1);
            }
        }

        int max = map.get(array[0]);
        int key = 0;
        //找到最大次数已经对应的值
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();//次数
                key = entry.getKey();//对应次数的值
            }
        }
        if(max > (double)(length/2.0)){
            //假设最开始数组的第一项的次数最大
           // map.forEach((k,v) ->  v > max ? max = v : max = max );
            return  key;
        } else {
        return 0;
        }
    }

    public static void main(String[] args) {
       //int[] a = {1,2,3,2,4,2,5,2,3};
       int[] a = {1,2,3,2,2,2,5,4,2};
        System.out.println(new Solution().MoreThanHalfNum_Solution(a));
    }
}

//运行时间: 10ms 占用内存: 9416KB