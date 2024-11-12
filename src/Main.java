import java.util.Scanner;
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*FUNCTION IsPrime(num)
        FOR i = 2 TO square root of num
            IF num MOD i == 0 THEN
                RETURN false
            END IF
        END FOR

        RETURN true
    END FUNCTION*/
    static boolean Isprime(int num)
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
        /*a
        START
        FUNCTION findPrimeSum(n)
            p1 = 0
            p2 = 0

            FOR i = 2 TO (n-1)
               IF isPrime(i) AND isPrime(n - i) THEN
                    p1 = i
                    p2 = n - i
                    BREAK
               END IF
                END FOR
        PRINT n + " = " + p1 + " + " + p2
        END FUNCTION*/
        int p1=0,p2=0;
        for (int i = 2; i < n; i++)//passing on the numbers from 2 because 1 is not prime to n-1
        // because n is not prime(even and divided by 2)
        {
            if ((Isprime(i)) && (Isprime(n - i)))//check if i and his couple(n-i) are prime.if
            {
                p1 = i;
                p2 = n - i;
                break;
            }
        }
        System.out.println(n + "=" + p1 + "+" + p2);
        /*b (68759678)
        Searching pair of numbers that maintains n=p3-p4 and print then.(p3,p4 are prime numbers)
        START
        DECLARE p3, p4

    FOR i = 2 TO (n * 100)
        IF isPrime(n + i) AND isPrime(i) THEN
            p3 = n + i
            p4 = i
            PRINT n + " = " + p3 + " - " + p4
            BREAK
        END IF
    END FOR
END FUNCTION

FUNCTION isPrime(num)
    IF num <= 1 THEN
        RETURN false
    END IF

    FOR i = 2 TO square root of num
        IF num MOD i == 0 THEN
            RETURN false
        END IF
    END FOR

    RETURN true
END FUNCTION
         */
        int p4, p3;
        for (int i = 2; i <= n * 10000; i++)
            if (Isprime(n + i) && Isprime(i)) {
                p3 = n + i;
                p4 = i;
                System.out.println(n + "=" + p3 + "-" + p4);
                break;
            }
        /*c
        START

FUNCTION countPrimes(n)
    DECLARE count = 0

    FOR i = 2 TO (n - 1)
        IF isPrime(i) THEN
            count = count + 1
        END IF
    END FOR

    PRINT count + " prime numbers
        */
        int count = 1;
        for (int i = 3; i < n; i+=2)

            if (Isprime(i))
                count++;

        System.out.println(count + " prime numbers in [2," + n + ")");
        /*d
        START

    DECLARE index = 2
    DECLARE n1 = n / 2
    PRINT n + " = 2"

    WHILE n1 > 1
        IF isPrime(index) AND n1 MOD index == 0 THEN
            PRINT " * " + index
            n1 = n1 / index
        ELSE
            index = index + 1
        END IF
    END WHILE

    PRINT newline
END FUNCTION

FUNCTION isPrime(num)
    IF num <= 1 THEN
        RETURN false
    END IF

    FOR i = 2 TO square root of num
        IF num MOD i == 0 THEN
            RETURN false
        END IF
    END FOR

    RETURN true
END FUNCTION
         */
        int index = 2;
        System.out.print(n + "=" +2);
        n=n/2;
        while (n > 1)
            if (Isprime(index) && n % index == 0) {
                System.out.print("*" + index);
                n = n / index;
            } else
                index++;

        /*e
        PRINT "207302456"(my id)
         */
        System.out.println();
        System.out.println("207302456");
        /*f
        START

DECLARE end AS long
SET start TO start time in nanoseconds(line 29)
SET end TO current time in nanoseconds

DECLARE duration AS double
SET duration TO (end - start) / 1_000_000_000.0  // Convert nanoseconds to seconds

PRINT duration + " seconds"
END FUNCTION
         */
        long end = nanoTime();
        double duration = (end - start) / 1_000_000_000.0;//seconds
        System.out.println(duration + " seconds");
    }
}