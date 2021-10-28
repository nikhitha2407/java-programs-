class MainC
{
  public static void main(String args[])
   {
      Constructor c1=new Constructor();
      Constructor c2=new Constructor(100);
      Constructor c3=new Constructor(100,200);
   }
}
class Constructor
{
 Constructor()
  {
     System.out.println("This is Default Constructor");
  } 
 Constructor(int a)
  {
     System.out.println("This is Constructor with one argument "+a);
  }
 Constructor(int a,int b)
  {
     System.out.println("This is Constructor with two arguments "+a+","+b);
  }
}

