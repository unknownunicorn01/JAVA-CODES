import java.util.*;
public class e_problem9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    // if(a=="A" || a=="B" || a=="C" || a=="D" || a=="E" || a=="F" || a=="G" || a=="H" || a=="I" || a=="J" || a=="K" || a=="L" || a=="M" || a=="N" || a=="O" || a=="P" || a=="Q" || a=="R" || a=="S" || a=="T" || a=="U" || a=="V" || a=="W" || a=="X" || a=="Y" || a=="Z"){
    //   System.out.println("0");
    // }
    String cap= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String small = cap.toLowerCase();
    if(cap.contains(a)){
      System.out.println("1");
    }
    else if(small.contains(a)){
      System.out.println("0");
    }
    else{
      System.out.println("-1");
    }
    sc.close();
  }
}
