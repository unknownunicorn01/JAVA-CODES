import java.util.*;
public class b6_problem {
  public static int Palendrome(String str){
    String str2 = str.toLowerCase();
    int start=0, end=str.length()-1;
    while(start<end){
      if(str2.charAt(start) <'a' || str2.charAt(start) > 'z'){
        start++;
        continue;
      }
      else if(str2.charAt(end)>'z' || str2.charAt(end) == 'z'){
        end--;
        continue;
      }
      if(str2.charAt(start) != str2.charAt(end)){
        return 0;
      }
      // System.out.println(str2.charAt(start)+" "+str2.charAt(end));
      end--;
      start++;
    }
    return 1;
    // return str2.length()/2;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(Palendrome(str));
    sc.close();
  }
}
