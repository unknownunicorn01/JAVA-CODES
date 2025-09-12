import java.util.*;
import java.util.Arrays;
class solution{
  public static int[] func(int[] arr){
    int n = arr.length;
    int[] arr2 = new int[n];
    for(int i=0;i<n;i++){
      arr2[n-i-1] = arr[i];
    }
    return arr2;
  }
} 

public class b_problem17 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    // solution obj = new solution();
    System.out.println(Arrays.toString(solution.func(arr)));
    sc.close();
  }
}
