class A //As it is a super class though we ave given B() in class C it prints class A construcotr first
{  
  int a;
  /**A()     // code will not be executed if we remove the default constructor.so we have to define the default constructor even if we don't write anything to it inorder to run the code without any errors
  {    //but without giving any value creating a default constructor is not a good practice so initialise any value it can also be 0
     a=10;
     System.out.println("In class A constructor");
  }**/
  A(int val,int val2)
  {
    a=val+val2;
  }
  A(int val)     //2)
  {
    this(val,val*2);
    a=val;
  }
}
class B extends A
{
    int b;
    B()
    {              /**3**/
      super(50); // if we have the default constructor in the sub class then we should compulsory have the default constructor in the super class if we don't have in subclass there will be no 
      b=20;   //problem if we don't have default constructor in the super class, but it is preferred/recommended to take the default constructors in every class.
      System.out.println("In class B constructor");
    }
    /**B(int val)    //2)
    {
      super(val*2);   //super keyword is used in constructors inorder to call the constructor of the super class
      b=val;
      System.out.println("a is " +a+" b is "+b);
    }**/
}
class C
{
  public static void main(String args[])
  {
     /*** 1)//A s=new A();  //As parents cannot have all the rights of sons we cannot access b from class A(super class)
      //System.out.println(s.a+" "+s.b);
      A s=new A();
      System.out.println(s.a);  //constructors will not be inherited
      B s1=new B();
      System.out.println(s1.a+" "+s1.b);....***/  //2)
     /** B s1=new B(50);                                
      System.out.println(s1.a+" "+s1.b);**/
      B s1=new B();
      System.out.println(s1.a+" "+s1.b);
      
  }
}