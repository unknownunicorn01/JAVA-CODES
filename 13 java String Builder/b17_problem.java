import java.util.*;
public class b17_problem {
  public static StringBuilder Solution(String str){
    StringBuilder sb = new StringBuilder(str);
    sb.insert(0,'[');
    for(int i=0;i<sb.length();i++){
      if(sb.charAt(i) == ','){
        sb.insert(i, ' ');
        sb.insert(i+2, ' ');
        i++;
      }
    }
    sb.insert(sb.length(),']');
    return sb;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    sc.nextLine();
    while(test>0){
      String sb = sc.nextLine();
      System.out.println(Solution(sb));
    }
    sc.close();
  }
}
