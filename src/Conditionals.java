import java.util.Scanner;

public class Conditionals {

    public static void main(String [] args) {

        //simulate a coin flip and print result
        //of heads or tails

        int randomNum = (int)(Math.random() * 2 ) + 1;
        System.out.println(randomNum);

        //conditional statements (if-statements)
        //when a boolean expression is true, trigger
        //particular code to run
        if (randomNum == 1) {
            //this code will only run when the condition
            //is true
            System.out.println("heads");
        }
        //conditional statements can have an optional
        //else statement that will run when the condition
        //in the IF is false
        else {
            System.out.println("tails");
        }

        //prompt the user for 3 nums, output the biggest

        //s is just a variable name - name your scanner
        //whatever you want
        Scanner s = new Scanner(System.in);

        System.out.println("enter 3 numbers");
        System.out.println("enter num 1");
        int a = s.nextInt();

        System.out.println("enter num 2");
        int b = s.nextInt();

        System.out.println("enter num 3");
        int c = s.nextInt();

        int max = 0;
        //check if a is the biggest
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("biggest is " + max);


        if (a > b && a > c) {
            max = a;
        }

        if (b > a && b > c) {
            max = b;
        }
        //else will only connect to the immediately preceding IF
        //so max will ALWAYS get set to either b or c
        else {
            max = c;
        }
        System.out.println("max is " + max);


        if (a > b && a > c) {
            max = a;
        }
        //else if allows multiple conditional branches to check
        //-multiple else if branches can be added
        //but only the first conditional branch that's true will run code
        //and no other following branches will be checked or run
        else if (b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }
        System.out.println("max is " + max);

        //when code to run in an if/else/else if is only one line,
        //then curly braces aren't necessary
        if (a > b && a > c)
            System.out.println("a is biggest");

        //this line is NOT part of the if statement and will
        //always run
        System.out.println("blah");

        //switch to string input
        s.nextLine();

        String realPW = "password123";
        System.out.println("what is the password?");
        String uPW = s.nextLine();

        //output one of multiple messages depending on the input
        //-use multiple else if (and maybe an else at the end)

        if(realPW.equals(uPW))
            System.out.println("wow good job you're so smart congrats?");
        //a string's length is how many characters long it is
        else if (uPW.length() == 0)
            System.out.println("you didn't type anything you dumdum");
        else if (uPW.length() == realPW.length())
            System.out.println("nice try but still WRONG");
        else //runs when the input password has wrong length
            System.out.println("NO");

        //prompt for a number between 10 and 20
        //give feedback for too low, too high, in range
        System.out.println("give me number between 10 and 20");
        int num = s.nextInt();

        //nested conditionals - if statements can go in other if statements
        //(they can also go in else and else if)

        if (num > 10) {
            //the inner if statement will only check when the outer
            //condition is true
            if ( num < 20) {
                System.out.println("in range");
            }
            else {
                System.out.println("too high");
            }
        }
        else {
            System.out.println("too low");
        }


    }
}
