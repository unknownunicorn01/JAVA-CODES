import java.util.*;

public class b_problem11 {
  public static int[] func(int[] arr, int[] arr2){
    if(arr.length>arr2.length || (arr.length==arr2.length && arr[0]>arr2[0])){
      int i = arr.length-1;
      int j = arr2.length-1;
      int k = Math.max(i,j);
      int[] arr3 = new int[k+1];
      int borrow=0;
      // int carr=y = 0;
      while(k>=0){
        int dig = 0;
        int x = (i>=0 ? arr[i] : 0)-borrow;
        int y = (j>=0 ? arr2[j] : 0);

        if(x<y){
          dig = x+10-y;
          borrow=1;
        }
        else{
          dig = x-y;
          borrow=0;
        }
        arr3[k] =dig;
        i--;
        j--;
        k--;
        }
        return arr3;
      }
      else if(arr2.length>arr.length || (arr.length==arr2.length && arr2[0]>arr[0])){
        int[] temp = arr;
        arr = arr2;
        arr2 = temp;
        int i = arr.length-1;
        int j = arr2.length-1;
        int k = Math.max(i,j);
        int[] arr3 = new int[k+1];
        int borrow=0;
        // int carr=y = 0;
        while(k>=0){
          int dig = 0;
          int x = (i>=0 ? arr[i] : 0)-borrow;
          int y = (j>=0 ? arr2[j] : 0);

          if(x<y){
            dig = x+10-y;
            borrow=1;
          }
          else{
            dig = x-y;
            borrow=0;
          }
          if(k==0){
            dig=(-1)*dig;
          }
          arr3[k] =dig;
          i--;
          j--;
          k--;
        }
        arr2 =arr;
        arr = temp;
        
        return arr3;
      }
      else{
        return arr;
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
    int[] res = func(arr, arr2);
    System.out.println("bellow is the result");
    for(int val : res) System.out.println(val); 
    sc.close();
  }
}
