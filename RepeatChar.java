import java.util.Scanner;
class RepeatChar
  {
     public static void main(String args[])
        {
	Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
	char ch=sc.nextLine().charAt(0);
	if(st1.indexOf(ch)==-1)
	  System.out.println("Character is Not Found");
	else if(st1.indexOf(ch,st1.indexOf(ch)+1)==-1)  // It will try to search for the given character from the next position of the first occurrence of that character.
	  System.out.println("Character Occurred Only Once at"+st1.indexOf(ch));
	else
	  System.out.println("Character Occurred More than Once at "+st1.indexOf(ch) +" and also at "+(st1.indexOf(ch,st1.indexOf(ch)+1))); //It shows only 2 pos but not all positions.
        }
  }

