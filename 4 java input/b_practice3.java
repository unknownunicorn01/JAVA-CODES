import java.util.Scanner;
public class b_practice3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int pi=3;
    Long radius = sc.nextLong();
    System.out.println((pi*(radius*radius)));
    System.out.println(2*pi*radius);
    sc.close();
  }
}