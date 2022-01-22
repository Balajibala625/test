class StringBufferProgram
{
		public static void main(String args[])
		{
			StringBuffer obj = new StringBuffer("Welcome");
			
			System.out.println(obj.append("Java"));//WelcomeJava
			System.out.println(obj.insert(2,"hi")); //Wehicome
			System.out.println(obj.delete(2,4));//Wecome
			System.out.println(obj.reverse());//emocleW
			System.out.println(obj.replace(0,2,"How"));//Howlcome
		}
	
}