class StringLenDemo{
 public static void main(String args[]){
    String str1="Hello         World";
    String str2=new String("Hello         Again");
    String str11="Hello World";
    String str22=new String("HelloAgain");
    char ch[]={'h','e','l','l','o','.'}; 
    String str3=new String(ch);
    System.out.println("Varun".length());
    System.out.println(str1.length());
    System.out.println(str2.length());
    System.out.println(str11.length());
    System.out.println(str22.length());
    System.out.println(str3.length());
}
}