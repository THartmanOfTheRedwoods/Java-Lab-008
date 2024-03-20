# Down the Rabbit-hole with Recursion

**Instructions:**

1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Part 1: Breaking down a problem - Decomposition

Objective: The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods.

Consider the first verse of the song “99 Bottles of Beer”:
```text
99 bottles of beer on the wall,
99 bottles of beer,
ya’ take one down, ya’ pass it around, 98 bottles of beer on the wall.
```

Subsequent verses are identical except that the number of bottles gets smaller by one in each verse, until the last verse:

```text
No bottles of beer on the wall,
no bottles of beer,
ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!
```
And then the song (finally) ends.

1. Create a new Java file named **WallsAndBeer.java** Write a program that displays the entire lyrics of “99 Bottles of Beer”.
    * Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program.
    * SUGGESTION: As you develop your code, test it with a small number of verses, like 3.

## Part 2: Recursive Method Practice

Add all the following methods to the RecursivePractice class.

1. Write a recursive method named **oddSum** that takes a positive odd integer n and returns the sum of odd integers from 1 to n.
    * Start with a base case, and use temporary variables to debug your solution.
    * You might find it helpful to print the value of n each time oddSum is invoked.

2. Translate a recursive definition into a Java method.
  * The Ackermann function is defined for non-negative integers as follows:

```text
         | n + 1                 if m = 0
A(m,n) = | A(m − 1, 1)           if m > 0 and n = 0
         | A(m − 1, A(m, n − 1)) if m > 0 and n > 0
```
  * Write a recursive method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
      * Test your implementation of Ackermann by invoking it from main and displaying the return value.
          * Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).
        
3. Write a recursive method called **power** that takes a double x and an integer n and returns $$x^n$$.
    * Hint: A recursive definition of this operation is $$x^n = x \cdot x^{(n-1)}$$
    * Also, remember that anything raised to the zeroth power is 1.
    * Optional challenge: you can make this method more efficient, when n is even, using $$x^n = \left(x^{\frac{n}{2}}\right)^2$$

4. Write a method called **maxInRange** that takes an array of integers and two indexes, lowIndex and highIndex, and finds the maximum value in the array, but considering only the elements between lowIndex and highIndex, including both.
    * This method should be recursive.
    * If the length of the range is 1 (i.e., if lowIndex == highIndex), we know immediately that the sole element in the range must be the maximum. So that’s the base case.
    * If there is more than one element in the range, we can break the array into two pieces, find the maximum in each piece, and then find the maximum of the maxima.

## Submission

Follow these steps for submission:

1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code for the exercises to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.
