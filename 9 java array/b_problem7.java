import java.util.*;
public class b_problem7 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int big = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>=big){
        big = arr[i];
      }
    }
    System.out.println("Biggest element in array: "+big);
    for(int big2=big ; big2>=1 ; big2--){
      for(int j=0;j<arr.length;j++){
        if(big2-arr[j]>0){
          System.out.print("\t");
        }
        else{
          System.out.print("*\t");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}

