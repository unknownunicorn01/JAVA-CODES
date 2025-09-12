import java.util.*;
public class b_problem8 {
  public static int func(int[] arr, int num){
    int count = 0;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]+arr[i+1]==num){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Your array: "+ Arrays.toString(arr));
    System.out.println("Enter the number you want to search: ");
    int num = sc.nextInt();
    System.out.println(func(arr,num));
    sc.close();
  }
}
