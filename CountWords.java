import java.util.*;
class CountWords
{
   public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String str1=sc.nextLine();
         str1=str1.trim()   // It is used to trim the spaces that are present at the end and beginning of the sentence.
         int len=str1.length();
         int count=0;
         for(int i=0;i<len;i++)
          {
             if(str1.charAt(i)=='\s' && str1.charAt(i-1)!='\s')
                    count++;
          }
         System.out.println(count+1);
     }
}