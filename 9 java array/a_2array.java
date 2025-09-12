import java.util.Arrays;

public class a_2array {
  public static void main(String[] args){
    String[] name = new String[5];
    name = new String[]{"shikhar","ayush","uday","shivam","rohit"};
    System.out.println(Arrays.toString(name)); //call array name
    String[] name2 = new String[9];
    System.out.println(Arrays.toString(name2));  //this will print null for all the 9 value because we dont define the string so it initilizes to 0

    System.out.println("Length of array name: "+name.length);
    System.out.println("Length of array name2: "+name2.length);
  }
}
