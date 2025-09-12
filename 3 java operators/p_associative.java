public class p_associative{
  public static void main(String[] args){
    int a=5,b=25,c=5;
    int d=a+b-c;  //in this associative property will go from left to right
    a+=b+c;  //this will follow associative property from right to left 
    System.out.println(d);
    System.out.println(a);
  }
  
}
