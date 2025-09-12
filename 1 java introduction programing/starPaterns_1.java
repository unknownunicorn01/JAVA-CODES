// import java.util.*;
// public class hello {
//   public static void main(String[] args){
//     System.out.print("hello");
//     System.out.println(" world");
//     System.out.print("this is on next line");
//   }
// }


import java.util.*;
import java.io.*;

public class starPaterns_1 {
    public static void main(String args[]) {
        //your code here
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}