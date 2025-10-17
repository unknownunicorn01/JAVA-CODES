import java.util.*;
public class b19_problem {
  public static boolean Solution(String str){
    String upper = "qwertyuiop";
    String middle = "asdfghjkl";
    String lower = "zxcvbnm";
    String row = "";
    if(upper.contains(str.substring(0,1))){
      row = upper;
    }
    else if(middle.contains(str.substring(0,1))){
      row = middle;
    }
    else if(lower.contains(str.substring(0,1))){
      row = lower;
    }
    for(int i=1;i<str.length();i++){
      if(!row.contains(str.charAt(i)+"")){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    StringBuilder sb = new StringBuilder("");
    for(int i=0;i<n;i++){
      String str= sc.nextLine();
      if(Solution(str)) sb.append(str+"\n");
    }
    System.out.println(sb);
    sc.close();
  }
}
