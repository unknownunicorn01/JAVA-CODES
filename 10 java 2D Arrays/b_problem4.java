import java.util.*;
class solution{
  public void func(int[][] arr, int m, int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
  }
}
public class b_problem4 {
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
    obj.func(arr, m, n);
    sc.close();
  }
}
