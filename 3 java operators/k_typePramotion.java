public class k_typePramotion {
  public static void main(String[] args){
    int a=23;
    char b= 'a';
    System.out.println(a+b);  //output will be 120 because it will convert a string into its ascii code which is 97 and will add 23 to 97 and will return 120 which is an int value
    System.out.println(b);
    byte a1= 20;
    float b1=23;
    short c1=33;
    int ans=(int)(a1+b1+c1);  //automaticly java will convert it into float because it dont want to lose any information, but we can convert it into what we want by explisit convertion 

    System.out.println(ans); 
    
    byte a2=11;
    byte b2=2;
    int c2=3;
    char d2='a';  //chat is the small size datatype then int, the value of a in ascii chart is 97 so in addition the value will be added 
    byte ans2= (byte)(a2+b2+c2+d2);  //java will automaticly convert it into int datatypr but we want the answer in byte so we will convert it manully
    System.out.println(ans2);  //it will print 113 in byte datatype 


    //java tries to store the value in the biggest data type because it dont want the value to lose the data
  }
}
