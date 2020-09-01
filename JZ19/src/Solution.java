import java.util.ArrayList;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/26 15:49
 * 类描述：
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution {
    //本题自己解答估计话很多时间，并且不一定好，采取方式是看其他人解答思路，自己实现
    //方法1：可以使用一种超简单且易理解的方法（包注释不超过20行）：1.吸收第一行，并将第一行从矩阵中去掉，
    // 2.将矩阵“变相转置”（这里的转置可以理解为将矩阵从地上立起来，比如矩阵是【【1,2,3】， 【4,5,6】】 将它“变相转置”
    // （立起来）为 【【3,6】，【2,5】，【1,4】】 ）3.重复以上两步，直到将第一行去掉之后矩阵为空。

    //现在尝试第一种和第二种结合的方法
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //先打印第一行，然后翻转剩下的矩阵,下面方法只翻滚，返回一个新的矩阵
        //问题是，翻滚矩阵传递进去的参数是原来的矩阵？？？？——解答：其实不是的了，每次翻滚都返回一个新的矩阵，传递的是新的
        //1,特殊情况：行书或者列数为0
        if(matrix.length == 0 || matrix[0].length ==0){
            return null;
        }
        //2，打印首行


        return arrayList;
    }

    public ArrayList<Integer>  turnMatrix(int[][] matrix){
        //传进来矩阵的行数
        int m = matrix.length;
        //列数
        int n = matrix[0].length;
        int[][]  newMatrc = new int[n][m-1];


        return null;
    }


}
