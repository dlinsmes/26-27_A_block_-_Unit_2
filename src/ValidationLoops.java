import java.util.Scanner;

public class ValidationLoops {
    public static void main(String [] args) {

        //loops can go in other loops - nested loops

        int reps = 0;
        int tenCount = 0;
        int tenCount2 = 0;

        while (reps < 1000) {


            //warm up
            //-declare a count var, initialize t0 0
            //-while loop that runs a random number of times [1,10]
            //-in the loop, add 1 to count
            //print final count value
            int count = 0;

            //every time this condition is checked to determine whether
            //the inner loop should continue, a NEW random number gets
            //generated
            while (count < (int) (Math.random() * 10 + 1)) {
                count++;
            }
            //System.out.println(count);
            //keep track of how many times count has reached 10
            if (count == 10) {
                tenCount++;
            }

            //if you need a loop to run a random number of times with
            //equal distributions, save the random number to a variable
            //first
            int rand = (int)(Math.random() * 10 + 1);
            count = 0;
            while (count < rand) {
                count++;
            }
            if (count == 10) {
                tenCount2++;
            }

            reps++;
            //if this line is missing and reps always stays at 0
            //then the condition of the outer loop is always true
            //and the loop will run infinitely (BAD)
        }

        System.out.println(tenCount + " 10s");
        System.out.println(tenCount2 + " 10s");

        //infinite loops are bad and happen when the
        //loop condition is always true
        int x = 0;
//        while (x >= 0) {
//            System.out.println(x);
//            x++;
//        }
//        System.out.println("this will never get reached");

        //loops can also have conditions that are never true
        //to begin with so they will run 0 times
        //-won't crash and not necessarily a problem - just be
        //mindful
        while (x > 0) {
            System.out.println(x);
            x++;
        }
        System.out.println("after loop");

        //validation loop - ask the user for input and validate that
        //their input is one of the desired options

        //ask the user for the numbers 1 or 2 or 3. When they do so,
        //tell them good job, otherwise keep asking for an input of 1 or 2 or 3
        Scanner s = new Scanner(System.in);
        System.out.println("type 1 or 2 or 3");
        int num = s.nextInt();
        //this loop should run whenever num is NOT 1 or 2 or 3
        //all valid:
        // !(num <= && num >= 1)
        // (num > 3 || num < 1)
        // !(num == 1 || num == 2 || num == 3)
        while (num != 1 && num != 2 && num != 3) {
            System.out.println("invalid. try again");
            System.out.println("type 1 or 2 or 3");
            num = s.nextInt();
        }
        //by this point of the program, we know num is a valid value
        System.out.println("good job");

        s.nextLine();
        //ask for apple or banana
        System.out.println("apple or banana?");
        String word = s.nextLine();
        //same as !word.equals("banana") && !word.equals("apple")
        while (!(word.equals("banana") || word.equals("apple"))) {
            System.out.println("invalid. try again.");
            System.out.println("apple or banana?");
            word = s.nextLine();
        }
        System.out.println("good job");
    }
}
