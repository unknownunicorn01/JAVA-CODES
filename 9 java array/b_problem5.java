import java.util.*;
public class b_problem5 {
  public static int linearSearch(int[] arr){
    int num = 0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>35){
        num++;
      }
    }
    return num;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n ;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Your array: "+ Arrays.toString(arr));
    System.out.println(linearSearch(arr));
    sc.close();
  }
}
