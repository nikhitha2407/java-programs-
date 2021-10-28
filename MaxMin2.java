class MaxMin2
{
	public static void main(String[] args) {
	    int max2=0;
	    int max1=0;
	    int min1=1000;
	    int min12=1000;
	    int[] a = new int[args.length];
       for (int i = 0; i < args.length; i++) 
       {
        a[i] = Integer.parseInt(args[i]);
	        if(max1<a[i])
			{
				max2 = max1;
				max1 = a[i];
			}
			else if (a[i] > max2 && a[i] != max1)
			{
			    max2 = a[i];
			}
	        if(min1>a[i])
	        {
	            min2=min1;
	            min1=a[i];
	        }
	        else if(a[i]<min2 && a[i] !=min1)
	        {
	            min2=a[i];
	        }
	        
	    }
	    System.out.println("Second smallest is: "+min2);
	    System.out.println("Second largest is: "+max2);
	    System.out.println("Largest is: "+max1);
	    System.out.println("Smallest is: "+min1);
	      
	}
}

