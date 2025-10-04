import java.util.*;
public class b1_3problem {
  public static int MaxElement(int n, int[] arr){
    int count = 0 ;
    int ele = arr[0];
    int countEle = 0;
    for(int i=1;i<n;i++){
      boolean isThere = false;
      for(int j=0;j<n-i;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      if(isThere == false){
        break;
      }
    }
    return ele;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(MaxElement(n,arr));
    sc.close();
  }
}
