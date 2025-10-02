import java.util.*;
public class a1_Bubblesort_boolean{
  public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    int[] arr = {4,8,7,1,-2};
    int n = arr.length;
    for(int i=1;i<n;i++){
      boolean isSwapped = false;
      for(int j=0;j<n-i;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          isSwapped = true;
        }
      }
      if(isSwapped == false){
        break;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}