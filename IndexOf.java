class IndexOf{
  public static void main(String args[]){
   String str1="Hello";
   System.out.println(str1.indexOf('n'));
   System.out.println(str1.indexOf('e'));
   String str2="Hello, Welcome to GLUG";
   System.out.println(str2.indexOf('o'));
   System.out.println(str2.indexOf('o',str2.indexOf('o')+1)); // we can use this to check the index of a letter after the mentioned letter index.
   System.out.println(str2.lastIndexOf('o'));  //we can use this to calculate the index of the last repition of the digit
   System.out.println(str2.indexOf('o',7)); //We can use this method for checking the reoccurence of the letter. 
   System.out.println(str2.indexOf("to")); //returns the index of the last letter of the word.
   System.out.println(str2.indexOf('W'));
}
}
