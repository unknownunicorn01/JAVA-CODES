import java.util.*;
public class c1_problem {
  public static int solution(int n, int[] capacity,int[] rocks , int more_rocks){
    int full_bags = 0;
    for(int i=0;i<n;i++){
      if(capacity[i] > rocks[i]){
        more_rocks = more_rocks - (capacity[i] - rocks[i]);
        if(more_rocks >= 0){
          full_bags++;
        }
      }
      else if(capacity[i] == rocks[i]){
        continue;
      }
      if(full_bags <= 0){
        break;
      }
    }
    return full_bags;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arr2 = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      arr2[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(solution(n,arr,arr2,k));
    sc.close();
  }
}

