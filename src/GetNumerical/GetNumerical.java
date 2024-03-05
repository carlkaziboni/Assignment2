package GetNumerical;

import static java.lang.Integer.parseInt;

import java.lang.Character;
import java.lang.String;
import java.util.Scanner;

public class GetNumerical
{
    public static int getincome()
    {
        String income;
        boolean statusnumerical = false;
        boolean statusfilled = false;
        System.out.print("Enter whole positive number income: ");
        Scanner incomeinput = new Scanner(System.in);
        income = incomeinput.nextLine();
        while(!statusfilled || !statusnumerical)
        {
            statusfilled = false;
            statusnumerical = false;
            if (!income.isEmpty())
            {
                statusfilled = true;

                for (int i = 0; i < income.length(); i++)
                {
                    if (!Character.isDigit(income.charAt(i)))
                    {
                        statusfilled = false;
                        break;
                    }
                    statusnumerical = true;
                }
            }
            if (statusfilled && statusnumerical)
            {
                break;
            }
            System.out.print("Please enter income in correct form (Whole positive number): ");
            incomeinput = new Scanner(System.in);
            income = incomeinput.nextLine();
        }
        return parseInt(income);
    }
}
