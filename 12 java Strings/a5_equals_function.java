public class a5_equals_function {
  public static void main(String[] args){
    String str1 = "Shikhar";
    String str3 = new String("Shikhar");
    if(str1 == str3){
      System.out.println("ture");
    }
    else{
      System.out.println("false");  // it will return false becaues this is not the correct way to compait strings
    }

    if(str1.equals(str3)){
      System.out.println("true");  // this is the correct way to compair strings
    }
    else{
      System.out.println("false");
    }
  }
}
