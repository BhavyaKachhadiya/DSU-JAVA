import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (1-7) :: ");
        int ans = scanner.nextInt();
        scanner.close();
        switch (ans) {
            case 1:
                System.out.print("sunday");
                break;
            case 2:
                System.out.print("monday");
                break;
            case 3:
                System.out.print("tuesday");
                break;
            case 4:
                System.out.print("wednesday");
                break;
            case 5:
                System.out.print("thursday");
                break;
            case 6:
                System.out.print("friday");
                break;
            case 7:
                System.out.print("saturday");
                break;
        
            default:
            System.out.print("Please enter number from 1 to 7.");
                break;
        }
    }
}