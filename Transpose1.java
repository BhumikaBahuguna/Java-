import java.util.*;
public class Transpose1{
    public static void transpose(int[][] mat, int[][] res) {
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = mat[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };
        int[][] res = new int[mat[0].length][mat.length];
        transpose(mat, res);
        System.out.println("Result matrix is:");
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
