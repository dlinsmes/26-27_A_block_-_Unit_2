import java.util.Scanner;
public class VariableScope {

    public static void main(String [] args) {
        //warm up
        //prompt for two numbers and a word
        Scanner s = new Scanner(System.in);
        System.out.println("give me number");
        int num1 = s.nextInt();
        System.out.println("give me more number");
        int num2 = s.nextInt();
        s.nextLine();
        System.out.println("word?");
        String word = s.nextLine();

        int small = num1;
        int big = num2;

        if (num2 < num1) {
            small = num2;
            big = num1;
        }
        int r = 0;

        //-if word size is smaller than the
        if (word.length() < small) {
            //smaller num, generate a random even number [2,20]
            System.out.println("random even");

            //generate all ints [1,10], then multiply by 2
            r = (int)(Math.random() * 10 + 1) * 2;
        }
            //-if word size is bigger than the
        else if (word.length() > big) {
            //bigger num, generate a random odd number [1,9]
            System.out.println("random odd");
            //first generate an even number [0,8] then add 1
            //for evens [0,8], generate all ints [0,4], multiply by 2 THEN add 1
            r = (int)(Math.random()*5) * 2 + 1;
        }
        //-if word size is between (inclusive) the two nums
        else {
            //generate a random negative number
            System.out.println("random negative");
            r = -(int)(Math.random() * 63892);
        }
        //-output the generated number
        System.out.println(r);

        if (r < 10) {

            int a = 7;
            System.out.println(a);
        }
        //variable scope - where a variable is declared
        //is the location that you can access that variable
        //-since a was declared in the if statement, it can be
        //modified and accessed in that if statement, but NOT outside of it

        //System.out.println(a);
        else {

            //variable a does not yet exist in the scope of this else statement
            //System.out.println(a);

            //this ELSE can have a DIFFERENT variable a, but it is not the same
            //as the one in the IF statement
            int a = 12;
            System.out.println(a);

            //since the r variable was declared in main, it can be changed/accessed
            //anywhere within main, include if/else
            r = 12;
        }

        //can declare a variable without assigning a value
        int c;
        if (r == 7) {
            c = 2;
        }
        //c is not guaranteed to get assigned a value at this point
//        System.out.println(c);
    }
}
