public class o_precedence{
  public static void main(String[] args){
    int a=5,b=23,c=2;
    int d=a+b*c;  //multiplication and devide given more preiority then subtraction or addition
    int e=(a+b)*c;  //the bracket is given the most proority 
    System.out.println(d);
    System.out.println(e);
  }
  
}
