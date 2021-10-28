class FirstReturn
{
   int a=100;
   int getValue()
   {
      return a;
   }
   public static void main(String args[])
   {
     FirstReturn fob=new FirstReturn();
     System.out.println(fob.getValue());
   }
}