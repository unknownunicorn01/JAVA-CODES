import java.util.*;
public class b_problem13 {
  public static int func(int[] arr){
    int n = arr.length;
    int count = 0;
    int small = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]%2==0 && arr[i]>0){
        count++;
      }
      for(int j=0;j<n;j++){
        if(arr[i]%2!=0 || arr[j]%2!=0 || arr[i]<=0){
          continue;
        }
        else{
          if(i!=j && Math.abs(j-i)<small){
            small = Math.abs(j-i);
          }
          else{
            continue;
          }
        }
      }
    }
    if(count<=1) return -1;
    else{
      return small;
    }
    
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int res = func(arr);
    System.out.println(res);
    sc.close();
  }
}
