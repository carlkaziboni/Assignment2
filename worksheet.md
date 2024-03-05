- Name: Carl Kaziboni
- Student ID: s2413182
- Tutorial group: 2
- Tutor: Andrey Demindenko
- Date: TODO Today's date in ISO 8601 format YYYY-MM-DD

# Worksheet #

## Design ##

### Input ###
- The input is obtained from the terminal using `args[0]` and placed in the variable `int totalincome`. Before `totalincome` is assigned the variable `arg[0]` it is parsed to an integer using `parseInt`. This also throws an exception 'NumberFormatException' if there is a non-parsable string.

### Tax ###
- `int tax` is used to the tax and is intialized to 0 as that is the base case. Tax is then changed depending on the various cases and is printed at the end of each case. The calculations all have `(int)` as they are type cast to int from floats.

### Cases ###
- The cases are hardcoded using if and else if statements. There are a total of 6 cases:
1. Less than or equal to 12570 (no tax)
2. Less than or equal to 37700 (tax is applied at 20% after personal allowance subtracted)
3. Less than or equal to 100000 (first 37700 is taxed at 20% after personal allowance and the rest at 40%)
4. Less than or equal to 125140 (first 37700 is taxed at 20% and no personal allowance and the rest at 40%)
5. More than 125140 (first 37700 is taxed at 20% and no personal allowance, the next 99730 at 40% and the rest at 45%)
6. The last case is if a negative number is used as input.
7. 
###  Output ###
- The tax is output using `System.out.println(tax);` to print the total tax to the console.

### Variable Names ###
-Both variable names i.e `totalincome` and `tax` were named in such a way the mean what they represent to make it easier to read.

# Original challenge question from CodeGolf #

[https://codegolf.stackexchange.com/questions/256003/calculate-my-income-tax](short url to the CodeGolf challenge "tooltip text")

Background
Here in the UK1, these are the income tax rules:

You get a personal allowance (untaxed) of up to £12,570:
If you earn less than £100,000, you get the full £12,570 as personal allowance
For every £2 over £100,000, your personal allowance goes down by £1
After the personal allowance, the next £37,700 is taxed at the "basic rate" of 20%
After that, the next £99,730 is taxed at the "higher rate" of 40%
Finally, anything above this is taxed at the "additional rate" of 45%
1: This isn't actually the case in Scotland; only England, Wales and Northern Ireland.

Your task
Using the above tax rules, take in an annual salary (as a positive integer) and calculate the income tax.

Test cases
Input    Output
12570    0
50000    7486
80000    19432
120000   39432
200000   75588.5
Note: the final test case can be any of 75588, 75588.5, or 75589 (any is fine)

Clarifications
You can choose whether to make the personal allowance an integer or keep it as a float
e.g. if the input is £100,003, the personal allowance can be £12,569, £12,568.50, or £12,568
The same goes for the final output. If it ends up as a float, you can make it an integer or keep it as a float
(see the final test case)
This is code-golf, so shortest answer in bytes wins!

<STYLE>
* { /* Don't leave any empty lines or IntelliJ might not render correctly */
  /* Text size */
  font-size:   1.1rem;
  /*font-size:   1.2rem;*/
  /* Zenburn dark theme */
  background-color: #2A252A;
  color:            #D5DAD5;
  /* One Dark theme */
  /*background-color: #282C34;
  color:            #ABB2BF;*/
  /* white-ish on dull blue-ish */
  /*background-color: DarkSlateGray;
    color:            AntiqueWhite;*/
  /* white on black */
  /*background-color: black;
  color: white;*/
  /* black on white */
  /*background-color: white;
  color: black;*/
  /* nearly black on bright yellow */
  /*background-color: #FFFFAA;
  color:            #080808;*/
  /* black on bright blue */  
  /*background-color: #99CCFF;
  color:            black;*/
}
body {
  /* width of the text column */
  width: 80%;
  /* line spacing */
  line-height: 180%;
  /*line-height: 200%;*/
  /* Font styles: */
  /* Default sans serif */
  /*font-family: sans-serif;*/
  /* Default serif */
  font-family: serif;
  /* Specific font with generic fall-back */
  /* font-family: "Calibri Light", sans-serif; */
  /*font-family: "OpenDyslexic", sans-serif;*/
}
pre,
code,
pre code {
  /* line spacing */
  line-height: 150%;
  /* Default monospace */
  font-family: monospace;
  /* Specific fixed-width font with generic fall-back */
  /*font-family: "Consolas", monospace;*/
  /*font-family: "OpenDyslexicMono", monospace;*/
}
ol,
ol ol,
ol ol ol { /* Nested lists all use decimal numbering */
  list-style-type: decimal;
}
em {
  /* if you want underlining instead of italics */
  /*font-style: normal;
  border-bottom-style: solid;
  border-bottom-width: 1px;
  padding-bottom:      2px;*/
  text-decoration-skip-ink: auto;
}
h2 { /* Put a horizontal line above major headings to assist screen viewing */
  border-top:  1px solid #D5DAD5;
  margin-top:  80px;
  padding-top: 20px;
  }
</STYLE>