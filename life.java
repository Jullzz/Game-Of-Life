public class life
{
   private boolean alive;
   private int around;
   private int ycor;
   private int xcor;

   public life(boolean alive, int xcor, int ycor)
   {
      this.alive = alive;
      this.xcor = xcor;
      this.ycor = ycor;
      around=0;
   }
   public boolean checkLife()
   {
      return alive;
   }
   public char show()
   {
      if(alive)
         return 'X';
      return 0;
   }
   public void changeLife()
   {
      if(around ==3)
         alive = true;
      else if(around <2 || around >3)
         alive= false;
   }
   public void check(life[][] life)
   {
      around =0;
      if(life[((xcor+1)%life[0].length+life[0].length)%life[0].length][((ycor+1)%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[((xcor+1)%life[0].length+life[0].length)%life[0].length][(ycor%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[((xcor+1)%life[0].length+life[0].length)%life[0].length][((ycor-1)%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[(xcor%life[0].length+life[0].length)%life[0].length][((ycor+1)%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[(xcor%life[0].length+life[0].length)%life[0].length][((ycor-1)%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[((xcor-1)%life[0].length+life[0].length)%life[0].length][((ycor+1)%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[((xcor-1)%life[0].length+life[0].length)%life[0].length][(ycor%life.length+life.length)%life.length].checkLife())
         {around++;}
      if(life[((xcor-1)%life[0].length+life[0].length)%life[0].length][((ycor-1)%life.length+life.length)%life.length].checkLife())
         {around++;}
   }
}
