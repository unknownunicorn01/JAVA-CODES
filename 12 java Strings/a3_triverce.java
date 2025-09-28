public class a3_triverce {
  public static void main(String[] args){
    String str = "Hellow world";
    for(int i=0;i<str.length();i++){
      System.out.println(str.charAt(i)); // it will print evenry value of index i
    }
    // accessing every subString in string
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<=str.length();j++){
        System.out.print(str.substring(i,j)+ " ");
      }
    }
  }
}