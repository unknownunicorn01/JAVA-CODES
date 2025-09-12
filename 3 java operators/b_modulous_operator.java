public class b_modulous_operator {
  public static void main(String[] args){
    System.out.println(23%2);  // will print 1
    System.out.println(20%2); //will print 0 because 20 is compleatly devesible by 2
    System.out.println(-20%8);  // will print -4 because it is deveided by a minus so the output will also be in minus
    //range of the remender will always be [0,b-1], because it can not be equal or more the the devisent
    System.out.println(1%20);  //remender will be 1
    System.out.println(2%20);  //remender will be 2
    System.out.println(12345/10); //because we deveide int value by 10 and int value dont return float value
    //it will remove last value in the number and not print the last value of the number
  }
}
