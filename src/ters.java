import java.util.Scanner;

public class ters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = scan.nextInt();

        System.out.print("the reverse of the number you entered = ");
        while (number > 0) {

            System.out.print(number % 10);
            number /= 10;
        }
    }
}