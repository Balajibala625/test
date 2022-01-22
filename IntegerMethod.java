class IntegerMethod
{  
    public static void main(String args[]) 
	{  
      	  Integer a = 35;  
          Integer b = -45;   
		  Integer c = 10;
		  Integer d = 20;
          System.out.println("Instance Value                :"+a.valueOf(2));   
		  System.out.println("Compare the Values            :"+c.compareTo(d));
		  System.out.println("Equals the value true or false:"+c.equals(d)); 
		  System.out.println("Find the sign                 :"+Integer.signum(-888));
		  System.out.println("String Representation         :"+Integer.toUnsignedString(-2));
    } 
}  