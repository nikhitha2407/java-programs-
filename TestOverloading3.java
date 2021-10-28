class TestOverloading2
{
  public static void main(String args[])
  {
      System.out.println(Divi.divide(17,2.0));
      System.out.println(Divi.divide(10.4,2);
  }
}
class Divi
{                    //using static means no need to create an object specifically
   Static int divide(int a,int b) //i.e., we can call it by using class name itself.
   {
      return (a/b);
   }
   Static double divide(double a, double b)
   {
       return (a/b);
   }
}