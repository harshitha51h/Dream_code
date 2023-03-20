import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
System.out.println("Enter the value of n ");
int n = in.nextInt();
int count = 0;
        for (int i = 1;i <= n; i = i * 10)
        {
            int d = i * 10;
            int k = Math.min(Math.max(n % d - i + 1, 0), i);
            count = count + (n / d) * i + k;
        }
        System.out.println(count);
}
}
