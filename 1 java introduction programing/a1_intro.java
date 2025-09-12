import java.util.Scanner;
public class a1_intro {

  public static void main(String[] args){
    // System.out.println("Enter the year");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number you want: ");
    int n = sc.nextInt();
    boolean isPrime= true;
    if(n<=1){
      isPrime=false;
    }
    for(int i=2;i<n;i++){
      if(n%i==0){
        isPrime=false;
        break;
      }
    }
    if(isPrime){
      System.out.println(n+" is a prime number");
    }
    else{
      System.out.println(n+" is not a prime number");
    }
  }  
}
