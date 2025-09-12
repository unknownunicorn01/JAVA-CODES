import java.util.*;
public class b_problem6 {
  public static void func(int[] arr, int[] arr2){
    int sum= 0;
    int sum2= 0;
    for(int i=0;i<arr.length;i++){
      sum = sum + arr[i];
    }
    for(int i=0;i<arr2.length;i++){
      sum2 = sum2 + arr2[i];
    }
    if(sum>sum2){
      System.out.println("First array is larger");
    }
    else if(sum2>sum){
      System.out.println("Second array is larger");
    }
    else{
      System.out.println("Both are equal");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0; i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    func(arr, arr2);
    sc.close();
  }
}
