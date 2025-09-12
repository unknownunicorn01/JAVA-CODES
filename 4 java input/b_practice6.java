import java.util.*;
public class b_practice6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float C = sc.nextFloat();
    double F = Math.round(((C*9/5)+32));
    System.out.printf("%.3f",F);
    sc.close();
  }
}