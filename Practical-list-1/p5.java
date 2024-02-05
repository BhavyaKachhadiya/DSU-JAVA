import java.util.Scanner;
public class p5 {    
    public static void main(String[] args) {
        System.out.print("Enter number A:: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        System.out.print("Enter number B:: ");
        int b = scanner.nextInt();
        scanner.close();


        System.out.println("A = "+a+" B = "+b);
        System.out.println("A + B = "+(a+b));
        System.out.println("A - B = "+(a-b));
        System.out.println("A * B = "+(a*b));
        System.out.println("A / B = "+(a/b));
        System.out.println("A % B = "+(a%b));
    }
}