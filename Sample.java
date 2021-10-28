class Sample
{
  int disp(int X)
  {
     return x;
  }
  double disp(int y)
  {
      return y;
  }
  public static void main(String args[])
  {
    Sample s=new Sample();
    System.out.println("Value of x:"+s.disp(5));
    System.out.println("Value of y:"+s.disp(6.5));
  }