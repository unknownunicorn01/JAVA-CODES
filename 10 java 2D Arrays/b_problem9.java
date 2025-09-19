import java.util.*;
public class b_problem9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int num = -1;
    int idx = 0;
    int big = Integer.MIN_VALUE;
    int small = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      big = Integer.MIN_VALUE;
      small = Integer.MAX_VALUE;
      for(int j=0;j<n;j++){
        if(arr[j][i] >= big){
          big = arr[j][i];
          idx = j;
        }
      }
      // System.out.println(big);
      for(int j=0;j<n;j++){
        if(arr[idx][j] <= small){
          small = arr[idx][j];
        }
      }
      if(small == big){
        num = small;
      }
      // System.out.println(small);
    }
    System.out.println(num);
    sc.close();
  }
}
