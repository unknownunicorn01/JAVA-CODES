import java.util.*;
public class b5_problem {
  public static void subString(String str){
    for(int i=0;i<str.length();i++){
      for(int j=i;j<=str.length();j++){
        System.out.println(str.substring(i,j));
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    subString(str);
    // for(int i=0;i<str.length();i++){
    //   for(int j=i;j<=str.length();j++){
    //     System.out.println(str.substring(i,j));
    //   }
    // }
    sc.close();
  }
}
