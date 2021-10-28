import java.util.Scanner; 
class CharAtCount
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine(); 
      int len=str1.length(); 
      int count=0;
      int ncount=0;
      int lcount=0;
      int ucount=0;
      for(int i=0; i<len; i++)
      {
        if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
            ncount=ncount+1; 
        else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
            lcount=lcount+1;
        else if(str1.charAt(i)>='A' && str1.charAt(i)<='Z')    
            ucount=ucount+1;
        else
            count=count+1;
      }
      System.out.println("No.of digits are: "+ncount);
      System.out.println("No.of lower case letters are: "+lcount);
      System.out.println("No.of upper case letters are: "+ucount);
      System.out.println("No.of spaces between words are: "+count);
   }
}