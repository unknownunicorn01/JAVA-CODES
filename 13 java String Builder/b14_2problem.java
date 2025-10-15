import java.util.*;
public class b14_2problem {
  public static StringBuilder Solution(String str){
    StringBuilder sb = new StringBuilder("");
    if(str.charAt(0) != '-'){
      sb.append(str.charAt(0));
    }
    for(int i=1;i<str.length();i++){
      if(str.charAt(i-1) == '-'){
        sb.append(str.charAt(i));
      }
    }
    return sb;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(Solution(str));
    sc.close();
  }
}
