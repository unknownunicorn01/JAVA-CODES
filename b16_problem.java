import java.util.*;
public class b16_problem {
  public static StringBuilder timeConverter(StringBuilder sb){
    StringBuilder str = new StringBuilder("");
    int a = sb.charAt(0) - '0';
    int b = sb.charAt(1) - '0';
    int num = a*10 + b;
    if(sb.charAt(sb.length()-2) == 'A'){
      if(num == 12){
        str.append("00" + sb.substring(2,sb.length()-2));
      }
      else{
        str.append(sb.substring(0,sb.length() - 2));
      }
      return str;
    }
    if(num == 12){
      str.append(num + sb.substring(2,sb.length()-2));
      return str;
    }
    num = num + 12;
    str.append(num + sb.substring(2,sb.length()-2));
    return str;

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    System.out.println(timeConverter(sb));
    sc.close();
  }
}
