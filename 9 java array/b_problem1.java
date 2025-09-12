import java.util.*;
public class b_problem1 {
  public static void linearSearch(int[] arr,int targ){
    boolean isThere = false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==targ){
        System.out.print(i+" ");
        isThere = true;
      }
    }
    if(isThere == false){
      System.out.println("-1");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("enter the number you want to search: ");
    int targ = sc.nextInt();
    linearSearch(arr, targ);
    sc.close();
  }
}
