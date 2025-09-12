import java.util.Scanner;
public class b_practice2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String agentName = sc.nextLine();
    System.out.println("Hi my name is Agent " + agentName);
    sc.close();
  }
}