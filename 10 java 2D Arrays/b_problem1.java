import java.util.*;
public class b_problem1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] mat = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[i].length;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
