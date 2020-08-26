import java.util.Arrays;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/20 18:40
 * 类描述：
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution2 {
    //解法2：todo  先投机选用Arrays的排序方法，遍历，如果当前元素加一半的那个数是自己本身，就说明当前数字是答案，如果遍历一遍没有找到，说明不存在，返回0
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length-array.length/2; i++) {
            if(array[i] == array[i+ array.length/2])
            {
                return array[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int[] a = {1,2,3,2,4,2,5,2,3};
       //int[] a = {1,2,3,2,2,2,5,4,2};
        System.out.println(new Solution2().MoreThanHalfNum_Solution(a));
    }

    double d=0x12345678;

}

//运行时间: 10ms 占用内存: 9316KB