import java.util.*;
public class b4_problem {
  public static int getIndex(int n,int[] arr,int targ) {
    Arrays.sort(arr);
    int count = 0;
    for(int i=0;i<n;i++){
      if(arr[i] == targ){
        break;
      }
      count++;
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int targ = sc.nextInt();

    System.out.println(getIndex(n,arr,targ));
    sc.close();
  }
}