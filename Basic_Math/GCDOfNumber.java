import java.util.Scanner;

public class GCDOfNumber {
    public static int GCD(int x, int y) {
        for( int i = Math.min(x, y); i > 0; i--){
            if (x % i == 0 && y % i == 0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        System.out.print("Enter a number: ");
        int y = scanner.nextInt();

        System.out.println("GCD of "+ x + " and "+ y + " is: "+ GCD(x, y));
        scanner.close();
    }
}
