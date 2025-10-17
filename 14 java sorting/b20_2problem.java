import java.util.*;
public class b20_2problem {
  public static int Solution(int n,int[] bag, int[] rocks, int k){
    for(int i=1;i<n;i++){
      for(int j=0;j<n-i;j++){
        if((bag[j] - rocks[j]) >= (bag[j+1] - rocks[j+1])){
          int temp = bag[j+1];
          bag[j+1] = bag[j];
          bag[j] = temp;

          temp = rocks[j+1];
          rocks[j+1] = rocks[j];
          rocks[j] = temp;
        }
      }
    }
    int count = 0;
    for(int i=0;i<n;i++){
      k = k -(bag[i] - rocks[i]);
      if(k >= 0){
        count++;
      }else{
        return count;
      }
    }
    return count++;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]  bag = new int[n];
    int[] rocks = new int[n];
    for(int i=0;i<n;i++){
      bag[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      rocks[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(Solution(n,bag,rocks,k));
    sc.close();
  }
}
