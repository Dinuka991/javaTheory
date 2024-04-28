package org.example.string;

public class DemoString {
    public static void main(String[] args) {

        // Create a string

        String str = "Hello";
        String str1 = new String("Hello");

        System.out.println(str);
        System.out.println(str1);

        // String Concatenation
        String str2 = "Hello";
        String str3 =  str.concat(str2);
        String str4 = str + str2;


        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb.toString());


        //StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append("World");
        System.out.println(sbf.toString());

    }
}
