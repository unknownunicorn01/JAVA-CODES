import java.util.*;
public class b2_problem {
  public static String toggleCase(int n, String str){
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String str2 ="";
    for(int i=0;i<n;i++){
      String val = str.substring(i,i+1);
      if(lower.contains(val)){
        str2 += val.toUpperCase();
      }
      else if(upper.contains(val)){
        str2 += val.toLowerCase();
      }
      else{
        str2 += str.charAt(i);
      }
    }
    return str2;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    
    System.out.println(toggleCase(n,str));
    sc.close();
  }
}
