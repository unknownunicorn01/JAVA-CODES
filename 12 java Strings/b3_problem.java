import java.util.*;
public class b3_problem {
  public static String isPangram(String str){
    String alp = "abcdefghijklmnopqrstuvwxyz";
    str = str.toLowerCase();
    for(int i=0;i<26;i++){
      if(str.contains(alp.substring(i,i+1)) == false){
        return "not pangram";
      }
    }
    return "pangram";
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(isPangram(str));
    sc.close();
  }
}
