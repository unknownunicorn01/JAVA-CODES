import java.util.*;
public class b8_problem{
  public static void subStrings(StringBuilder sb){
    for(int i=0;i<sb.length();i++){
      for(int j=i+1;j<=sb.length();j++){
        System.out.println(sb.substring(i,j));
        // System.out.println();
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    subStrings(sb);
    sc.close();
  }
}