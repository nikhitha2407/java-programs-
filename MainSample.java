/**class MainSample
{
    public static void main(String args[])
     {
       Sample a1=new Sample();
     }
}
class Sample
{
  Sample()
  {
     this("Java"); //calls overload constructor
     System.out.println("Default constructor ");
  }
  Sample(String str)
  {
   this();
   System.out.println("one argument constructor "+str);
  }
}**/

/*******************************************************************************************************************************************************************************************
class MainSample
{
    public static void main(String args[])
     {
       Sample a1=new Sample();
       Sample a2=new Sample("java");
     }                                         // outputs: Default constructor(a1), Default constructor(a2), one argument constructor java
}
class Sample
{
  Sample()
  {
     System.out.println("Default constructor ");
  }
  Sample(String str)
  {
   this();
   System.out.println("one argument constructor "+str);
  }
}
*******************************************************************************************************************************************************************************************/
class MainSample
{
    public static void main(String args[])
     {
       Sample a2=new Sample("java",10);
     } 
}                         //This function call must be a single statement and should not form a loop                                       
class Sample
{
  Sample()
  {
     System.out.println("Default constructor ");
  }
  Sample(String str)
  {
   this();
   System.out.println("one argument constructor "+str);
  }
  Sample(String str,int no)
  {
   this(str);
   System.out.println("Two arguments constructor "+no);
  }
}
