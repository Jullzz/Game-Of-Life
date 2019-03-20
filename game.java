import java.util.*;
public class game
{
   public static void main(String[]args) throws Exception
   {
      Scanner k = new Scanner(System.in);
      Random rand = new Random();
      int a = k.nextInt()-1;
      int b = k.nextInt()-1;
      int c=1;
      life[][] game = new life[b][a];
      for(int i =0; i<b; i++)
      {
         for(int j =0; j<a; j++)
         {
            if(rand.nextInt(10) ==5)
            {
               game[j][i] = new life(true, j, i);
            }
            else
               game[j][i] = new life(false, j,i);
         }
      }



      while(true)
      {
         c=0;
         System.out.print((char)12);
         for(int i =0; i<b; i++)
         {
            for(int j =0; j<a; j++)
            {
               System.out.print(game[j][i].show());
            }
            System.out.println();
         }

         for(int i =0; i<b; i++)
         {
            for(int j =0; j<a; j++)
            {
               game[j][i].check(game);
            }
         }
         for(int i =0; i<b; i++)
         {
            for(int j =0; j<a; j++)
            {
               game[j][i].changeLife();
               if(game[j][i].checkLife())
                  c++;
            }
         }
         if (c==0)
            return;
         Thread.sleep(1000);
      }
   }
}
