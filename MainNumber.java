class MainNumber
{
  public static void main(String args[])
   {
      Number n1=new Number();
      n1.add(10);
      Number n2=new Number();
      n2.add(20);
      System.out.println(n1.a);
      System.out.println(n2.a);
   }
}
class Number
{
   static int a=1;
   void add(int num)
   {
      a=a+num;
   }
}