import java.util.*;
class solution{
  public void func(int[][] arr,int n,int m){
    int count = 1;
    for(int i=0;i<n;i++){
      if(count%2 == 1){
        for(int j=0;j<m;j++){
          System.out.print(arr[i][j]+" ");
        }
      }
      else{
        for(int j=m-1;j>=0;j--){
          System.out.print(arr[i][j]+" ");
        }
      }
      count++;
      // System.out.println();
    }
  }
}
public class b_problem3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    solution obj = new solution();
    obj.func(arr,n,m);
    sc.close();
  }
}
