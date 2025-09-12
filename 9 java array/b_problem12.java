import java.util.*;
public class b_problem12 {
  public static int func(int[] arr){
    int n = arr.length-1;
    int big=Integer.MIN_VALUE;
    for(int i=1;i<=n;i++){
      if(arr[i]>=big){
        big = arr[i];
      }
    }
    int count =0;
    boolean isRepeat = false;
    for(int i=0;i<=n;i++){
      if(arr[i]==big){
        count++;
      }
    }
    if(count>1){
      isRepeat=true;
    }
    if(isRepeat){
      return big;
    }
    else{
      int big2=Integer.MIN_VALUE;
      for(int i=0;i<=n;i++){
        if(arr[i]>=big2 && big>arr[i]){
          big2=arr[i];
        }
      }
      return big2;
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