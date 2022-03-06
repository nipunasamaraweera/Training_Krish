import java.util.Arrays;
import java.util.Scanner;

public class NumberOfOccurences
{
    public static void main(String args[])
    {
        int a, size, c[] = new int[256];
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a word without spaces : ");
        String str = n.nextLine();
        char charArray[] = str.toCharArray();
        size = charArray.length;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (charArray[i] > charArray[j])
                {
                    a = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) a;
                }
            }
        }

        for (int i = 0; i < size; i++)
        {
            c[(int) str.charAt(i)]++;
        }

        System.out.println("");
        System.out.println("Number of Occurences");

        for (int i = 0; i < 256; i++) {
            if (c[i] != 0) {
                System.out.println((char) i + " --> " + c[i]);
            }
        }
        System.out.println("");
        System.out.println("Letters in alpahbetical order : " + Arrays.toString(charArray));
    }
}