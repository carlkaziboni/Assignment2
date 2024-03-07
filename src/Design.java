import java.lang.Integer;
import GetNumerical.GetNumerical;

/**
 * @author Carl Kaziboni
 * @version 2024-02-15
 * <p>
 * Class to calculate income tax.
 * <p>
 * Uses conditionals for each case of income tax
 */
public class Design {
    //tax income bands
    private static final int PERSONAL_ALLOWANCE = 12570;
    private static final int BAND_ONE = 37700;
    private static final int BAND_TWO = 99730;
    private static final int BAND_THREE = 100000;
    private static final int BAND_FOUR = 125140;
    //tax income rates
    private static final double TAX_RATE_ONE = 0.2;
    private static final double TAX_RATE_TWO = 0.4;
    private static final double TAX_RATE_THREE = 0.45;
    public static void main(String[] args)
    {
        int totalincome = 0;
        //Get input from user using special getincome from GetNumerical Package
        String input = GetNumerical.getincome();
        //make sure input is integer
        try
        {
            totalincome = Integer.parseInt(input);
        }
        catch (NumberFormatException exception) {
            System.err.printf("%s not positive whole number i.e. '5000'%n", input);
            System.exit(1);
        }
        finally
        {
            System.out.println("Income: " + totalincome);
        }
        int tax = 0;
        if (totalincome <= PERSONAL_ALLOWANCE)
        {
            printTax(tax);
        }
        //First 37700 after personal allowance taxed at 20%
        else if (totalincome <= (PERSONAL_ALLOWANCE + BAND_ONE))
        {
            tax = calculateBandOne(totalincome);
            printTax(tax);
        }
        //First 37700 after personal allowance taxed at 20% then rest of income up to 100000 taxed at 40%
        else if (totalincome <= BAND_THREE)
        {
            tax = calculateBandTwo(totalincome);
            printTax(tax);
        }
        //First 37700 after personal allowance taxed then rest of income taxed at 40% however after 100000 every 2 pound reduced personal allowance by 1 pound
        else if (totalincome <= BAND_FOUR)
        {
            tax = calculateBandThree(totalincome);
            printTax(tax);
        }
        //First 37700 taxed at 20% then next 99730 taxed at 40% then rest of income taxed 45%
        else if (totalincome > BAND_FOUR)
        {
            tax = calculateBandFour(totalincome);
            printTax(tax);
        }
        else
        {
            System.out.println("Inappropriate format for income");
        }
    }


    /**
     * <p>This method prints out the tax calculated</p>
     * @param tax the tax calculated
     */
    private static void printTax(int tax) {
        System.out.println("Tax: " + tax);
    }
    private static int calculateBandOne(int totalincome)
    {
        int tax;
        //Calculate tax at 20%  for first 37700 after personal allowance 
        tax = (int) ((totalincome - PERSONAL_ALLOWANCE) * TAX_RATE_ONE);
        return tax;
    }
    private static int calculateBandTwo(int totalincome)
    {
        int tax;
        //Calculate tax at 20% for first 37700 after personal allowance and remainder (as long as below or equal to 100000) at 40%.
        tax = (int) ((BAND_ONE * TAX_RATE_ONE) + ((totalincome - (PERSONAL_ALLOWANCE + BAND_ONE)) * TAX_RATE_TWO));
        return tax;
    }
    private static int calculateBandThree(int totalincome)
    {
        int tax;
        //Calculate tax at 20% for first 37700 after personal allowance and next 99730 at 40%. For every 2 pounds over 100000 1 pound is taken from personal allowance.
        tax = (int) ((BAND_ONE * TAX_RATE_ONE) + ((totalincome - (BAND_ONE + (PERSONAL_ALLOWANCE - ((totalincome - BAND_THREE)/2)))) * TAX_RATE_TWO));
        return tax;
    }
    private static int calculateBandFour(int totalincome)
    {
        int tax;
        //Calculate tax at 20% for first 37700 and next 99730 at 40% and the rest of income at 45%.
        tax = (int) ((BAND_ONE * TAX_RATE_ONE) + (BAND_TWO * TAX_RATE_TWO) + ((totalincome - (BAND_ONE + BAND_TWO)) * TAX_RATE_THREE));
        return tax;
    }
}
