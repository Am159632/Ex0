import java.util.Scanner;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        //a
        out.println("Enter a natural even number (>4):");
        int n = scanner.nextInt();
        int p1 = 0, p2 = 0;
        boolean e1 = true,e2=true;
        for (int i = 3; i <= n / 2; i++)
        {
            for (int j = 2; j < i; j++)

                if (i % j == 0)
                {
                    e1 = false;
                }
            if (e1 == true)
            {
                for (int k = 2; k < n - i; k++)
                {
                    if (n - i % k == 0)
                    {
                        e2 = false;
                    }
                }
                if (e2 == true)
                {
                    p1 = i;
                    p2 = n - i;
                }
            }
        }
        System.out.println(n+"="+p1+"+"+p2);
        //end a
        //b
       boolean e3=true,e4=true;
        int p3=0,p4=0;
        while(e3==true&&e4==true)
        {

        }
    }
    }



