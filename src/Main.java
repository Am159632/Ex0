import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean Isprime( int num)
    {
        boolean e = true;
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                e = false;
            }
        }
        return e;
    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(in);
        //a
        out.println("Enter a natural even number (>4):");
        int n = scanner.nextInt();
        int p1 = 0, p2 = 0;
        for (int i = 3; i <n / 2; i++)
        {
            if (Isprime(i)==true&&Isprime(n-i)==true)
            {
                p1=i;
                p2=n-i;
                break;
            }
        }
        System.out.println(n+"="+p1+"+"+p2);
        //end a
        //b
        int p3=0,p4=0,index=2,sign=0;
        while(sign==0)
        {
            if(Isprime(n+index)==true&&Isprime(index)==true)
            {
                p3=n+index;
                p4=index;
                System.out.println(n+"="+p3+"-"+p4);
                break;
            }
            index++;
        }
        //end b
        //c
      //  int[]a=new int[n];
       int count=0;
        for (int i=2;i<n;i++)
        {
            if (Isprime(i)==true)
            {
            //    a[count]=i;
                count++;
            }
        }
       System. out.println(count+" prime numbers in [2,"+n+")");
        //end c
        //d
       index=2;
        int n1=n/2;
        System. out.print(index);
        while(n1>1)
        {
            if (Isprime(index)==true&&n1%index==0)
            {
                System. out.print("*"+index);
                n1=n1/index;
            }
            else
            {
                index++;
            }
        }
        System. out.print("="+n);
        //end d a
    }
}