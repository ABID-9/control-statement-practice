import java.util.Scanner;
public class threedigit {
    public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("enter the width : ");
int n = sc.nextInt();
if (n>99 && n<1000){
System.out.println("its a three digit number");
}
else {
System.out.println("its not three digit number");

}
   }

    
}
