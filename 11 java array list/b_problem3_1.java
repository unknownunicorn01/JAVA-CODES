//aim to find the number given by rows and collonms in pascalls triangle
import java.util.*;
public class b_problem3_1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int res = 1;
    int n = sc.nextInt();
    int r = sc.nextInt();
    

    for(int i=0;i<r;i++){
      res = res * (n-i);
      res = res/(i+1);
    }
    if(r==0){
      System.out.println(res);
    }
    else{
      System.out.println(res);
    }
    sc.close();
  }
}
