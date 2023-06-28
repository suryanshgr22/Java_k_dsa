import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int x1=n1;
        int sum1 = 0;
        while(x1!=0)
        {
            int r = x1%10;
            x1 = x1/10;
            sum1 = sum1 + r*r*r;
        }
        if (sum1 == n1)
        {
            System.out.println(n1 + " is an armstrong no.");
        }
        int x2=n2;
        int sum2= 0;
        while(x2!=0)
        {
            int r = x2%10;
            x2 = x2/10;
            sum2 = sum2 + r*r*r;
        }
        if (sum2 == n2)
        {
            System.out.println(n2 + " is an armstrong no.");
        }
        
    }
}
