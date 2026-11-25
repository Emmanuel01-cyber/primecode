import java.util.ArrayList;
import java.util.List;

class PrimeChecker {

    // Returns true if n is a prime number
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        int limit = 500;
        List<Integer> primes = new ArrayList<>();

        for (int num = 0; num <= limit; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }

            // Show percentage completed (\r rewrites the same line)
            int percent = (num * 100) / limit;
            System.out.print("\rProgress: " + percent + "% completed");

            // Small delay so the percentage is visible while running
            Thread.sleep(20);
        }

        System.out.println("\n\nPrime numbers between 0 and " + limit + ":");
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println("\n\nTotal primes found: " + primes.size());
    }
}
