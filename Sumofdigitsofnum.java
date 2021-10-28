class Sumofdigitsofnum
{
	public static void main(String[] args) {
	    int n=Integer.parseInt(args[0]); //To compile a program we use file name(javac Sumofdigitsofnum.java) 
	    int sum=0;                      //To run the program we use class name(java Sumofdigitsofnum or java Sumofdigitsofnum.java)
	    int r=0;
	    while(n!=0){
	        r=n%10;
	        sum+=r;
	        n=n/10;
	    }
	     System.out.println(sum);
	}
}

