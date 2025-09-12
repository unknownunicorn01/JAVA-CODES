import java.util.*;
class solution{
  public int[][] tran(int[][] arr,int n){
    int[][] arr2 = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr2[i][j] = arr[j][i];
      }
    }
    return arr2;
  }
}
public class b_problem4_1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    solution obj = new solution();
    int[][] arr2 = obj.tran(arr,n);
    // System.out.println(Arrays.deepToString(arr2));
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(arr2[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
