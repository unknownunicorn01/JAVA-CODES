import java.util.*;
public class b_problem10_2 {
  public static int[] func(int[] arr, int[] arr2){
    int i = arr.length-1;
    int j = arr2.length-1;
    int k = Math.max(i,j);
    
    int[] arr3 = new int[k+1];
    int carry = 0;
    
    while(k>=0){
      int dig = 0;
      dig = dig+carry;
      if(i>=0) dig += arr[i];
      if(j>=0) dig += arr2[j];
      arr3[k] = (dig)%10;

      carry = dig/10;
      k--;
      i--;
      j--;
    }
    if(carry == 0 ) return arr3;
    else{
      int[] ans = new int[arr3.length+1];
      ans[0] = carry;
      for(int idx=1;idx<=arr3.length;idx++){
        ans[idx] = arr3[idx-1];
      }
      return ans;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt(); 
    }
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt(); 
    }
    int[] res=func(arr, arr2);
    for(int i : res){
      System.out.println(i);
    };
    sc.close();

  }
}
