import java.util.*;
public class b13_problem {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder("");
    sb.append("H");
    for(int i=0;i<(str.length()-2)*2;i++){
      sb.append("e");
    }
    sb.append("y");
    System.out.println(sb);
    sc.close();
  }
}
