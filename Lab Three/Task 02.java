import java.util.Scanner;

public class lab3prt2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending number: ");
        int end = sc.nextInt();

        int size = Math.max(0, end - start + 1);
        int[] primeArray = new int[size];

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeArray[count] = i;
                count++;
            }
        }

        System.out.println("Prime numbers in the range:");

        for (int i = 0; i < count; i++) {
            System.out.print(primeArray[i] + " ");
        }

        sc.close();
    }

    // Prime check function
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
