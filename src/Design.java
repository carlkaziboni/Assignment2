import java.lang.Integer;
import java.lang.Character;
import java.lang.String;
import java.util.Scanner;

/**
 * @author Carl Kaziboni
 * @version 2024-03-07
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
        int totalIncome = 0;
        //Get input from user
        String input = GetNumerical.getIncome();
        //make sure input is integer
        try
        {
            totalIncome = Integer.parseInt(input);
        }
        catch (NumberFormatException exception)
        {
            System.err.printf("%s not positive whole number i.e. '5000'%n", input);
            System.exit(1);
        }
        finally
        {
            System.out.println("Income: " + totalIncome);
        }

        //start calculating tax
        int tax = 0;
        //Non-taxable income
        if (totalIncome <= PERSONAL_ALLOWANCE)
        {
            printTax(tax);
        }
        //First 37700 after personal allowance taxed at 20%
        else if (totalIncome <= (PERSONAL_ALLOWANCE + BAND_ONE))
        {
            tax = calculateBandOne(totalIncome);
            printTax(tax);
        }
        //First 37700 after personal allowance taxed at 20% then rest of income up to 100000 taxed at 40%
        else if (totalIncome <= BAND_THREE)
        {
            tax = calculateBandTwo(totalIncome);
            printTax(tax);
        }
        //First 37700 after personal allowance taxed then rest of income taxed at 40% however after 100000 every 2 pound reduced personal allowance by 1 pound
        else if (totalIncome <= BAND_FOUR)
        {
            tax = calculateBandThree(totalIncome);
            printTax(tax);
        }
        //First 37700 taxed at 20% then next 99730 taxed at 40% then rest of income taxed 45%
        else if (totalIncome > BAND_FOUR)
        {
            tax = calculateBandFour(totalIncome);
            printTax(tax);
        }
        //If all checks were bypassed
        else
        {
            System.err.println("Inappropriate format for income");
        }
    }


    //Supporting methods
    /**
     * <p>
     * This method prints out the tax calculated to console
     * </p>
     *
     * @param tax An integer of tax calculated
     * <p>
     * Example of usage of printTax
     * </p>
     * <pre>
     * {@code
     * int tax = 100;
     * printTax(tax);
     * }
     * </pre>
     * <p>
     * This prints "Tax: 100" to console
     * </p>
     */
    private static void printTax(int tax)
    {
        System.out.println("Tax: " + tax);
    }
    /**
     * <p>
     * This method calculates the tax for salaries in band one
     * </p>
     * @param totalIncome An integer of total income
     * @return tax calculated
     */
    private static int calculateBandOne(int totalIncome)
    {
        int tax;
        //Calculate tax at 20%  for first 37700 after personal allowance 
        tax = (int) ((totalIncome - PERSONAL_ALLOWANCE) * TAX_RATE_ONE);
        return tax;
    }
    /**
     * <p>
     * This method caclulates the tax for salaries in band two
     * </p>
     * @param totalIncome An integer of total income
     * @return tax calculated
     */
    private static int calculateBandTwo(int totalIncome)
    {
        int tax;
        //Calculate tax at 20% for first 37700 after personal allowance and remainder (as long as below or equal to 100000) at 40%.
        tax = (int) ((BAND_ONE * TAX_RATE_ONE) + ((totalIncome - (PERSONAL_ALLOWANCE + BAND_ONE)) * TAX_RATE_TWO));
        return tax;
    }
    /**
     * <p>
     * This method calculates the tax for salaries in band three
     * </p>
     * @param totalIncome An integer of total income
     * @return tax calculated
     */
    private static int calculateBandThree(int totalIncome)
    {
        int tax;
        //Calculate tax at 20% for first 37700 after personal allowance and next 99730 at 40%. For every 2 pounds over 100000 1 pound is taken from personal allowance.
        tax = (int) ((BAND_ONE * TAX_RATE_ONE) + ((totalIncome - (BAND_ONE + (PERSONAL_ALLOWANCE - ((totalIncome - BAND_THREE) / 2)))) * TAX_RATE_TWO));
        return tax;
    }
    /**
     * <p>
     * This method calculates the tax for salaries in band four
     * </p>
     * @param totalIncome An integer of total income
     * @return tax calculated
     */
    private static int calculateBandFour(int totalIncome)
    {
        int tax;
        //Calculate tax at 20% for first 37700 and next 99730 at 40% and the rest of income at 45%.
        tax = (int) ((BAND_ONE * TAX_RATE_ONE) + (BAND_TWO * TAX_RATE_TWO) + ((totalIncome - (BAND_ONE + BAND_TWO)) * TAX_RATE_THREE));
        return tax;
    }
}


/**
 * @author Carl Kaziboni
 * @version 2024-03-07
 * <p>
 * Class to get integer input.
 * <p>
 * Contains getIncome used to obtain integer input from user
 */
class GetNumerical
{
    /**
     * <p>
     * This method gets input from user
     * </p>
     * @return String made up of integers only
     */
    public static String getIncome()
    {
        String income;
        boolean allNumericalInput = false;
        boolean notEmptyInput = false;
        System.out.print("Enter whole positive number income: ");
        Scanner incomeInput = new Scanner(System.in);
        //read input obtained
        income = incomeInput.nextLine();
        //Keep prompting for input till input is correctly given
        while(!notEmptyInput || !allNumericalInput)
        {
            notEmptyInput = false;
            allNumericalInput = false;
            if (!income.isEmpty())
            {
                notEmptyInput = true;

                for (int i = 0; i < income.length(); i++)
                {
                    if (!Character.isDigit(income.charAt(i)))
                    {
                        notEmptyInput = false;
                        break;
                    }
                    allNumericalInput = true;
                }
            }
            //all constraints satisfied
            if (notEmptyInput && allNumericalInput)
            {
                break;
            }
            System.out.print("Please enter income in correct form (Whole positive number): ");
            incomeInput = new Scanner(System.in);
            income = incomeInput.nextLine();
        }
        return income;
    }
}