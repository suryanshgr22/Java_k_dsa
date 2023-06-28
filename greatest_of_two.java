import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        if(n1 > n2)
        {
            System.out.println(n1 + " Is greater");
        }
        else if(n2 > n1)
        {
            System.out.println(n2+" Is greater");
        }else {
            System.out.println("both are equal");
        }
    }
}
