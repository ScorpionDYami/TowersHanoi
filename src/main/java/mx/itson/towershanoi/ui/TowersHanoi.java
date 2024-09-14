
package mx.itson.towershanoi.ui;

import java.util.Scanner;
import static mx.itson.towershanoi.business.Process.moveDisks;
import static mx.itson.towershanoi.business.Process.calculateMoves;;

/**
 *
 * @author Kevin
 */
public class TowersHanoi {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Towers of Hanoi");
        int numberDisks = 0;
        boolean validEntry = true;
        
        while (validEntry) {
            try {
                System.out.print("Enter the number of disks: ");
                numberDisks = input.nextInt();
                if (numberDisks > 0) {
                    System.out.println("");
                    moveDisks(numberDisks, "A", "C", "B");
                    System.out.println("\nMinimum number of movements: " + calculateMoves(numberDisks));;
                    validEntry = false;
                }
                

            } catch (Exception e) {
                input.next();
                System.out.println("Error: " + e.getMessage());
            }
        }
        
    }
    
}
