import java.util.Scanner;

class RecursivePrimeCheck {
    // Recursive method to check if a number is prime
    public static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        if (divisor == number) {
            return true; // If code reached the number itself, it's prime
        }
        if (number % divisor == 0) {
            return false; // If divisible, it's not prime
        }
        return isPrime(number, divisor + 1); // Move to the next divisor
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Infinite loop to keep asking for numbers
            System.out.print("Enter a number (-1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Exiting program...");
                break; // Stop the loop if user enters -1
            }

            // Start checking from 2 up to the number
            if (RecursivePrimeCheck.isPrime(number, 2)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
