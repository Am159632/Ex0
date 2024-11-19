import java.util.Scanner;
import static java.lang.System.*;

public class Ex0 {

/* Function isPrime(num):

My explain

The isPrime(num) function takes an integer number as input and checks if it is a prime number.
It does this by using a for loop starting from 2, because 2 is the first prime number to check.
The loop runs up to the square root of num, as this range is sufficient to check all possible divisors.
For each index, it checks if num is divisible by the current number without a remainder.
If such a divisor is found, the function returns false and terminates.
If no such divisor is found and the loop completes, it means the number is prime,
and the function returns true.

Pseudocode
Function isPrime(num):
    for i from 2 to squareRoot(num):
        if num % i == 0:
            return false
    return true
 */

    public static boolean isPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;

        return true;
    }

/*Function main():

My explain

# Part a: Find two primes that sum up to n
The program does this by using a for loop from 2 to n-1 because 2 is the first prime number.
The program checks if the index is prime and if its opposite (n - index) is also prime.
If both are prime, it means that a pair is exist,
and prints in the format n = i + (n+i) and stop the loop.

# Part b: Find two primes such that one is n plus another prime
The program goes over a while loop,and put in to the index 2 which is the first prime number.
It checks if the index is prime and if its counterpart (n + index) is also prime.
If a pair where both are prime is found, it prints in the format n = (n+index) - (index) and stops the loop.

# Part c: Count prime numbers in [2,n]
The program starts counting from 1, meaning it already counts 2.
Then, it only checks odd numbers (starting from 3 up to n-1 since n is even) to see if each number is prime.
If a number is prime, the count increases by 1.
When the loop ends, the program will print in the format count prime numbers in [2,n).

 # Part d: Prime factorization of n
The program starts with index = 2, which will be the divisor.
It begins by printing the format n = 2 and dividing n by 2 to avoid issues at the end
where there would be a * at the end,
since every number obtained will be divisible at least once by 2 because it is even.
Then, it enters a while loop that runs as long as n is greater than 1.
The loop checks each time if index is prime and if n is divisible by index without a remainder.
If so, it adds *index to the output and divides n by index. Otherwise,the index increases by 1.

Pseudocode

    # Part a: Find two primes that sum up to n
    for i from 2 to n-1:
        if isPrime(i) and isPrime(n - i):
            print n + "=" + i + "+" + (n-i)
            break

    # Part b: Find two primes such that one is n plus another prime
    index=2
    while true:
        if isPrime(n + index) and isPrime(index):
            print n + "=" + (n+i) + "-" + i
            break
        index++

    # Part c: Count prime numbers in [2,n]
    count = 1
    for i from 3 to n-1 step 2:
        if isPrime(i):
            count ++
    print count + " prime numbers in [2,n)

    # Part d: Prime factorization of n:
    index = 2
    print n + "=" + 2
    n=n/2
    while n > 1:
         If isPrime(index) and index%n==0:
            print "*" + index
            n = n / index
        else:
            index++
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a natural even number (>4):");//Input even number bigger than 4
        int n = scanner.nextInt();
        long start=System.currentTimeMillis();
        if(n%2==1||n<=4) {
            System.out.println("error");
            return;
        }
        //a
        for (int i = 2; i < n; i++)
        {
            if ((isPrime(i)) && (isPrime(n - i)))
            {
                System.out.println(n + "=" + i + "+" + (n-i));
                break;
            }
        }
        //b
        int index = 2;
        while(true) {
            if (isPrime((n + index)) && isPrime(index)) {
                System.out.println(n + "=" + n+index+ "-" + index);
                break;
            }
            index++;
        }

        //c
        int count = 1;
        for (int i = 3; i < n; i+=2)

            if (isPrime(i))
                count++;
        System.out.println(count + " prime numbers in [2," + n + ")");

        //d
        index = 2;
        System.out.print(n + "=" +2);
        n=n/2;
        while (n > 1)
            if (isPrime(index) && n % index == 0) {
                System.out.print("*" + index);
                n = n / index;
            } else
                index++;
        System.out.println();

        //e
        System.out.println("207302456");
        //f
        long end =System.currentTimeMillis();
        double duration = (end - start) / 1_000.0;//seconds
        System.out.println(duration + " seconds");
    }
}