import java.util.*;
public class b_problem1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<n;i++){
      int val = sc.nextInt();
      boolean found_val = true;
      for(int j=2;j<val;j++){
        if(val!=2 && val%j==0 && found_val == true){
          found_val = false;
        }
      }
      if(found_val){
        list.add(val);
      }
    }
    for(int val: list){
      System.out.print(val+" ");
    }
    sc.close();
  }
}
