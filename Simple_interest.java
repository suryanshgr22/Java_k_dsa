import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        float t = input.nextFloat();
        float r = input.nextFloat();
        float R = r/100;
        float SI = p*t*R;
        float x = SI+p;
        System.out.println("SI : "+SI);
        System.out.println("TOTAL AMOUNT : " + x);
    }
}
