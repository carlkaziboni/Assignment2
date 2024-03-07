/**
 * @author Carl Kaziboni
 * @version 2024-02-15
 * <p>
 * Class to calculate income tax.
 * <p>
 * Uses conditionals for each case of income tax
 */
import java.lang.Integer;

import GetNumerical.GetNumerical;

public class Design {
    public static void main(String[] args) {
        int totalincome = 0;
        String input = GetNumerical.getincome();
        try
        {
            totalincome = Integer.parseInt(input);
        }
        catch (NumberFormatException exception) {
            System.err.printf("%s not positive whole number i.e. '5000'\n", input);
        }
        finally
        {
            System.out.println("Income: " + totalincome);
        }
        int tax = 0;
        if (totalincome <= 12570)
        {
            System.out.println(tax);
        }
        else if (totalincome <= (12570 + 37700))
        {
            tax = (int) ((totalincome-12570) * 0.2);
            System.out.println(tax);
        }
        else if (totalincome <= 100000)
        {
            tax = (int) ((37700 * 0.2) + ((totalincome-(12570 + 37700)) * 0.4));
            System.out.println(tax);
        }
        else if (totalincome <= 125140)
        {
            tax = (int) ((37700*0.2) + ((totalincome-(37700 + (12570 - ((totalincome- 100000)/2))))*0.4));
            System.out.println(tax);
        }
        else if (totalincome > 125140)
        {
            tax = (int) ((37700*0.2) + (99730*0.4) + ((totalincome-(37700+99730))* 0.45));
            System.out.println(tax);
        }
        else
        {
            System.out.println("Negative Integer not accepted");
        }
    }
}
