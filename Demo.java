class Demo
{
  void disp(int a, double b)
  {
    System.out.println("Method A");
  }
  void disp(double a, double b)
  {
    System.out.println("Method B");
  }
  public static void main(String args[])
  {
       Demo obj=new Demo();
       obj.disp(100.0,20);
       obj.disp(100,20);
       obj.disp(100,20.0);
  }
}
/**TYPE PROMOTION: when a data type of smaller size is promoted to the data type of bigger size than this is called type promotion
for example: byte data type can be promoted to short, a short datatype can be promoted to int,long, double etc...(but automatically java doesnot convert the double to int data type**/
