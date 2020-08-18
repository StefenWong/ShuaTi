import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/18 15:02
 * 类描述：
 * 题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个
 * 数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是
 * 第一个重复的数字2。
 */
public class Duplicate2 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //解法2：自解算法 偷懒用Array署组的排序算法，遍历后如果相邻的有一样的数字，给duplication数组赋值
        if (numbers == null ) {
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < length-1; i++) {
            if (numbers[i] == numbers[i+1]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] a = {6,4,1,0,2,5,3};
        //int [] c ;
        System.out.println(new Duplicate2().duplicate(a,a.length, a) );
    }


    //运行时间: 12ms 占用内存: 9716KB

}
