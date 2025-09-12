import java.util.*;
public class b_problem9_Incompleat {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int small = 0;
    int big = 0;
    // boolean targ = false;
    int[] bigArr = new int[n];
    int[] smallArr = new int[n];
    int num=0;
    for(int i=0;i<n;i++){
      small = Integer.MAX_VALUE;
      big = Integer.MIN_VALUE;
      for(int j=0;j<n;j++){
        if(arr[i][j] <= small){
          small = arr[i][j];
        }
        if(arr[j][i] >= big){
          big = arr[j][i];
        }
      }
      System.out.println("Small: "+ small+ "\nBig: "+big);
      bigArr[i] = big;
      smallArr[i] = small;
    }
    for(int i=0;i<n;i++){
      if(smallArr[i] == bigArr[i]){
        num = smallArr[i];
        break;
      }
      else{
        num = -1;
      }
    }
    System.out.println(num);
    sc.close();
  }
}

/*

1 2 3
4 5 6
7 8 9

7

 */
