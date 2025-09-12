import java.util.*;
class solution{
  public int[][] rotate(int[][] arr, int m , int n){
    int[][] arr2 = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr2[i][j] = arr[n-j-1][i];
      }
    }
    return arr2;
  }
}
public class b_problem5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] arr = new int[m][n];
    
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    solution obj = new solution();
    int[][] mat = obj.rotate(arr,m,n);
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
    // System.out.println(Arrays.deepToString(mat));
    sc.close();

  }
}
