
package mx.itson.towershanoi.business;

/**
 *
 * @author Kevin
 */
public class Process {
    
    public static void moveDisks(int disk, String source, String destination, String aux){
        
        if(disk == 0){
            return;
        }
        
        moveDisks(disk - 1, source, aux, destination);
        
        System.out.println("Move disk " + disk + " from " + source + " to " + destination);
        
        moveDisks(disk - 1, aux, destination, source);
        
    }

    public static int calculateMoves(int numberDisks){
        return (int) Math.pow(2, numberDisks) - 1;
    }
    
}
