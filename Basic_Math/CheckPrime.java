import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n) {
        int cnt = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        if (cnt == 2){
            return true;
        }
        else{
        return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n  = scanner.nextInt();

        if (isPrime(n) == true){
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not prime.");
        }
        scanner.close();
    }
}
