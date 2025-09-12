import java.util.*;
public class b_problem20 {
  public static void func(int[] arr){
    int n = arr.length;

    Arrays.sort(arr);

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(int k=j+1;k<n;k++){
          if(arr[j]*arr[j]==arr[k]*arr[i]){
            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
          }
        }
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    func(arr);
    sc.close();
  } 
}
