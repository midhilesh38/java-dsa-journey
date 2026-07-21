package Week2.Day8;

public class Array2D {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printMatrix(mat);
        System.out.println("Sum:"+sumMatrix(mat));
        int[][] mat1 = {
                {1,2},
                {4,5},
                {7,8}
        };
        int[][] transpose = transposeMatrix(mat1);
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] mat){
        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static int sumMatrix(int[][] mat){
        int sum = 0;
        for(int row=0;row<mat.length;row++){
            for(int col=0;col<mat[0].length;col++){
                sum+=mat[row][col];
            }
        }
        return sum;
    }
    public static int[][] transposeMatrix(int[][] mat){
        int rows=mat.length;
        int cols=mat[0].length;
        int[][] result = new int[cols][rows];
    for(int row=0;row<rows;row++){
        for(int col=0;col<cols;col++){
            result[col][row]=mat[row][col];
        }
    }
    return result;
    }

}
