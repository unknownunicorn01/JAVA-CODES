public class d_useCaseOfPlus{
  public static void main(String[] args){
    System.out.println(12+15);  //output will be 27 because it will add
    System.out.println("12"+"15");  //output will be 1215 because the both are string and will concatinate
    System.out.println(12+"15"); //output will be 1215 because one of them is string so they will concatinate
    System.out.println("12"+15);  //output will be again 1215 because one of the is string
    System.out.println(12+15+"12+15"+12+15);  //output will be 2712+1527 because 12 and 15 will add out side the string because they are integer and 12 and 15 inside string will print as it is because the are string 
    
  }
}
