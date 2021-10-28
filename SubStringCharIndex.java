import java.util.Scanner;
class SubStringCharIndex
  {
     public static void main(String args[])
        {
	Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
	char ch=sc.nextLine().charAt(0);
	System.out.println(st1.indexOf(ch));
        }
  }
