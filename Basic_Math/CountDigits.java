import java.util.Scanner;

class CountDigits{

    public static int countDigits(int n){
        int cnt = 0;
        while(n > 0){
            cnt = cnt + 1;

            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int digits = countDigits(n);
        System.out.println("Number of digits: "+ digits);
        scanner.close();
    }
}