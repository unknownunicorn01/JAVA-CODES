public class a4_StringBuilder {
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder("Shikhar");
    System.out.println(sb.length());  //this will println the length of the string builder

    // for triversing the stringbuilder
    for(int i=0;i<sb.length();i++){
      System.out.println(sb.charAt(i));
    }

    // to convert string builder into string
    
    String str = sb.toString();
    System.out.println(str); // not this string contain the value of the stringbuilder as a string

  }
  
}
