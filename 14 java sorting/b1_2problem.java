import java.util.*;
public class b1_2problem {
  public static int maxElement(int n, int[] arr){
    for(int i=1;i<n;i++){
      boolean isThere = false;
      for(int j=0;j<n-i;j++){
        if(arr[j]> arr[j+1]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          isThere = true;
        }
      }
      if(isThere == false){
        break;
      }
    }
    int count = 0;
    int countEle = 0;
    int ele = arr[0];
    for(int i=0;i<n-1;i++){
      if(arr[i] == arr[i+1]){
        count++;
      }
      if(count > countEle){
        countEle = count;
        ele = arr[i];
        count = 0;
      }
    }
    return ele;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    for(int i=0;i<n;i++){
      num[i] = sc.nextInt();
    }
    System.out.println(maxElement(n,num));
    sc.close();
  }
}
