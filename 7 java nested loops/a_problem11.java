import java.util.*;
public class a_problem11 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char ch = 'A';
    char ch2 = 'A';
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        // if(ch<'A'){
        //   ch='A';
        // }
        System.out.print(ch+" ");
        ch++;
        if(ch>'Z'){
          ch=(char)(ch-26);
        }
      }  
      ch2++;
      if(ch2>'Z'){
        ch2=(char)(ch2-26);
      }    
      ch=(char)(ch2);
      System.out.println();
    }
    sc.close();
  }
}
