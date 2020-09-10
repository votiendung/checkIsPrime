import java.util.Scanner;

public class CheckSoNguyeTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number < 2) {
            System.out.println(number + "is not prime");
        }else {
            for (int i = 2; i < Math.sqrt(number); i++ ) {
                if(number%i == 0) {
                    System.out.println(number + "is not prime");
                }else {
                    System.out.println(number + "is a prime");
                }
            }
        }
    }
}
