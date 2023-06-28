import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = s.length();
        int count = 0;
        for (int i = 0;i<n;i++)
        {
               if(s.charAt(i) != s.charAt(n-1-i))
               {
                   count++;
                   break;
               }
        }
        if(count==0)
        {
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

    }
}
