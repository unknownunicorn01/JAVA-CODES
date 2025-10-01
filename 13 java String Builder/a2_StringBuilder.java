public class a2_StringBuilder {
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder("shikhar");
    // to get a value of a index
    System.out.println(sb.charAt(0)); // output will be s
    
    // to append
    sb.append(" Dutta");
    
    System.out.println(sb);  // Dutta will be append in the end of the string builder
    //to get a value in index
    sb.setCharAt(0,'S'); // lowercase s will e replaced by upper case S
    System.out.println(sb);

  }
}
