import java.util.Scanner;
public class area {
    public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("enter the width : ");
int a = sc.nextInt();
System.out.println("enter the height value : ");
int b = sc.nextInt();
float area;
float perimeter;

area = a*b;
 perimeter = 2*(a*b);
System.out.println("area is ;" +area);
System.out.println("perimeter is :" +perimeter);

if (area>perimeter){

    System.out.println("Area is greater");
}
else {
    System.out.println("perimeter is greater");
}
    }
    
}
