import java.util.*;
// import java.io.*;

class Solution {
    public int[][] matrixTranspose(int[][] arr, int n) {
       //Write your code here
       int[][] arr2 = new int[n][n];
       for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = arr[j][i];
            }
            System.out.println();
        }
        return arr2;
    }
}

public class b_problem4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        int[][] arr2 = Obj.matrixTranspose(matrix, n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(Arrays.deepToString(arr2));
        sc.close();
    }
}