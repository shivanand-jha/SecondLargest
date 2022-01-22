import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        if(isPrime(x))
            System.out.println(x+" is prime number");
        else
            System.out.println(x+" is not a prime number ");
    }
    static boolean isPrime(int n)
    {
        for (int i = 2; i < n/2; i++) {
            if (n % i== 0)
            {
                return false;
            }
        }
        return true;
    }
}
