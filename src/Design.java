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
    public static void main(String[] args)
    {
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
        if (totalincome <= PERSONALALLOWANCE)
        {
            printtax(tax);
        }
        else if (totalincome <= (PERSONALALLOWANCE + BANDONE))
        {
            tax = calculatebandone(totalincome);
            printtax(tax);
        }
        else if (totalincome <= BANDTHREE)
        {
            tax = calculatebandtwo(totalincome);
            printtax(tax);
        }
        else if (totalincome <= BANDFOUR)
        {
            tax = calculatebandthree(totalincome);
            printtax(tax);
        }
        else if (totalincome > BANDFOUR)
        {
            tax = calculatebandfour(totalincome);
            printtax(tax);
        }
        else
        {
            System.out.println("Inappropriate format for income");
        }
    }
    private static void printtax(int tax) {
        System.out.println("Tax: " + tax);
    }
    //tax income bands
    private static final int PERSONALALLOWANCE = 12570;
    private static final int BANDONE = 37700;
    private static final int BANDTWO = 99730;
    private static final int BANDTHREE = 100000;
    private static final int BANDFOUR = 125140;
    //tax income rates
    private static final double taxrateone = 0.2;
    private static final double taxratetwo = 0.4;
    private static final double taxratethree = 0.45;
    private static int calculatebandfour(int totalincome)
    {
        int tax;
        tax = (int) ((BANDONE * taxrateone) + (BANDTWO * taxratetwo) + ((totalincome - (BANDONE + BANDTWO)) * taxratethree));
        return tax;
    }
    private static int calculatebandthree(int totalincome)
    {
        int tax;
        tax = (int) ((BANDONE * taxrateone) + ((totalincome - (BANDONE + (PERSONALALLOWANCE - ((totalincome - BANDTHREE)/2)))) * taxratetwo));
        return tax;
    }
    private static int calculatebandone(int totalincome)
    {
        int tax;
        tax = (int) ((totalincome - PERSONALALLOWANCE) * taxrateone);
        return tax;
    }
    private static int calculatebandtwo(int totalincome)
    {
        int tax;
        tax = (int) ((BANDONE * taxrateone) + ((totalincome - (PERSONALALLOWANCE + BANDONE)) * taxratetwo));
        return tax;
    }
}
