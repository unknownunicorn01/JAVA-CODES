import java.util.*;
public class b_problem19 {
  public static int func(int[] arr,int k){
    int n = arr.length;
    int sum=0;
    int count=0;
    int idx=0;
    for(int i=0;i<n;i++){
      sum = arr[i];
      if(sum%k==0){
        count++;
      }
      for(int j=idx;j<n;j++){
        if(j==i){
          continue;
        }
        sum = sum + arr[j];
        if(sum%k==0){
          count++;
        }
      }
      idx++;
      sum=0;
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
