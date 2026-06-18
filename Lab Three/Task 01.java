import java.util.Scanner;

public class lab3prt1 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Starting Number: ");
            int start = sc.nextInt();

            System.out.print("Enter Ending Number: ");
            int end = sc.nextInt();

            int size = Math.max(0, end - start + 1);
            int[] evenArray = new int[size];

            int count = 0;
            int currentNumber = start;

            while (currentNumber <= end) {
                if (currentNumber % 2 == 0) {
                    evenArray[count] = currentNumber;
                    count++;
                }
                currentNumber++;
            }

            System.out.println("Even numbers in the range:");

            for (int i = 0; i < count; i++) {
                System.out.print(evenArray[i] + " ");
            }
        }
    }
}
