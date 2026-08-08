import java.util.Scanner;
public class greatestnum{
  public static void main (String[]args){


    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter a value of a :");
     int a = sc.nextInt();
   
  System.out.println("Enter a value of b :");
     int b = sc.nextInt();
      
           System.out.println("Enter a value of c :");
             int c = sc.nextInt();
   ;
    if(a>b && a>c){
        System.out.println("a is greatest");
    }
else if(b>a && b>c){
    System.out.println("b is greatest");
}
else {
    System.out.println("c is greatest");
 } 
  }
}
