import java.util.Scanner; 
class CharAt
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();  //once try this by giving spaces for half of the length for "This is half of niks"
      int len=str1.length(); 
      for(int i=0; i<len; i++)
      {
         System.out.print(str1.charAt(i)+".");
      }
      System.out.println(str1.charAt(0));
      System.out.println(str1.charAt(len/2));
      System.out.println(str1.charAt(len-1));
      String s = "Hello I am Nikhitha. I am very happy to work as a volunteer in swecha and to be the part of swecha.";
      System.out.println(s.charAt(6)); //Here space is not recognised as a character
   }
}