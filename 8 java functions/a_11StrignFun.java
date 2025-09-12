import java.util.*;
public class a_11StrignFun {
  static String StrFun(String name){
    return name+" is a Suber Hero";
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(StrFun(name));
    sc.close();
  }
}
