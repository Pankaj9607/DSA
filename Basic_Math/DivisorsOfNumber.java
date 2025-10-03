import java.util.Scanner;

class DivisorsOfNumber {
    public static int[] divisorsOfNumber(int n, int[] size){
        int[] divisors = new int[n];
        int count = 0;
        
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                divisors[count++] = i;
            }
        }
        size[0] = count;
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int[] size = new int[1];
        int[] divisors = divisorsOfNumber(n, size);

        System.out.print("Divisors of "+ n +" are: ");
        for (int i = 0; i < size[0]; i++){
            System.out.print(divisors[i] + " ");
        } 
        System.out.println();
        divisors = null;
        scanner.close();
    }
}