public class f_unaryOperator{
  public static void main(String[] args){
    int a=10;
    System.out.println(a++);  //will print 10 because first it will use then change
    System.out.println(a);  //it will println 11 because the value is changes, output=11

    System.out.println(++a);  //it will change the value in this only because it is pre incriment, output will be a=12
    System.out.println(a);  // output will be 12


    // same gose for pre decriment and post decriment
    System.out.println(a--);  //output will be 12
    System.out.println(a); //output will be 11

    System.out.println(--a);  //output will be 10
    System.out.println(a);  //output will be 10
  }
  
}
