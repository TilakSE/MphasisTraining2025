package com.mphasis.Strings;

/**
 * Hello world!
 *
 */
public class StringMemory
{
    public static void main( String[] args )
    {
    	 String s1="Hello";
         String s2="Hello";
         String s3=new String("Hello");
         String s4=new String("Hello");
         System.out.println(s1.hashCode()); //Based on value
         System.out.println(s2.hashCode());
         System.out.println(s3.hashCode());
         System.out.println(s4.hashCode());
         System.out.println(s1==s2);
         System.out.println(s1==s3);
         System.out.println(s3==s4);
         System.out.println(System.identityHashCode(s1)); // Based on address
         System.out.println(System.identityHashCode(s2));
         System.out.println(System.identityHashCode(s3));
         System.out.println(System.identityHashCode(s4));
         s1=s1.concat(" World");
         System.out.println(s1.hashCode());
         System.out.println(s1==s2);
         System.out.println(System.identityHashCode(s1));
    }
}
