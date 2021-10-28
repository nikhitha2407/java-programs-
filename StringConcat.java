class StringConcat
{
   public static void main(String args[]){
      String os = "Hello I am ";
      String ns = "Nikhitha.";
      str1=os+ns;
      System.out.println(os.concat(ns));  //There is not at all a single difference between + and concat to append the strings.
      System.out.println(ns.concat(os));
      System.out.println(os);
      System.out.println(ns);
      System.out.println(str1)
      os=os.concat(ns);
      System.out.println(os);
}
}