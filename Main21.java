class Main21
{
   public static void main(String args[])
    {
       Number n1=new Number();
       int res=n1.addNo(10);
       System.out.println(res);
    }
}
class Number
{
   int no=20;
   int addNo(int no)
   {
     no=no+no;
     return(no);
   }
}

/***class Main21
{
   public static void main(String args[])
    {
       Number n1=new Number();
       int res=n1.addNo(10);
       System.out.println(res);
    }
}
class Number
{
   int no=20;
   int addNo(int no)   //while returning we return local variable so that ans will not be updated as in upper code so we use (this) keyword when ever there occurs a clash b/w local and
   {                        //global variable.
     this.no=this.no+no;
     return(no);
   }
}***/