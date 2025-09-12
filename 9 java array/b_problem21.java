import java.util.*;
public class b_problem21 {
  public static int func(int[] arr){
    // Arrays.sort(arr);
    int n = arr.length;
    int sum = 0;
    int large = 0;
    for(int i=0;i<n;i++){
      sum = 0;
      for(int j=i;j<n;j++){
        sum = sum+ arr[j];
        if(large<sum){
          large = sum;
        }

      }
    }
    return large;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(func(arr));
    sc.close();
  }
}
