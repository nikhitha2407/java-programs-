class AllAlpha
{
  public static void main(String args[])
   {
     String str=new String("Farmer jack realized that big yellow quilts were expensive.");
     int len=str.length();
     int[] b=new int[26];
     for(int i=0;i<26;i++)
      System.out.print(b[i]+" ");
     System.out.println(" ");
     for (int i=0;i<len;i++)
      {
        char ch=str.charAt(i);
        if(ch>='a' && ch<='z')
            {
            System.out.println((int)(ch-'a'));
            b[(int)(ch-'a')]=1; // we can use b[(int)(ch-'a')]+=1 for counting the occurence.
            }
        else if(ch>='A' && ch<='Z')
            {
            System.out.println((int)(ch-'A'));
            b[(int)(ch-'A')]=1;
            }
      }
    for(int i=0;i<26;i++)
      System.out.print(b[i]+" ");
   }
}