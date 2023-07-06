import java.util.Scanner;
import java.io.*;
/**
 * Program asks user for 2 variables:
 *  - speed (mph)
 *  - time (hours)
 * 
 * Then, calculates distance (d = speed * time)
 * 
 * Display distance traveled at each increment (hour)
 */

public class DistTrav {
    public static void main(String[] args) throws IOException {
        //Initialize Variables
        int mph = -1,
            time = 0;

        String filename;

        // Create scanner for keyboard input
        Scanner scan = new Scanner(System.in);

        // Gather user data
        while (!(mph >= 0)) {
        System.out.println("Please enter the speed in mph:");
        mph = scan.nextInt();
    }
        while (!(time >= 1)) {
        System.out.println("Please enter the time traveled in hours:");
        time = scan.nextInt();
        }
        
        filename = "Data.txt";

        // Create file
        File file = new File(filename);
        PrintWriter output = new PrintWriter(file);


        // Create table for the user's viewing
        output.println("Hour\tDistance Traveled");
        output.println("-------------------------");
        for (int i = 1; i <= time; i++) {
            output.println(i + "\t" + (i * mph));
        }
        scan.close();
        output.close();
    }
}
