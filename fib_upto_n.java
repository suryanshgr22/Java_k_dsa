import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n>0)
        {
            System.out.println(0);
            System.out.println(1);
            int n1 = 0;
            int n2 = 1;
            int fib = 0;
            while(true)
            {
                fib = n1 + n2;
                if(fib >=n)
                {
                    break;
                }
                n1 = n2;
                n2 =fib;
                System.out.println(fib);
            }
        }

    }
}
