//sum of all elements
//average of elements
//largest number element
import java.util.*;
import java.util.Arrays;
public class b_problem3 {
  public static int sum(int[] arr){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      sum = sum + arr[i];
    }
    return sum;
  }
  public static float avg(int[] arr){
    float sum = 0f;
    for(int i=0; i<arr.length; i++){
      sum = sum +arr[i];
    }
    return sum/arr.length;
  }
  public static int max(int[] arr){
    int big = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>big){
        big = arr[i];
      }
    }
    return big;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Your array: "+Arrays.toString(arr));

    System.out.println("sum of all number in array: "+sum(arr));
    System.out.println("average of elemetn in array: "+avg(arr));
    System.out.println("biggest element in you array is: "+max(arr));
    sc.close();
    
  }
}
