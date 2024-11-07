import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //a
        System.out.println("Enter a natural even number (>4):");
        int n= scanner.nextInt();
        int p1=0,p2=0;
        for (int i=3;i<=n/2;i++)
        {
            p1=i;
            p2=n-i;

        }
    }
}