class A
{
  int m,n;
  void display1()
  {
    System.out.println("m and n are:"+m" "+n);
  }
}
class B extends A
{
  int c;
  //take continuation code from any body or from ppt there is so much code in between
}    //only children will have the complete access to the parent's property but viceversa doesn't happen.
class InheritanceDemo
{
  public static void main(String args[])
  {
    B s2=new B();
    s2.m=7;
    s2.n=8;
    s2.c=9;
    s2.display1();
    s2.display2();
    System.out.println("Sum of m,n and c in object B is: " );
    s2.sum();
  }
}