package string;

public class ReverseString {

    public static void main(String[] args) {
             reverseString("fuck fuck");
    }

    // Using String Builder and String Buffer
    public static void reverseString(String str){

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        reverseString2("new test");
    }

    // Using while loop
    public static void reverseString2(String str){

        int length = str.length();
        String revers = "";

        int start = 0 ;
        int end = str.length();
        char[] charArray = str.toCharArray();

        while (start<end){

            char temp = charArray[start];
            charArray[start]= charArray[end-1];
            charArray[end-1]=temp;
            start++;
            end--;
        }

        System.out.println(charArray);
    }


}
