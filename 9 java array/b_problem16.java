import java.util.*;
class solution{
  public int func(int[] arr, int k){
    int n = arr.length;
    int count = 0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(arr[i] - arr[j] == k){
          count++;
        }
        j++;
      }
    }
    if(count == 0 ) return 0;
    else{
      return count;
    }
  }
}
public class b_problem16 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n;i++){
      arr[i] = sc.nextInt();
    }
    solution obj = new solution();
    System.out.println(obj.func(arr, k));
    sc.close();
  }
}
