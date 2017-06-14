package com.JavaMavenExamples;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        final String str = "HelloIam";
        App appObject = new App();
        System.out.println("The reverse string of \"" + str + "\" is \"" +
                appObject.reverseString(str) + "\"");
    }

    public String reverseString(String src) {
        return new StringBuilder(src).reverse().toString();
    }


}
