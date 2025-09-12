public class n_logicalOperator{
  public static void main(String[] args){
    //int this we will learn about logical operator in java
    //there are mainly 3 logical operator
    // && (and operator)  || (OR prerator) and ! (logical operator)
    System.out.println(true && false); //output will be false because one of the condition is false and AND operator check both condition should be true
    System.out.println(false || true); // output will be true because one of the condition is true and OR operator check either one of the condition should be ture  

    System.out.println(!(2>1)); //2>1 is ture but we use ! operator which is logical NOT operator whcih makes true value false and false value true so the output will be false

    System.out.println((2>3) && (23<233)); //output will be false because one of the condition is false and we used logical AND operator &&
    System.out.println((2>2) || (2==2)); //answer will be true because one of the condition is ture and we used OR operator 
  }
  
}
