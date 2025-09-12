import java.util.*;
public class a_3userInputArray {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num[] = new int[n];
    for(int i=0;i<=n-1;i++){
      // int n2 = sc.nextInt();
      // num[i] = n2;
      num[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(num));
    // for(int val : num){
    //   System.out.println(val);
    // }
    Arrays.sort(num);
    System.out.println(num[num.length-1]);
    sc.close();
  }
}
