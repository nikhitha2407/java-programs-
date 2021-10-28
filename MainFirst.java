class MainFirst
{
   public static void main(String args[])
   {
      First fob=new First();
      System.out.println(fob.geta());
      //fob.disp();             
      //System.out.println(fob.a);     //here a is private so fob.a cannot be accessed     
      System.out.println(fob.sum());
   }
}
class First
{
  private int a=10;   
  public int b=20;
  int sum()
  {
     return a+b;
  }
  void disp()
  {
     System.out.println(a);
  }
  int geta()
  {
    return a;
  }
}