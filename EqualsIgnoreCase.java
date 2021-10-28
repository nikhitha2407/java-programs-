class EqualsIgnoreCase{
 public static void main(String args[]){
    String s1="Hello";
    String s2="hello";
    String s3=new String("Hello");
    String s4=new String("hello");
    System.out.println(s1==s2);
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s3==s4);
    System.out.println(s3.equalsIgnoreCase(s4));
}
}