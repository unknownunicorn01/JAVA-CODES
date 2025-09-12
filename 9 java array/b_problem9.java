import java.util.*;
public class b_problem9 {
  public static void func(int[] arr, int[] arr2){
    int small;
    if(arr.length<arr2.length){
      small=arr.length;
    }
    else{
      small=arr2.length;
    }
   int big;
   if(arr.length>=arr2.length){
    big = arr.length;
   }
   else{
    big = arr2.length;
   }
   int big2 = big;
   if(arr.length>arr2.length){
    for(int i=0;i<big;i++){
      if(big2-small>0){
        System.out.println(arr[i]);
        big2 --;
        // System.out.println(big);
      }
      else{
        int idx=0;
        System.out.println(arr[i]+arr2[big2-small+idx]);
        idx++;
      }
    }
   }
   if(arr2.length>arr.length){
      for(int i=0;i<big;i++){
        if(big2 - small>0){
          System.out.println(arr2[i]);
          big2 --;
          // System.out.println(big);
        }
        else{
          int idx=0;
          System.out.println(arr[big2-small+idx]+arr2[i]);
          idx++;
        }
      }
    }
    if(arr2.length == arr.length){
      for(int i=0;i<big;i++){
        System.out.println(arr[i]+arr2[i]);
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
    System.out.println("Your first array: "+Arrays.toString(arr));
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    System.out.println("Your second array: "+Arrays.toString(arr2));
    func(arr, arr2);
    sc.close();
  }
}
