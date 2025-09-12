import java.util.*;
public class b_problem7 {
  public static int[][] func(int[][] arr, int m, int n){
    boolean isTrue = false;
    int[][] arr2 = new int[m][n];
    System.out.println("Your array: \n"+Arrays.deepToString(arr));
    for(int i=0;i<m;i++){
      isTrue = false;
      for(int j=0;j<n;j++){
        if(arr[i][j] == 1){
          isTrue = true;
        }
      }
      if(isTrue){
        for(int j=0;j<n;j++){
          arr2[i][j] = 1;
        }
      }
      else{
        for(int j=0;j<n;j++){
          arr2[i][j] = 0;
        }
      }
    }
    return arr2;
  }
  public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] arr = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int[][] arr2 = func(arr, m ,n);
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        System.out.print(arr2[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
