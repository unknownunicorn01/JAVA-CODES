import java.util.*;
public class b_problem4 {
  public static int linearSearch(int[] arr){
    int big=Integer.MIN_VALUE;
    int idx=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>big){
        big = arr[i];
        idx = i;
      }
    }
    return idx;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(linearSearch(arr));
    sc.close();
  }
}
