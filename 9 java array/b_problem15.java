import java.util.*;
public class b_problem15 {
  public static int func(int[] arr){
    int n = arr.length;
    int big = Integer.MIN_VALUE;
    int idx = -1;
    for(int i=0;i<n;i++){
      if(arr[i]>=big){
        big = arr[i];
        idx = i;
      }
    }
    boolean isTrue = false;
    for(int i=0;i<n;i++){
      if(arr[i]==big){
        continue;
      }
      if(arr[i]*2<=big){
        isTrue = true;
      }
      else{
        isTrue = false;
        break;
      }
    }
    if(isTrue){
      return idx;
    }
    else{
      return -1;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(func(arr));
    sc.close();
  }
}
