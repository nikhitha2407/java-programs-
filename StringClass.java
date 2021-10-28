import java.util.Scanner;
class StringClass
{
    public static void main(String args[])
    {
      String str1="Direct Assignment";   //Here total string is stored in the single space only. 
      char[] ch={'c','h','a','r'};
      String str2=new String(ch);
      String str3=new String("Through Object");  // Here the string stores in the form of a stack so comes there comes the difference in the memory.
      Scanner sc=new Scanner(System.in);
      String str4=sc.nextLine();
      System.out.println(str1);
      System.out.println(str2);
      System.out.println(str3);
      System.out.println(str4);
    }
}