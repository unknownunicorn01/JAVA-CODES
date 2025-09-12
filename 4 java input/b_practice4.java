//calculate the simple interest where you will take input the rate, time and principal value
import java.util.Scanner;
public class b_practice4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you princilal value : ");
    Float P  = sc.nextFloat();
    System.out.println("Enter the time given : ");
    int T  = sc.nextInt();
    System.out.println("Enter the rate of you interest : ");
    Float R  = sc.nextFloat();

    System.out.println("Simple interest = " + (float) Math.round(P*T*R)/100);
    sc.close();

  }
}