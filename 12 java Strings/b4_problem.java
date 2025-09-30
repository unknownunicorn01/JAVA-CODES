import java.util.*;
public class b4_problem {
  public static String camelCase(String str){
    String str2 = "";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i) == '_'){
        continue;
      }
      if(i==0 && str.charAt(i) != '_'){
        str2 +=str.charAt(i);
      }
      else if(i!=0 && str.charAt(i-1)=='_'){
        str2 += str.substring(i,i+1).toUpperCase();
      }
      else{
        str2 += str.charAt(i);
      }
    }
    return str2;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t>0){
      String str = sc.nextLine();
      System.out.println(camelCase(str));
      t--;
    }
    sc.close(); 
  }
}
