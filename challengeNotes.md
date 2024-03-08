# Challenges and notes #

- Name: Carl Kaziboni
- Student ID: s2413182
- Tutorial group: 2
- Tutor: Andrey Demindenko
- Date: 2024-03-07

* [Calculate my income tax](#calculate-my-income-tax-)
* [Change the subject](#change-the-subject-)
* [Draw an apartment building](#draw-an-apartment-building-)
* [Guess the song title](#guess-the-song-title-)
* [Help me sell day-old bagels](#help-me-sell-day-old-bagels-)
* [Multiply a string by a number](#multiply-a-string-by-a-number-)
* [Remove duplicates from my academic transcript](#remove-duplicates-from-my-academic-transcript-)
* [Zip ragged lists](#zip-ragged-lists-)

## Calculate my income tax ##

*[Calculate my income tax](https://codegolf.stackexchange.com/questions/256003/calculate-my-income-tax "Calculate my income tax")*

### Initial thoughts and feelings ###
- Mathematically involved. Will need ways of identifying each of the cases. Very interesting case and possibility for wide range of solutions

### Initial idea for a design ###
- Using nested if statements to go through each of the cases step by step. About 5 cases.

### Ideas for alternative designs ###
- Using switch statement with different cases. Using methods for each tax bracket and get final output as total of return values of the cases.

### Later thoughts and feelings ###
- This is very intuitive and can use mulitple concepts from Java. Has use after cold golf and beyond the course for real life application.

## Change the subject ##

*[Change the subject](https://codegolf.stackexchange.com/questions/256828/change-the-subject "Change the subject")*

### Initial thoughts and feelings ###
- Requires a different way of thinking as working with strings. Could use multiple concepts in java and good for applying string manipulation. - Multiple arrays will need to be produced as results will vary widely.

### Initial idea for a design ###
- Standardize string by removing fullstops and lowercase all letters in string. Split string at whitespace and store arrays of split strings in an arrayList of strings. Use method to see if they share two words and return all permutations. This can be done with a for loop and a variable storing number of common words and break when the variable reached 2. The method returns permutations of the arrays are combined stored. This is done for each of the sentences with each other. Another method is implemented that combines all the permutations and returns that list.

### Ideas for alternative designs ###
- List out all the possible permutations without checks. Then check if each solution is either viable or not viable by seeing if each sentence has words in common with the following sentence in the array. A method returns all viable combinations in an arrayList of arrays with acceptable orders.

### Later thoughts and feelings ###
- There's lots to do with strings and multiple ways to compare. It does feel a bit limited on other aspects of Java but is perfect to apply string manipulation.

## Draw an apartment building ##

*[Draw an apartment building](https://codegolf.stackexchange.com/questions/247470/apartment-building "Draw an apartment building")*

### Initial thoughts and feelings ###
- The exercise looks very interesting and uses Java principles in a creative and unique way. There feels like there are a number of ways that this could be implemented with various numbers of data structures that could be employed.

### Initial idea for a design ###
- Have conditionals for edge cases such as n=1 to print out the case. Print out the top of the apartment first, then place all the designs in a HashMap. Use a for loop to run through the process of getting a random number and using it as the key to print out the values of the hashmap (the designs).

### Ideas for alternative designs ###
- Have all the designs as objects of a class floors with method to print out string. Place the objects in an array case. Use method for first floor object for n=1. Start of with last floor object method. Randomly select object from arraylist and use method to print out the floor. This is all done in a while loop which is terminated for a certain case (when n gets to 0).

### Later thoughts and feelings ###
- Very creative and not as simple as it looks on at face value. Has potential for multiple work arounds which could be potentially better than the first two solutions.

## Guess the song title ##

*[Guess the song title](https://codegolf.stackexchange.com/questions/256502/guess-the-song-title "Guess the song title")*

### Initial thoughts and feelings ###
- Fair amount of string manipulation (not as much as the sentence connect) and can use data structures to keep track of the most line with most apprearances.

### Initial idea for a design ###
- Split the string at newline. Use a HashMap with the lyrics as keys and increase the values associated with the keys by 1 every time the key appears. If the key is new then place a new key with value 1 in Hashmap. If two values are the same return the earlier appearance.

### Ideas for alternative designs ###
- Split the string in at the newline. Store the strings in an arrayList. Then use the arrayList to get the highest occuring string in the arrayList. Return the first occurence of the highest number if two are equal numbers.

### Later thoughts and feelings ###
- The process may seem simple however there is a fair bit to do at each stage of the processes. It uses a range of string manipulation and many data structures can be used for tracking the string occurence.

## Help me sell day-old bagels ##

*[Help me sell day-old bagels](https://codegolf.stackexchange.com/questions/241373/help-me-sell-day-old-bagels "Help me sell day-old bagels")*

### Initial thoughts and feelings ###
- There is a fair amount of math involved in this exercise. This also allows the possibility for multiple solutions. A wide range of data structures can be used for it.

### Initial idea for a design ###
- Use a for loop to go through the array. Have a various cases, i.e. above 100, and what happens to all the bagels. At the end of each pass of the for loop the day old bagel is put to a new value of remaining bagels. The total is tracked at the end of each for loop.

### Ideas for alternative designs ###
- Use switch statements, at the end of every statement the day old bagel value is put to a new day old bagel value and total is increased by number of bagels sold, inside a while loop to go through each of the elements of the array.

### Later thoughts and feelings ###
- There is a wide range to do with bagels. And more optimized solutions can be probably be obtained compared to the ones written up.

## Multiply a string by a number ##

*[Multiply a string by a number](https://codegolf.stackexchange.com/questions/132002/multiply-a-string-by-a-number "Multiply a string by a number")*

### Initial thoughts and feelings ###
- There is a lot of good string manipulation in this exercise. There feels to be a number of ways to do this. 

### Initial idea for a design ###
- Go through the string using a for loop. At each pass of the for loop add the character n times to a variable of type string. Concatenate that variable with the final string variable. 

### Ideas for alternative designs ###
- Split the string at each character. Add the character to the string of itself n-times. Add all the arrays together.

### Later thoughts and feelings ###
- There is potential for this solution to be done very efficiently in various number of ways.

## Remove duplicates from my academic transcript ##

*[Remove duplicates from my academic transcript](https://codegolf.stackexchange.com/questions/256441/remove-duplicates-from-my-academic-transcript "Remove duplicates from my academic transcript")*

### Initial thoughts and feelings ###
- There is use of a number of methods to do with String and comparison. It is very involved at each step of the way.

### Initial idea for a design ###
- Have a Hashmap with grades as keys and values to dictate the value of the grade. Go through the value pairs and add them to a list, if a value pair has already occurred compare the grades and change the grade to the highest grade.

### Ideas for alternative designs ###
- Go through the list and see if each element has another occurence, compare the grades of the two occurences. The occurence with a higher value grade is kept and the other occurence removed. The grades are the ordered from highest grades to lowest grades.

### Later thoughts and feelings ###
- The solutions could be optimized to be more efficient. There is a variety of solutions though most seem quite involved.

## Zip ragged lists ##

*[Zip ragged lists](https://codegolf.stackexchange.com/questions/258133/zip-ragged-lists "Zip ragged lists")*

### Initial thoughts and feelings ###
- The task is very involved with quite a lot cases that need to be accounted for.

### Initial idea for a design ###
- Use a for loop and repeat for the shortest length number of times. Have a method for each element in the shorter array combine with the same array. If an array is a nested array combine the first element with all elements of the first nested array. Return this list and then combine all lists at the end.

### Ideas for alternative designs ###
- Use two Hashmaps. Have a function that combines each of the ith elements in each of the Hashmaps. Each value combination is added to an array and all the arrays are combined at the end.

### Later thoughts and feelings ###
- The task is quite challenging to get all the types of cases that can happen. It can take quite long to do however once the first solution is complete there may be other solutions that are seen that are better designed.

<STYLE>
* {
  font-size:   1.2rem;
  /* One Dark theme */
  background-color: #282C34;
  color:            #ABB2BF;
}
body {
  /* width of the text column */
  width: 80%;
  /* line spacing */
  line-height: 180%;
  /* Font styles: */
  font-family: "OpenDyslexic", sans-serif;
}
pre,
code,
pre code {
  /* line spacing */
  line-height: 150%;
  font-family: "OpenDyslexicMono", monospace;
}
ol,
ol ol,
ol ol ol { /* Nested lists all use decimal numbering */
  list-style-type: decimal;
}
em {
  /* if you want underlining instead of italics */
  font-style: normal;
  border-bottom-style: solid;
  border-bottom-width: 1px;
  padding-bottom:      2px;
}
h2 { /* Put a horizontal line above major headings to assist screen viewing */
  border-top:  1px solid #D5DAD5;
  margin-top:  80px;
  padding-top: 20px;
  }
</STYLE>