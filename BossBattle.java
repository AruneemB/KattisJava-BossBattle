import java.util.Scanner;
public class BossBattle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 2) System.out.println(1);
        else System.out.println(n - 2);
    }
}
