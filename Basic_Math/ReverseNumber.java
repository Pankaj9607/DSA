import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n){
        int rev = 0;

        while(n > 0){
            int ld = n % 10;

            rev = (rev * 10) + ld;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.println("Reversed number: " + reverseNumber(n));
        scanner.close();
    }
}
