import java.util.*;
public class f_problem20 {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String permit = "y";
    int n=0;
    int big=Integer.MIN_VALUE,small=Integer.MAX_VALUE;
    boolean entered=false;

    while(permit.toLowerCase().equals("y")){
      n = sc.nextInt();
      sc.nextLine();  //after you take input from int next input will not work, for solving this issue we write this line
      permit = sc.nextLine();
      entered = true;
      if(n>=big){
        big=n;
      }
      if(small>=n){
        small=n;
      }
    }
    if(entered){
      System.out.println("Largest number: "+big);
      System.out.println("Smallest number: "+small);
    }
    else{
      System.out.println("no input was given");
    }
    sc.close();
  }
}
