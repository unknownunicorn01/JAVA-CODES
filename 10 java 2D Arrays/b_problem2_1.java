import java.util.*;
public class b_problem2_1 {
  static class Solution{
    public void printMatrixColumnwise(int[][] arr,int n,int m){
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          System.out.print(arr[j][i]+" ");
        }
        System.out.println();
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    
    Solution obj = new Solution();
    obj.printMatrixColumnwise(arr, n , m);
    sc.close();
  }
}
