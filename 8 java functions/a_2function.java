public class a_2function{
  public static void memorySpace(){  //here we created the function 
    //this is the function which is not inbuilt in java we make them and can give them a return type
    
    System.out.println("Total space: "+ Runtime.getRuntime().totalMemory());
  }
  public static void main(String[] args){
    System.out.println("code started");
    memorySpace();  //here we call the function 

    System.out.println("code ended");
  }
}