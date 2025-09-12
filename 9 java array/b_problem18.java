import java.util.*;
public class b_problem18 {
  public static int[] func(int[] arr, int k){
    int n = arr.length;
    int[] arr2 = new int[n];
    if(k>=0){
      if(k>=n){
        k%=n;
      }
      for(int i=0;i<k;i++){
        arr2[i] = arr[n-k+i];
      }
      int idx =0;
      for(int i=k;i<n;i++){
        arr2[i] = arr[idx];
        idx++;
      }
      return arr2;
    }
    else{
      k = Math.abs(k);
      if(k>=n){
        k%=n;
      }
      for(int i=0;i<n-k;i++){
        arr2[i] = arr[i+k]; 
      }
      int idx=0;
      for(int i=n-k;i<n;i++){
        arr2[i] = arr[idx];
        idx++;
      }
      return arr2;
      
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = i+1;
    }
    int k = sc.nextInt();
    // System.out.println(Arrays.toString(func(arr,k)));
    for(int val : func(arr, k)) System.out.print(val+" ");
    sc.close();
  }
}
