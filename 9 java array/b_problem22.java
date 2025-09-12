import java.util.*;
public class b_problem22 {
  public static int func(int[] arr, int k ){
    int n = arr.length;
    int pair = 0;
    int count = 0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        pair = arr[i] + arr[j];
        if(pair%k == 0){
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(func(arr,k));
    sc.close();
  }
}
