import java.util.Scanner;
class StringChangeCase
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine();
     System.out.println("Original String: "+str1);
     System.out.println("Upper case: "+str1.toUpperCase()); //Here it will we updated but the original string will not be changed it remains the same as the original one, For that we can 
     System.out.println("Lower case: "+str1.toLowerCase()); //store the updated value in the new variable  or again assigning to the old one so that it gets updated as the new one
    }
}