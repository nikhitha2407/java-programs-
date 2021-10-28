import java.util.Scanner; 
class StringPalindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str1=str1.toLowerCase(); //It is used inorder to avoid case sensitive issues. 
    int len=str1.length(); 
    int flag=0;               //String str="helle"; direct assignment also can be used in place of Scanner.
    for(int i=0;i<(len/2);i++)
    {
       if(str1.charAt(i)!= str1.charAt(len-i-1))  // instead of len()-i-1 we can also use (len-1)-i.
          {
             flag=1;
             break;
          }
    }
    if(flag==0)
       System.out.println(str1+" is a palindrome");
    else
       System.out.println(str1+" is not a palindrome");
}
}
