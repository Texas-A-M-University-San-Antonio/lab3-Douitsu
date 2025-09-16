/**
 * Name: [Gloria Merino]
 * Date: [9-14-2025]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
// This code is a short java program that uses math.pow to calculate volume and surface area of a cube
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner; //allows user input 

public class InClass3_Gloria_Merino
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
        Scanner input = new Scanner(System.in); // must declare user input

        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Enter side length of the cube: " );
        // Step 2: Read the user's input and store it in a variable.
        double length = input.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        double volume = Math.pow(length, 3);//had it set to ^length, but V=a^3 not a^a
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        double surfaceArea = 6 * Math.pow(length,2);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method

        // Step 5: Print the volume and surface area in clear sentences.
        System.out.print("A cube with the length of "+length+" has the volume of "+volume+" and a surface area of "+surfaceArea+".");
    }
}