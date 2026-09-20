Print Numbers - Day 6
Description
This Java program prints all numbers from 1 to 20, while skipping numbers that are multiples of 3.

The program uses a for loop to go through the numbers and the continue statement to skip multiples of 3.

How It Works
The for loop starts at 1 and runs until 20.

The program checks whether the current number is divisible by 3.

If the number is a multiple of 3, the continue statement skips it.

If it is not a multiple of 3, the number is printed.

Example
Input
No user input is required.

Output
1
2
4
5
7
8
10
11
13
14
16
17
19
20

Concepts Practiced
for loop

if statement

Modulus operator %

continue statement

Basic Java program structure

Printing output with System.out.println()

Code
package day6;

public class PrintNumbers {

    public static void main(String[] args) {
        // Program to print all numbers from 1 to 20,
        // skipping multiples of 3.

        for (int num = 1; num <= 20; num++) {
            if (num % 3 == 0) {
                continue;
            }

            System.out.println(num);
        }
    }
}

Key Learning
The % (modulus) operator returns the remainder after division.

For example:

6 % 3 = 0
7 % 3 = 1

Therefore, when:

num % 3 == 0

the number is a multiple of 3, and continue skips that number.
