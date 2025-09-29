import java.util.*;
public class b1_problem {
  public static int countWords(String str){
    boolean check = true;
    int count = 0;
    for(int i=1;i<str.length();i++){
      if(str.charAt(0) != ' ' && check){
        count++;
        check = false;
        continue;
      }
      if(str.charAt(i-1) == ' ' && str.charAt(i) != ' '){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t>0){
      String str = sc.nextLine();
      System.out.println(countWords(str));
      t--;
    }
    sc.close();
  }
}
