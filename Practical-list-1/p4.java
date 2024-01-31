import java.util.Scanner;

public class p4 {
    public static void main(String[] s) {
        Scanner getNumber = new Scanner(System.in);
        System.out.print("Enter Number :: ");
        int num = getNumber.nextInt();
        getNumber.close();

        int revNum =0;

        while (num != 0) {
            int lastDigit = num%10;

            revNum = revNum*10 + lastDigit;

            num /= 10;
        }

        System.out.print("Rev num is :: "+revNum);
    }
}