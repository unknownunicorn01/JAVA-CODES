import java.util.*;
public class a_input{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  //we write this to tell the we will take input using sc as a scanner
    int age = sc.nextInt(); //we write this for int
    byte age2 = sc.nextByte(); //we write this for bye
    short age3 = sc.nextShort(); //we write this for short
    float age4 = sc.nextFloat(); //we write this for float
    double age5 = sc.nextDouble(); //we write this for double
    String age6 = sc.next(); //we write this for String until blank space
    String age7 = sc.nextLine(); //we write this for String
    char age8 = sc.next().charAt(0); // we write it for geting a index value
  }
}