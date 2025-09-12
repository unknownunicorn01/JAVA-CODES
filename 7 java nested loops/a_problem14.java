import java.util.*;
public class a_problem14{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isPrime = false;
    for(int i=2;i<=n;i++){
      for(int j=2;j<i;j++){
        if(i%j==0){
          isPrime=false;
          break;
        }
        else{
          isPrime=true;
        }
      }
      if(i==2){
        System.out.println("2");
      }
      if(isPrime==true){
        System.out.println(i);
      }
    }
    sc.close();
  }
}