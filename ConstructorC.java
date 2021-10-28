class A
{
   int val=0;
}
class B extends A
{
  int val=0;
  void set(int val)
  {
     val=val+10;   //takes which is locally available
     this.val=val+20; //takes the variable which is globally available
     super.val=val*2;
     System.out.println("arg val is " +val+" B val is "+this.val+" A val is "+super.val);
  }
}
class ConstructorC
{
   public static void main(String args[])
   {
        B obj=new B();
        obj.set(20);
   }
}

