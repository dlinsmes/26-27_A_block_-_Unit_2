import java.util.Scanner;
public class WhileLoops {
    public static void main(String [] args) {
        //warm up
        //ask user for heads or tails
        Scanner s = new Scanner(System.in);
        System.out.println("heads or tails?");
        String ans = s.nextLine();

        //flip coin
        String flip = "heads";
        if (Math.random() < 0.5)
            flip = "tails";

        //output whether user is right, wrong, or gave
        //invalid input
        if (ans.equals(flip))
            System.out.println("right");
        else if (( ans.equals("heads") && flip.equals("tails") ) || ( ans.equals("tails") && flip.equals("heads") ))
            System.out.println("wrong");
        else
            System.out.println("invalid input");

        //same
        if (ans.equals(flip))
            System.out.println("right");
        else if (!ans.equals("tails") && !ans.equals("heads"))
            System.out.println("invalid");
        else
            System.out.println("wrong");

        //same
        if (ans.equals("heads") || ans.equals("tails")) {
            if (ans.equals(flip))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
        else {
            System.out.println("invalid");
        }

        //loops
        //loops allow code to run repeatedly either
        //based on a number of iterations or a condition

        //while loops are like repeating if statements
        //-as long as the condition is true, the looped
        //code will continue to run

        int x = 0;

        while (x < 5) {
            System.out.println(x);

            //add 1 to the value of x
            x++;
        }

        //4 is the last number printed
        //-once x becomes 5, the condition is no longer true
        System.out.println("x outside and after loop: " + x);

        x = 0;
        while (x < 5) {
            x++;
            System.out.println(x);
            //this loop will begin printing at 1 and will
            //end on 5 bc x++ runs before the print statement
        }

        //a while loop is useful for when the number of times
        //to run cannot be predetermined
        //ex: count how many coin flips it takes to land
        //on heads 10 times

        int nHeads = 0;
        int totalFlips = 0;

        while (nHeads < 10) {
            totalFlips++;
            if (Math.random() < .5 )
                nHeads++;
        }

        //output outside the loop for just the final count
        System.out.println("it took " + totalFlips + " flips to land on 10 heads");
    }
}
