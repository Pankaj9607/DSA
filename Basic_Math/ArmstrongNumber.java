import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean armstrong(int x){
        int k = 0; //number of digits
        int n = x;
        int num = x;
        int sum = 0;
        while (x > 0){
            k = k + 1;
            x = x / 10;
        }

        while(n > 0){
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n = n / 10;
        }
        return (sum == num) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        if (armstrong(x)){
            System.out.println(x + " is an Armstrong number.");
        }
        else{
            System.out.println(x + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
