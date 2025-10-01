import java.util.*;
public class b3_problem {
  public static StringBuilder findC(String a,String b){
    StringBuilder sb = new StringBuilder("");
    for(int i=0;i<a.length();i++){
      if(a.charAt(i) == b.charAt(i)){
        sb.append("0");
      }
      else{
        sb.append("1");
      }
    }
    return sb;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    System.out.println(findC(a,b));
    sc.close();
  }
}
