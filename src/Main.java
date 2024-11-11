import java.util.Scanner;
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Action that reciving integer number and return true if prime,false if not
    static boolean Isprime( int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)//Passing on the numbers from 2 to num/2 because after this
          //  i don't need to check(2 is the smallest number)/I check if the number is divided by all numbers
            // between 2 to num/2 without rest.If this correct,return true,else,return false.
            {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        long startTime = nanoTime();//Start time
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a natural even number (>4):");//Input even number bigger than 4
        int n = scanner.nextInt();
        //a
        //Searching pair of numbers that p1+p2=n that p1,p2 are prime numbers.
        int p1 = 0, p2 = 0;
        for (int i = 2; i <n ; i++)//passing on the numbers from 2 because 1 is not prime to n-1
       // because n is not prime(even and divided by 2)
        {
            if ((Isprime(i)) && (Isprime(n - i)))//check if i and his couple(n-i) are prime.if

            {//If right,put the pair of the numbers in p1,p2 and end the loop
                p1=i;
                p2=n-i;
                break;
            }
        }
        System.out.println(n+"="+p1+"+"+p2);//print the numbers(example:20=3+17
        //end a
        //b
        //Searching pair of numbers that maintains n=p3-p4 and print then.(p3,p4 are prime numbers)
        int p4,p3;
        for(int i = 2; i <= n * 200; i++)
        {
            if(Isprime(n+i) && Isprime(i))
            {
                p3=n+i;
                p4 = i;
                System.out.println(n+"="+p3+"-"+p4);
                break;
            }
        }
        //end b
        //c
        int count = 0;
        for (int i = 2; i < n; i++)
        {

            if (Isprime(i))
            {
                count++;
            }
        }
        System.out.println(count+" prime numbers in [2,"+n+")");
        //end c
        //d
        int index=2;
        int n1=n/2;
        System.out.print(n+"="+index);
        while(n1>1)
        {
            if (Isprime(index)==true&&n1%index==0)
            {
                System.out.print("*"+index);
                n1=n1/index;
            }
            else
            {
                index++;
            }
        }
        System.out.println("");
        //end d
        //e
        System.out.println("207302456");
        long endTime = nanoTime();
        double duration = (endTime - startTime)/1_000_000_000.0;//seconds
        System.out.println(duration+" seconds");
    }
}