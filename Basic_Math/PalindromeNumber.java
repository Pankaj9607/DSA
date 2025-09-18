import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;

        while (n > 0){
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }

        if (rev == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check palindrome: ");
        int x = scanner.nextInt();
        if (isPalindrome(x)){
            System.out.println(x + " is a palindrome number.");
        }
        else{
            System.out.println(x + " is not a palindrome number.");
        }
        scanner.close();
    }
}
