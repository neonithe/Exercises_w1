package org.example;

/**
 * Hello world!
 *
 */

import java.util.Random;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) {
       /* Ex 1
       Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        Expected result:
        Hello
        Ali!
       */
//       System.out.println( "Hello\nMattias" );/*

    /* Ex 2
    Create a program that takes a year as input from user and print if it’s leap year or not.
    */
        int year = 1900;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    /* Ex 3
    Write a Java program to print the sum/multiplication/division and subtraction of two numbers
    Expected result:
    45 + 11 = 56
    12 * 4 = 48
    24 / 6 = 4
    55 – 12 = 43
    */
/*        int sum1 = 45+11, sum2 = 12*4, sum3 = 24/6, sum4 = 55-12;
            System.out.println("45 + 11 ="+sum1+"\n12 * 4 = "+sum2+"\n24 / 6 = "+sum3+"\n55 - 12 = "+sum4);
*/

    /* Ex 4
    Write a Java program that prints the average of three numbers
    Expected result:
    (23 + 11 + 77) / 3 = 37
     */

/*    int result = ((23+11+77)/3);
        System.out.println("(23+11+77)/3 = "+result);
*/
    /* Ex 5
    Create a program that asks user to input his/her name and store it in a variable instead of having fixed name.
    Then print ‘Hello username’ where username is what you got from user as input.
     */
/*      Scanner objName = new Scanner(System.in);   //Scanner object
        System.out.println("Your name? :");         //Ask for name
            String name = objName.nextLine();       //Read the next line and save to string variable
        System.out.println("Hello "+name);          //Print name
*/

    /* Ex 6
    Create a program that asks user to input two numbers and print the sum/multiplication/division
    and subtraction of given numbers
    */

/*    Scanner objNum = new Scanner(System.in);        //Scanner object
        System.out.println("Number 1:");            //Ask for nr1
        int num1 = objNum.nextInt();                //Read and save input
        System.out.println("Number 2:");            //Ask for nr2
        int num2 = objNum.nextInt();                //Read and save input
            int sum1 = num1+num2, sum2 = num1-num2, sum3 = num1*num2, sum4 = num1/num2; //Make calculations and save to varibles
    System.out.println("Addition: "+sum1+"\nSubtraction: "+sum2+"\nMultiplication: "+sum3+"\nDivision: "+sum4); //Print sum
*/

    /* Ex 7
    Create a program that converts seconds to hours, minutes and seconds
    Input seconds: 86399
    Expected output:
    23:59:59
     */
/*        Scanner input = new Scanner(System.in);
            System.out.println("Input seconds:");
                int sec = input.nextInt();

        int sek = sec % 60;
        int min1 = sec / 60;
        int min = min1 % 60;
        int hour = min1 / 60;

        System.out.println(hour + ":" + min + ":" + sek);
*/

    /*
    Write a program that first generates a random number between 1 and 500 and stores it into a variable
    (see the Random class). Then let the user make a guess for which number it is. If the user types the
    correct number, he should be presented with a message (including the number of guesses he has made).
    If he types a number that is greater or smaller than the given number, display either
    “Your guess was too small” or “Your guess was too big”. The program should keep executing until the user
    input the correct guess.
     */


        Random randNr = new Random();
        Scanner readNum = new Scanner(System.in);
            final int number = 500;
            int numGuess;
            int count = 0;
        numGuess = randNr.nextInt(number) + 1;

        System.out.println("Quess number: ");
        int input = readNum.nextInt();

        while (numGuess != input) {

            System.out.println("Wrong number");
            if (input > numGuess) {
                System.out.println("Too high");
            } else if (input < numGuess) {
                System.out.println("Too low");
            }

            System.out.println("Guess again: ");
            input = readNum.nextInt();
            count++;
        }
        System.out.println("Got it right!");
        System.out.println("Number of Guesses: "+ count);
    }


}


