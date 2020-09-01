import java.util.ArrayList;

/**
 * 作者： wanglei
 * 创建时间： 2020/8/26 15:49
 * 类描述：
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solutio2 {
    //本题自己解答估计话很多时间，并且不一定好，采取方式是看其他人解答思路，自己实现
    //方法2: 此方法为左神的书 p 331 页解法！
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int LX = 0;
        int LY = 0;
        int RX = matrix.length -1;//二维数组的length代表行数，这里定义1 2 3 4 5 后，传进来的其实是int [5][]！
        int RY = matrix[0].length-1;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //i++代表先用后自增，所以这里先打印最外围的，打印后自增和自减，然后再次调用直到whild条件不满足
        while(LX <= RX && LY <= RY) {
           arrayList = printOutside(arrayList1,matrix,LX++,LY++,RX--,RY--);
        }
        System.out.println(arrayList);
        return arrayList;
    }

    private ArrayList<Integer> printOutside(ArrayList<Integer> arrayList, int[][] matrix, int LX, int LY, int RX, int RY) {
        //定义两个“游标”
        int X = LX;
        int Y = LY;
        //如果此时只有一行了
        if (LX == RX) {
            // 这里不能改变X、Y的值
//             while (Y != LY){
//                 arrayList.add(matrix[LX][Y]);
//                 Y++;
//             }

            for (int i = LY; i <= RY ; i++) {
                arrayList.add(matrix[LX][i]);
            }
        } else if (LY == RY){
            //只有一列
//             while (X != RX){
//                 arrayList.add(matrix[X][LY]);
//                 X++;
//             }
            for (int i = LX; i <= RX; i++) {
                arrayList.add(matrix[i][LY]);
            }
        } else {
            //多行多列
            //打印第一画
            while(Y != RY){
                arrayList.add(matrix[LX][Y]);
                Y++;
            }
            while (X != RX){
                arrayList.add(matrix[X][RY]);
                X++;
            }
            while (Y != LY){
                arrayList.add(matrix[RX][Y]);
                Y--;
            }
            while (X != LX){
                arrayList.add(matrix[X][LY]);
                X--;
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
        int[][] a= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] c = {{1,2,3,4,5}};
        new Solutio2().printMatrix(c);
    }


}
