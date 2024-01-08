import java.sql.SQLOutput;
import java.util.Scanner;

public class ClimbingStairs {

    /*
    The "Climbing Stairs" problem is a classic dynamic programming problem
    where you are given a staircase with n steps,
    and you can climb either 1 step or 2 steps at a time.
    The task is to count the number of distinct ways to reach the top of the staircase.
     */

    // if stair = 1, then there is only one way
    // if stair = 2, then there is 2 way ( 1 step + 1 step, 2 step)
    // if stair = 3, then there is 3 way (1. stair + 2 step, 2. stair + 1 step)
    // it is actually a Fibonacci serie

    public static int climbingStairs(int number){

        if (number < 1){
            return 0;
        }
        else if(number == 1){
            return 1;
        }
        else if (number == 2){
            return 2;
        }
        else {
            number = climbingStairs(number-1)+climbingStairs(number-2);
        }
        return number;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int userInput;

        while (true){
            System.out.print("Enter number: ");
            userInput = scn.nextInt();
            System.out.println(climbingStairs(userInput));
        }
    }
}
