/**class First
{
   int a=10;
   void disp()
   {
      System.out.println("Value of a is: "+a);
   }
   public static void main(String args[])   // we cannot access the variables or member functions which are present outside the static part directly.
   {
     System.out.println(a);
     disp();
   }
}**/

class First
{
   int a=10;
   void update(int value)
   {
     a=value;
   }
   void disp()
   {
      System.out.println("Value of a is: "+a);
   }
   public static void main(String args[]) 
   {
     First fob=new First();     //System.out.println(fob.a);  //fob.disp();
     fob.disp();
     System.out.println("Initial value is: "+fob.a);
     fob.update(20);
     fob.disp();
   }
}