import java.util.*;
public class b_problem4 {
  public static int threeSum(ArrayList<Integer> list, int n,int targ){
    Collections.sort(list);
    int res=0;
    for(int i=0;i<n;i++){
      int num = i;
      int left = i+1;
      int right = n-1;
      while(left<right){
        if(i == right){
          right--;
          continue;
        }
        else if(i == left){
          left++;
          continue;
        }
        int total = list.get(num)+list.get(right)+list.get(left);
        if(total == targ){
          res++;
          left++;
          right--;
        }
        else if(total<targ){
          left++;
        }
        else{
          right--;
        }
      }
    }
    return res;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
      int n = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<>();
      for(int j=0;j<n;j++){
        list.add(sc.nextInt());
      }
      int targ = sc.nextInt();
    
      int result = threeSum(list,n,targ);
      System.out.println(result);
    }
    sc.close();
  }
}

/*
  1
  10
  -5 -4 -3 -2 -1 0 1 2 3 4 
  0

 */