class StringTest
{
public static void main(String[] args)
{
String s1 = new String("Welcome");
String s2 = "   to chennai";
//charAt()
System.out.println(s1.charAt(3));
//concat()
System.out.println(s1.concat(s2));
//startsWith()
System.out.println(s1.startsWith("W"));
//endsWith()
System.out.println(s1.endsWith("e"));
//equals()
System.out.println(s1.equals(s2));
//indexOf()
System.out.println(s1.indexOf('e'));
//lastindexOf()
System.out.println(s1.lastIndexOf('e'));
//length()
System.out.println(s1.length());
//toUpperCase
System.out.println(s1.toUpperCase());
//toLowerCase
System.out.println(s1.toLowerCase());
//trim
System.out.println(s2.trim());
//substring
System.out.println(s1.substring(3));
//replace()
System.out.println(s1.replace("e","c"));
//replaceAll()
System.out.println(s1.replaceAll("el","ic"));

}
}
