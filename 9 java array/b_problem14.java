import java.util.*;
public class b_problem14 {
  public static int[] func(int[] arr){
    int n = arr.length;
    int[] arr2 = new int[n];
    for(int i=0;i<n;i++){
      int sum = 0;
      for(int j=0;j<n;j++){
        sum = sum + arr[j]; 
      }
      arr2[i] = sum-arr[i];
    }
    return arr2;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int[] res = func(arr);
    for(int val: res) System.out.println(val);
    sc.close();
  }
}
