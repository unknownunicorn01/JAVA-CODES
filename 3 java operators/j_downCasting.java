public class j_downCasting {
  public static void main(String[] args){
    float a= 1232.343423f;
    int b = (int)a;  //we are telling the we want to convert it into int and have no problem with loosing data
    System.out.println(b);  //it will print 1232 because we convert a into in and stored into b \

    //one excption case
    char ch=97;
    System.out.println(ch);  //output will be a because it will see the ASCI chart

    int val=97;
    char ch2= (char) val; //in this we have to specify convert into character because in this it will check from another datatype
    System.out.println(ch2); //this will also print a 
  }
}
