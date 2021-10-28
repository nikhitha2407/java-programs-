class CompareTo{
  public static void main(String args[]){
     String s1="Hello";
    String s2="hello";
    String s3=new String("Hello"); //Here ascii values will get compared 
    String s4=new String("hello");
    System.out.println(s1.compareTo(s2));
    System.out.println(s4.compareTo(s3));
    System.out.println(s4.compareToIgnoreCase(s3));


}
}