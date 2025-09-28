public class a3_subString {
  public static void main(String[] args){
    String str = "hellow world";
    System.out.println(str.substring(1,3)); // last index will be excludes and first will be include
    System.out.println(str.substring(2,str.length())); //all the value fron index 2 will be printed;
    System.out.println(str.substring(2)); // we can also write the above statement like this
    System.out.println(str.substring(0)); //this will print all the value of string from index 0
  }
}
