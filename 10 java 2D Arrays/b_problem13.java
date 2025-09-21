import java.util.*;
public class b_problem13 {
  public static int[] func(int[][] mat, int m){
    int sum_upper = 0;
    int sum_lower = 0;
    for(int i=0;i<m;i++){
      for(int j=i;j<m;j++){
        sum_upper = sum_upper + mat[i][j];
      }
      for(int j=0;j<=i;j++){
        sum_lower = sum_lower + mat[i][j];
      }
    }
    int[] arr = {sum_upper,sum_lower};
    return arr;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int[][] mat = new int[m][m];
    for(int i=0;i<m;i++){
      for(int j=0;j<m;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    int[] arr = func(mat,m);
    
    System.out.println("sum of upper triangle: " + arr[0]);
    System.out.println("sum of lower triangle: " + arr[1]);
    sc.close();
  }
}
