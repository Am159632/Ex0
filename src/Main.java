import java.util.Scanner;
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
        //a
        int p1=0,p2=0;
        for (int i = 2; i < n; i++)
        {
            if ((Isprime(i)) && (Isprime(n - i)))
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
            if (Isprime(n + i) && Isprime(i)) {
                p3 = n + i;
                p4 = i;
                System.out.println(n + "=" + p3 + "-" + p4);
                break;
            }
        }
        //c
        int count = 1;
        for (int i = 3; i < n; i+=2)

            if (Isprime(i))
                count++;

        System.out.println(count + " prime numbers in [2," + n + ")");
        //d
        int index = 2;
        System.out.print(n + "=" +2);
        n=n/2;
        while (n > 1)
            if (Isprime(index) && n % index == 0) {
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