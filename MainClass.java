class MainClass
{
   public static void main(String args[])
    {
       subClass sc=new subClass();
       sc.disp();
       subClass1 sc1=new subClass1();   
       sc1.disp1();
       subClass2 sc2=new subClass2();
       sc2.disp2();
    }
}
class subClass
{
  String msg="Hello Welcome to our class";
  void disp()
  {
    System.out.println(msg); 
    subClass1 sc1=new subClass1();  //Mainclass-->subClass-->subClass1
    sc1.disp1();                   //It is a local variable so if we create the obj for it in subClass and try to call it in MainClass it will be an error as it is a local variable.
  }         
}
class subClass1
{
  String msg="Hello We heartly Welcome you all to GLUG";
  void disp1()
  {
    System.out.println(msg); 
  }
}
class subClass2
{
  String msg="SWECHA";
  void disp2()
  {
    System.out.println(msg); 
  }
}