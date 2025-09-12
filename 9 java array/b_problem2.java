import java.util.*;
public class b_problem2 {
  public static int linearSearch(int targ,int[] arr){
    for(int i=arr.length-1;i>=0;i--){
      if(arr[i]==targ){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("how many element you want in you array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the number you want to fund: ");
    int targ = sc.nextInt();
    System.out.println(linearSearch(targ, arr));
    sc.close();
  }
}
