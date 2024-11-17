import java.util.Scanner;
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* My explain

*/
/*Pseudocode
function isPrime(num):
    for i from 2 to squareRoot(num):
        if num % i == 0:
            return false
    return true

function main():
    print "Enter a natural even number (>4):"
    n = read input as integer

    if n % 2 == 1 or n <= 4:
        print "error"
        return

    # Part a: Find two primes that sum up to n
    p1, p2 = 0, 0
    for i from 2 to n-1:
        if isPrime(i) and isPrime(n - i):
            p1 = i
            p2 = n - i
            break
    print n + "=" + p1 + "+" + p2

    # Part b: Find two primes such that one is n plus another prime
    p3, p4 = 0, 0
    for i from 2 to 100_000_000:
        if isPrime(n + i) and isPrime(i):
            p3 = n + i
            p4 = i
            print n + "=" + p3 + "-" + p4
            break

    # Part c: Count prime numbers less than n
    count = 1
    for i from 3 to n-1 step 2:
        if isPrime(i):
            count ++
    print count + " prime numbers in [2,n)"

    # Part d: Prime factorization of n:
    index = 2
    print n + "=" + 2
    n=n/2
    while n > 1:
         If indes divides n and n % index == 0:
            print "*" + index
            n = n / index
        else:
            index = index++
 */
public class Main {
    static boolean isprime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a natural even number (>4):");//Input even number bigger than 4
        int n = scanner.nextInt();
        long start= nanoTime();
        if(n%2==1||n<=4) {
            System.out.println("error");
            return;
        }
        //a
        int p1=0,p2=0;
        for (int i = 2; i < n; i++)
        {
            if ((isprime(i)) && (isprime(n - i)))
            {
                p1 = i;
                p2 = n - i;
                break;
            }
        }
        System.out.println(n + "=" + p1 + "+" + p2);
        //b
        int p4, p3;
        for (int i = 2; i < 100_000_000; i++) {
            if (isprime(n + i) && isprime(i)) {
                p3 = n + i;
                p4 = i;
                System.out.println(n + "=" + p3 + "-" + p4);
                break;
            }
        }
        //c
        int count = 1;
        for (int i = 3; i < n; i+=2)

            if (isprime(i))
                count++;

        System.out.println(count + " prime numbers in [2," + n + ")");
        //d
        int index = 2;
        System.out.print(n + "=" +2);
        n=n/2;
        while (n > 1)
            if (isprime(index) && n % index == 0) {
                System.out.print("*" + index);
                n = n / index;
            } else
                index++;

        //e
        System.out.println();
        System.out.println("207302456");
        //f
        long end = nanoTime();
        double duration = (end - start) / 1_000_000_000.0;//seconds
        System.out.println(duration + " seconds");
    }
}