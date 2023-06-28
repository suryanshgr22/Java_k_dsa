import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float RUP = input.nextFloat();
        double dollar =  0.012*RUP;
        System.out.println("In dollar : "+dollar);

    }
}
