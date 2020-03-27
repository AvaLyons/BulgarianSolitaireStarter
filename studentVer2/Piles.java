import java.util.ArrayList;
import java.util.Random;
/**
 * A class that plays Bulgarian Solitare. 
 * Version 1: Implement the playRound and toString methods.
 */
public class Piles
{
   private ArrayList<Integer> piles;
   private int add;
   /**
      Create a set of piles with a known (non-random) configuration for testing.
      @param pileSizes an array of numbers whose sum is 45
   */
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(s);
   }

   /**
    * Return the string representation of the piles.
    * @return the string representation of the piles.
    */
   public String toString()
   {
       String data = "";
       for (int pile: piles)
       {
           data += pile + " ";
        }
       return data;
   }

   /**
      Play one round of the game.
   */
   public void playRound()
   {
       piles.add(5+add);
              add++;
       for (int i = 0; i<piles.size(); i++)
       { 
         piles.set(i,piles.get(i) - 1);
         if (piles.get(i).equals(0))
         {
             piles.remove(i);
             i--;
            }
         
        }
       
   }
}
