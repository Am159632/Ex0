import java.util.Scanner;
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* My explain
Function isPrime(num):
The isPrime(num) function takes an integer number as input and checks if it is a prime number.
It does this by using a for loop starting from 2, because 2 is the first prime number to check.
The loop runs up to the square root of num, as this range is sufficient to check all possible divisors.
For each index, it checks if num is divisible by the current number without a remainder.
If such a divisor is found, the function returns false and terminates.
If no such divisor is found and the loop completes, it means the number is prime,
and the function returns true.

Function main():

# Part a: Find two primes that sum up to n
The program does this by using a for loop from 2 to n-1 because 2 is the first prime number.
The program checks if the index is prime and if its opposite (n - index) is also prime.
If both are prime, it means that a pair is exist, and replacement the index to p1 and n - index to p2.
Then, it prints in the format n = p1 + p2 and stop the loop.

# Part b: Find two primes such that one is n plus another prime
The program goes over a for loop from 2, which is the first prime number, up to 1,000,000,000.
It checks if the index is prime and if its counterpart (n + index) is also prime.
If a pair where both are prime is found, it replacement n + index to p3 and index to p4.
Then, it prints in the format n = p3 - p4 and stops the loop.

# Part c: Count prime numbers in [2,n]
"The program starts counting from 1, meaning it already counts 2.
Then, it only checks odd numbers (starting from 3 up to n-1 since n is even) to see if each number is prime.
If a number is prime, the count increases by 1.
When the loop ends, the program will print in the format count prime numbers in [2,n)

 # Part d: Prime factorization of n
"The program starts with index = 2, which will be the divisor.
It begins by printing the format n = 2 and dividing n by 2 to avoid issues at the end
where there would be a * at the end,
since every number obtained will be divisible at least once by 2 because it is even.
Then, it enters a while loop that runs as long as n is greater than 1.
The loop checks each time if index is prime and if n is divisible by index without a remainder.
If so, it adds *index to the output and divides n by index. Otherwise,the index increases by 1."

*/
/*Pseudocode
Function isPrime(num):
    for i from 2 to squareRoot(num):
        if num % i == 0:
            return false
    return true

Function main():

    # Part a: Find two primes that sum up to n
    p1, p2 = 0, 0
    for i from 2 to n-1:
        if isPrime(i) and isPrime(n - i):
            p1 = i
            p2 = n - i
            print n + "=" + p1 + "+" + p2
            break

    # Part b: Find two primes such that one is n plus another prime
    p3, p4 = 0, 0
    for i from 2 to 100_000_000:
        if isPrime(n + i) and isPrime(i):
            p3 = n + i
            p4 = i
            print n + "=" + p3 + "-" + p4
            break

    # Part c: Count prime numbers in [2,n]
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
                System.out.println(n + "=" + p1 + "+" + p2);
                break;
            }
        }
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
        int count = 1;..גה
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