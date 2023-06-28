import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        System.out.println("choose the operator : +,-,*,/");
        String op = input.next();
        if(op.equals("+"))
        {
            System.out.println(n1+n2);
        }
        else if(op.equals("-"))
        {
            System.out.println(n1-n2);
        }
        else if(op.equals("*"))
        {
            System.out.println(n1*n2);
        }
        else if(op.equals("/"))
        {
            System.out.println(n1/n2);
        }
    }
}
