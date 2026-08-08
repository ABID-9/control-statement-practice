import java.util.Scanner;
public class abasolutevalue {
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter a value ");
 int n = sc.nextInt();
if (n<0){
    n=n*(-1);


}
System.out.println("the abasolute value is "+n);

 }

}
