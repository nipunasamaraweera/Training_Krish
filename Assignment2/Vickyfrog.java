import java.util.Scanner;

public class Vickyfrog
{
    public static void main(String[] args)
    {
        System.out.print("Enter distance : ");
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();

        int five_Meter = 0;
        int three_Meter = 0;
        int one_Meter = 0;

        while (distance >= 5)
        {
            five_Meter = five_Meter + 1;
            distance = distance - 5;
        }

        while (distance >= 3)
        {
            three_Meter = three_Meter + 2;
            distance = distance - 3;
        }

        while (distance >= 1)
        {
            one_Meter = one_Meter + 3;
            distance = distance - 1;
        }

        System.out.println(five_Meter + three_Meter+ one_Meter);
    }
}
