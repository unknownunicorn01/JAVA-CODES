public class a1_StringBuilder{
  public static void main(String[] args){
    //1 way to initilize a stringbuilder
    StringBuilder sb = new StringBuilder("shikhar");
    // 2nd way to initlize a string builder
    String str = "Shikhar";
    StringBuilder sb2 = new StringBuilder(str);
    System.out.println(sb);
    System.out.println(sb2);
  }
}