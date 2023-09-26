import java.util.Random;

public class Randomclass {
    public static void main(String[] args) {
      
        Random random = new Random();

    
        int[] counts = new int[6]; 


        for (int i = 0; i < 1000; i++) {
            
            int roll = random.nextInt(6) + 1;

   
            counts[roll - 1]++;
        }


        for (int side = 1; side <= 6; side++) {
            System.out.println("Side " + side + ": " + counts[side - 1] + " gange");
        }
    }
}
